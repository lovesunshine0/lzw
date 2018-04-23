package com.cn.course.studentfolloworganization.service;

import com.cn.course.organization.Organization;
import com.cn.course.organization.service.OrgService;
import com.cn.course.studentfolloworganization.StudentFollowOrganization;
import com.cn.course.studentfolloworganization.StudentFollowOrganizationExample;
import com.cn.course.studentfolloworganization.dao.StudentFollowOrganizationMapper;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFollowOrgService {
    @Resource
    StudentFollowOrganizationMapper mapper;
    @Autowired
    OrgService orgService;


    public int save(Integer studentid, Integer orgid) {
        StudentFollowOrganization sfo = new StudentFollowOrganization();
        sfo.setStudentid(studentid);
        sfo.setOrganizationid(orgid);
        sfo.setTimestamp(TimeUtil.currentTimeStr());
        return mapper.insertSelective(sfo);
    }

    public int del(Integer studentid, Integer orgid) {
        StudentFollowOrganizationExample example = new StudentFollowOrganizationExample();
        StudentFollowOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        criteria.andOrganizationidEqualTo(orgid);
        return mapper.deleteByExample(example);
    }

    public List<Organization> findStudentOrg(Integer studentid) {
        StudentFollowOrganizationExample example = new StudentFollowOrganizationExample();
        StudentFollowOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        List<StudentFollowOrganization> list = mapper.selectByExample(example);
        List<Integer> orgids = new ArrayList<>();
        for (StudentFollowOrganization sfo : list) {
            orgids.add(sfo.getOrganizationid());
        }
        return orgService.findOrgByids(orgids);
    }
}
