package com.cn.course.studentfollowcourse.dao;

import com.cn.course.studentfollowcourse.StudentFollowCourse;
import com.cn.course.studentfollowcourse.StudentFollowCourseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentFollowCourseMapper {
    long countByExample(StudentFollowCourseExample example);

    int deleteByExample(StudentFollowCourseExample example);

    int insert(StudentFollowCourse record);

    int insertSelective(StudentFollowCourse record);

    List<StudentFollowCourse> selectByExample(StudentFollowCourseExample example);

    int updateByExampleSelective(@Param("record") StudentFollowCourse record, @Param("example") StudentFollowCourseExample example);

    int updateByExample(@Param("record") StudentFollowCourse record, @Param("example") StudentFollowCourseExample example);
}