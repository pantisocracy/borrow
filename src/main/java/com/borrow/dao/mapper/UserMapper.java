package com.borrow.dao.mapper;

import com.borrow.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Lipengfei on 2015/6/26.
 */
public interface UserMapper {

    void save(User user);

    List<User> findAll();

    Page<User> findAllByPage(@Param("pageable") Pageable pageable);

}
