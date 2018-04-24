package com.cn.course.studentfollowteacher.dao;

import com.cn.course.studentfollowteacher.StudentFollowTeacher;
import com.cn.course.studentfollowteacher.StudentFollowTeacherExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface StudentFollowTeacherMapper {
    long countByExample(StudentFollowTeacherExample example);

    int deleteByExample(StudentFollowTeacherExample example);

    int insert(StudentFollowTeacher record);

    int insertSelective(StudentFollowTeacher record);

    List<StudentFollowTeacher> selectByExample(StudentFollowTeacherExample example);

    int updateByExampleSelective(@Param("record") StudentFollowTeacher record, @Param("example") StudentFollowTeacherExample example);

    int updateByExample(@Param("record") StudentFollowTeacher record, @Param("example") StudentFollowTeacherExample example);
}