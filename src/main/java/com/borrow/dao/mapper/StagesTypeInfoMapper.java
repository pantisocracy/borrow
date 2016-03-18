package com.borrow.dao.mapper;

import com.borrow.entity.StagesTypeInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StagesTypeInfoMapper extends BaseMapper<StagesTypeInfo,Integer>{
    @Delete({
        "delete from stages_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into stages_type (id, stag_name, ",
        "interest)",
        "values (#{id,jdbcType=INTEGER}, #{stagName,jdbcType=VARCHAR}, ",
        "#{interest,jdbcType=REAL})"
    })
    int insert(StagesTypeInfo record);

    int insertSelective(StagesTypeInfo record);

    @Select({
        "select",
        "id, stag_name, interest",
        "from stages_type",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    StagesTypeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StagesTypeInfo record);

    @Update({
        "update stages_type",
        "set stag_name = #{stagName,jdbcType=VARCHAR},",
          "interest = #{interest,jdbcType=REAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(StagesTypeInfo record);
}