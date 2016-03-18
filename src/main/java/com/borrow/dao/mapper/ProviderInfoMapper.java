package com.borrow.dao.mapper;

import com.borrow.entity.ProviderInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProviderInfoMapper {
    @Delete({
        "delete from provider",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into provider (id, provider_name, ",
        "type, output_api)",
        "values (#{id,jdbcType=INTEGER}, #{providerName,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=INTEGER}, #{outputApi,jdbcType=VARCHAR})"
    })
    int insert(ProviderInfo record);

    int insertSelective(ProviderInfo record);

    @Select({
        "select",
        "id, provider_name, type, output_api",
        "from provider",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ProviderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProviderInfo record);

    @Update({
        "update provider",
        "set provider_name = #{providerName,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=INTEGER},",
          "output_api = #{outputApi,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProviderInfo record);
}