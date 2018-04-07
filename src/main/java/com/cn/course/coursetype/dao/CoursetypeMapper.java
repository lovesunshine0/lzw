package com.cn.course.coursetype.dao;

import com.cn.course.coursetype.Coursetype;
import com.cn.course.coursetype.CoursetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursetypeMapper {
    long countByExample(CoursetypeExample example);

    int deleteByExample(CoursetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coursetype record);

    int insertSelective(Coursetype record);

    List<Coursetype> selectByExample(CoursetypeExample example);

    Coursetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByExample(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByPrimaryKeySelective(Coursetype record);

    int updateByPrimaryKey(Coursetype record);
}