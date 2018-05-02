package com.cn.course.teacher.controller;

import com.cn.course.teacher.Teacher;
import com.cn.course.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 上午11:04 2018/4/24.
 * Description:
 * Modified By:
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    TeacherService service;

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public int save(@RequestParam("teacher") Teacher teacher) {
        return service.save(teacher);
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public int update(@RequestParam("teacher") Teacher teacher) {
        return service.update(teacher);
    }

    @RequestMapping(value = "findbyorgid", method = RequestMethod.GET)
    public List<Teacher> findTeacher(@RequestParam("orgid") Integer orgid) {
        return service.findTeachersByOrgid(orgid);
    }

    @RequestMapping(value = "findbyid", method = RequestMethod.GET)
    public Teacher findTeacherbyid(@RequestParam("teacherid") Integer teacherid) {
        return service.findteacher(teacherid);
    }

    @RequestMapping(value = "findbyphonepassword", method = RequestMethod.GET)
    public Teacher findTeacherbyid(@RequestParam("phone") String phone, @RequestParam("password") String password) {
        return service.findTeacherbyphone(phone, password);
    }

    @RequestMapping(value = "findbycodepassword", method = RequestMethod.GET)
    public Teacher findTeacherbycode(@RequestParam("code") String code, @RequestParam("password") String password) {
        return service.findTeachersBycode(code, password);
    }
}
