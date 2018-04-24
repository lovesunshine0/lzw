package com.cn.course.studentfolloworganization.controller;

import com.cn.course.organization.Organization;
import com.cn.course.studentfolloworganization.service.StudentFollowOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("studentfollowrg")
public class StudentFollowOrgController {
    @Autowired
    StudentFollowOrgService service;

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public int save(@RequestParam("studentid") Integer studentid, @RequestParam("orgid") Integer orgid) {
        return service.save(studentid, orgid);
    }

    @RequestMapping(value = "del", method = RequestMethod.GET)
    public int del(@RequestParam("studentid") Integer studentid, @RequestParam("orgid") Integer orgid) {
        return service.del(studentid, orgid);
    }

    @RequestMapping(value = "findStudentfolloworg", method = RequestMethod.GET)
    public List<Organization> findStudentOrg(@RequestParam("studentid") Integer studentid) {
        return service.findStudentOrg(studentid);
    }
}
