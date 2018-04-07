package com.cn.course.studentfollowteacher.dao;

import com.cn.course.studentfollowteacher.StudentFollowTeacher;
import com.cn.course.studentfollowteacher.StudentFollowTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentFollowTeacherMapper {
    long countByExample(StudentFollowTeacherExample example);

    int deleteByExample(StudentFollowTeacherExample example);

    int insert(StudentFollowTeacher record);

    int insertSelective(StudentFollowTeacher record);

    List<StudentFollowTeacher> selectByExample(StudentFollowTeacherExample example);

    int updateByExampleSelective(@Param("record") StudentFollowTeacher record, @Param("example") StudentFollowTeacherExample example);

    int updateByExample(@Param("record") StudentFollowTeacher record, @Param("example") StudentFollowTeacherExample example);
}