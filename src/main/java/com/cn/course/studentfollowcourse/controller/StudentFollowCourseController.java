package com.cn.course.studentfollowcourse.controller;

import com.cn.course.course.CourseInfo;
import com.cn.course.course.service.CourseService;
import com.cn.course.studentfollowcourse.StudentFollowCourse;
import com.cn.course.studentfollowcourse.service.StudentFollowCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("studentfollowcourse")
public class StudentFollowCourseController {

    @Autowired
    StudentFollowCourseService service;

    @RequestMapping(value = "studentfollwcourse", method = RequestMethod.GET)
    public int save(@RequestParam("studentid") Integer studentid, @RequestParam("courseid") Integer courseid) {
        return service.save(studentid, courseid);
    }

    @RequestMapping(value = "delcourse", method = RequestMethod.GET)
    public int del(@RequestParam("studentid") Integer studentid, @RequestParam("courseid") Integer courseid) {
        return service.del(studentid, courseid);
    }

    @RequestMapping(value = "findcourse", method = RequestMethod.GET)
    public List<CourseInfo> findStudentFollowCourse(@RequestParam("studentid") Integer studentid) {
        return service.findStudentFollowCourse(studentid);
    }
}
