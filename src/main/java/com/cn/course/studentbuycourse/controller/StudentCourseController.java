package com.cn.course.studentbuycourse.controller;

import com.cn.course.course.CourseInfo;
import com.cn.course.studentbuycourse.StudentBuyCourse;
import com.cn.course.studentbuycourse.service.StudentBuyCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentcourses")
public class StudentCourseController {
    @Autowired
    StudentBuyCourseService service;

    @RequestMapping(value = "findCourseByStudentid", method = RequestMethod.GET)
    public List<CourseInfo>  findCourseByStudentid(@RequestParam(value = "studentid") Integer studentid) {
        return service.findCourses(studentid);
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public int updateStudentBuyCourse(@RequestParam(value = "studentcourse" )StudentBuyCourse sc) {
        return service.updateStudentBuyCourse(sc);
    }
}
