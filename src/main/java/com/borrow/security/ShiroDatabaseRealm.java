package com.borrow.security;

import com.borrow.entity.UserInfo;
import com.borrow.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;


import javax.annotation.Resource;

/**
 * Shiro Realm
 * @author guhao
 *
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
        UserInfo loginUser = userService.findByUserName(username);
        if (loginUser != null) {  
            SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();  
            /*for (Role role : loginUser.getRoles()) {
            	String roleName = String.valueOf(role.getId()); 
            	authInfo.addRole(roleName);
            	authInfo.addStringPermissions(role.getStringPermissions());  
            }  */
            return authInfo; 
        }
		return null;
	}

	/**
	 * AuthenticationInfo represents a Subject's (aka user's) stored account
	 * information relevant to the authentication/log-in process only.
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		/**
		 * Constructor that takes in a single 'primary' principal of the
		 * account, its corresponding hashed credentials, the salt used to hash
		 * the credentials, and the name of the realm to associate with the
		 * principals. This is a convenience constructor and will construct a
		 * PrincipalCollection based on the principal and realmName argument.
		 * 
		 * 
		 * Parameters:
		 * 
		 * principal - the 'primary' principal associated with the specified
		 * realm. hashedCredentials - the hashed credentials that verify the
		 * given principal. credentialsSalt - the salt used when hashing the
		 * given hashedCredentials realmName - the realm from where the
		 * principal and credentials were acquired.
		 */
		UsernamePasswordToken usernamePasswordToke = (UsernamePasswordToken) token;

		String username = usernamePasswordToke.getUsername();
		String password = String.valueOf(usernamePasswordToke.getPassword());
		UserInfo loginUser = userService.findByUserName(username);
		
		if(loginUser==null){
			throw new UnknownAccountException("用户不存在");
		}
		/*if(!password.equals(loginUser.getPassWord())){
			throw new IncorrectCredentialsException("密码不正确");
		}*/
		
		return new SimpleAuthenticationInfo(loginUser.getUserName(),
				loginUser.getPassWord(),
				ByteSource.Util.bytes(loginUser.getUserName()), getName());
	}

}