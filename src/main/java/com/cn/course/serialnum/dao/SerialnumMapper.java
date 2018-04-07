package com.cn.course.serialnum.dao;

import com.cn.course.serialnum.Serialnum;
import com.cn.course.serialnum.SerialnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialnumMapper {
    long countByExample(SerialnumExample example);

    int deleteByExample(SerialnumExample example);

    int deleteByPrimaryKey(String type);

    int insert(Serialnum record);

    int insertSelective(Serialnum record);

    List<Serialnum> selectByExample(SerialnumExample example);

    Serialnum selectByPrimaryKey(String type);

    int updateByExampleSelective(@Param("record") Serialnum record, @Param("example") SerialnumExample example);

    int updateByExample(@Param("record") Serialnum record, @Param("example") SerialnumExample example);

    int updateByPrimaryKeySelective(Serialnum record);

    int updateByPrimaryKey(Serialnum record);
}