package com.cn.course.studentfolloworganization.dao;

import com.cn.course.studentfolloworganization.StudentFollowOrganization;
import com.cn.course.studentfolloworganization.StudentFollowOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentFollowOrganizationMapper {
    long countByExample(StudentFollowOrganizationExample example);

    int deleteByExample(StudentFollowOrganizationExample example);

    int insert(StudentFollowOrganization record);

    int insertSelective(StudentFollowOrganization record);

    List<StudentFollowOrganization> selectByExample(StudentFollowOrganizationExample example);

    int updateByExampleSelective(@Param("record") StudentFollowOrganization record, @Param("example") StudentFollowOrganizationExample example);

    int updateByExample(@Param("record") StudentFollowOrganization record, @Param("example") StudentFollowOrganizationExample example);
}