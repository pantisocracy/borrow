package com.borrow.dao.mapper;

import com.borrow.entity.SchoolInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SchoolInfoMapper extends BaseMapper<SchoolInfo,Integer>{
    @Delete({
        "delete from school",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into school (id, school_name, ",
        "areaid_id, add_time, ",
        "code)",
        "values (#{id,jdbcType=INTEGER}, #{schoolName,jdbcType=VARCHAR}, ",
        "#{areaidId,jdbcType=INTEGER}, #{addTime,jdbcType=VARCHAR}, ",
        "#{code,jdbcType=VARCHAR})"
    })
    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    @Select({
        "select",
        "id, school_name, areaid_id, add_time, code",
        "from school",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SchoolInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolInfo record);

    @Update({
        "update school",
        "set school_name = #{schoolName,jdbcType=VARCHAR},",
          "areaid_id = #{areaidId,jdbcType=INTEGER},",
          "add_time = #{addTime,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SchoolInfo record);
}