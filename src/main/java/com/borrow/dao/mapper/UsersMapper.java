package com.borrow.dao.mapper;

import com.borrow.entity.Users;
import com.borrow.util.MyMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UsersMapper extends MyMapper<Users>{
    @Select({
            "select",
            "id, user_name, sex, age, mobile, school_id, identity, apply_account, add_time, ",
            "update_time, type, pass_word, role_id",
            "from users",
            "where user_name = #{userName,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    Users findByUserName(String userName);
}