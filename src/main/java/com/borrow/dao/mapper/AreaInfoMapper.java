package com.borrow.dao.mapper;

import com.borrow.entity.AreaInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AreaInfoMapper extends BaseMapper<AreaInfo,Integer>{
    @Delete({
        "delete from area",
        "where areaid = #{areaid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer areaid);

    @Insert({
        "insert into area (areaid, areaname, ",
        "parentid, arrparentid, ",
        "child, listorder, arrchildid)",
        "values (#{areaid,jdbcType=INTEGER}, #{areaname,jdbcType=VARCHAR}, ",
        "#{parentid,jdbcType=INTEGER}, #{arrparentid,jdbcType=VARCHAR}, ",
        "#{child,jdbcType=BIT}, #{listorder,jdbcType=SMALLINT}, #{arrchildid,jdbcType=LONGVARCHAR})"
    })
    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    @Select({
        "select",
        "areaid, areaname, parentid, arrparentid, child, listorder, arrchildid",
        "from area",
        "where areaid = #{areaid,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    AreaInfo selectByPrimaryKey(Integer areaid);

    int updateByPrimaryKeySelective(AreaInfo record);

    @Update({
        "update area",
        "set areaname = #{areaname,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=INTEGER},",
          "arrparentid = #{arrparentid,jdbcType=VARCHAR},",
          "child = #{child,jdbcType=BIT},",
          "listorder = #{listorder,jdbcType=SMALLINT},",
          "arrchildid = #{arrchildid,jdbcType=LONGVARCHAR}",
        "where areaid = #{areaid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(AreaInfo record);

    @Update({
        "update area",
        "set areaname = #{areaname,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=INTEGER},",
          "arrparentid = #{arrparentid,jdbcType=VARCHAR},",
          "child = #{child,jdbcType=BIT},",
          "listorder = #{listorder,jdbcType=SMALLINT}",
        "where areaid = #{areaid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AreaInfo record);
}