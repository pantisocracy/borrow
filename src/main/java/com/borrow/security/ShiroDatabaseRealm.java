package com.borrow.security;

import com.borrow.entity.Users;
import com.borrow.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;


import javax.annotation.Resource;

/**
 * Shiro Realm
 *
 * @author guhao
 */
public class ShiroDatabaseRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    /**
     * AuthorizationInfo(Subject's roles and permissions)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.fromRealm(getName()).iterator().next();
        Users loginUser = userService.findByUserName(username);
        if (loginUser != null) {
            SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();  
            /*for (Role role : loginUser.getRoles()) {
                String roleName = String.valueOf(role.getId());
            	authInfo.addRole(roleName);
            	authInfo.addStringPermissions(role.getStringPermissions());  
            }*/
            return authInfo;
        }
        return null;
    }

    /**
     * AuthenticationInfo represents a Subject's (aka user's) stored account
     * information relevant to the authentication/log-in process only.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token){
        UsernamePasswordToken usernamePasswordToke = (UsernamePasswordToken) token;
        String username = usernamePasswordToke.getUsername();
        String password = String.valueOf(usernamePasswordToke.getPassword());
        Users loginUser = userService.findByUserName(username);
        if (loginUser == null) {
            throw new UnknownAccountException("用户不存在");
        }
		if(!password.equals(loginUser.getPassWord())){
			throw new IncorrectCredentialsException("密码不正确");
		}
        return new SimpleAuthenticationInfo(loginUser.getUserName(),loginUser.getPassWord(),ByteSource.Util.bytes(loginUser.getUserName()), getName());
    }

}