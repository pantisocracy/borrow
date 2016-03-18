package com.borrow.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lbc on 16/3/18.
 */
public interface BaseMapper<T,ID extends Serializable> {

    List<T> findAll();

    Page<T> findAllByPage(@Param("pageable") Pageable pageable);
}
