package com.cn.course.studentbuycourse.dao;

import com.cn.course.studentbuycourse.StudentBuyCourse;
import com.cn.course.studentbuycourse.StudentBuyCourseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentBuyCourseMapper {
    long countByExample(StudentBuyCourseExample example);

    int deleteByExample(StudentBuyCourseExample example);

    int insert(StudentBuyCourse record);

    int insertSelective(StudentBuyCourse record);

    List<StudentBuyCourse> selectByExample(StudentBuyCourseExample example);

    int updateByExampleSelective(@Param("record") StudentBuyCourse record, @Param("example") StudentBuyCourseExample example);

    int updateByExample(@Param("record") StudentBuyCourse record, @Param("example") StudentBuyCourseExample example);
}