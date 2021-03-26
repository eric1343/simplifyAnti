package com.example.simplifyAnti.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wuwei
 * @createTime 24 14:53
 * @description
 */
@Mapper
public interface TestMapper {

    String hello(@Param("args") String hi);
}
