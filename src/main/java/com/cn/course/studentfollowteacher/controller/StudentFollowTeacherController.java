package com.cn.course.studentfollowteacher.controller;

import com.cn.course.studentfollowteacher.service.StudentFollowTeacherService;
import com.cn.course.teacher.Teacher;
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
 * Date: Created 下午12:27 2018/4/24.
 * Description:
 * Modified By:
 */
@RestController
@RequestMapping("studentfollowteacher")
public class StudentFollowTeacherController {
    @Autowired
    StudentFollowTeacherService service;

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public int save(@RequestParam("studentid") Integer studentid, @RequestParam("teacherid") Integer teacherid) {
        return service.save(studentid, teacherid);
    }

    @RequestMapping(value = "del", method = RequestMethod.GET)
    public int del(@RequestParam("studentid") Integer studentid, @RequestParam("teacherid") Integer teacherid) {
        return service.del(studentid, teacherid);
    }

    @RequestMapping(value = "findteacherbystudentid", method = RequestMethod.GET)
    public List<Teacher> findteacherBystudentid(@RequestParam("studentid") Integer studentid) {
        return service.findTeacherbystudentid(studentid);
    }
}
