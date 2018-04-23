package com.cn.course.studentbuycourse.controller;

import com.cn.course.studentbuycourse.StudentBuyCourse;
import com.cn.course.studentbuycourse.service.StudentBuyCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCourseController {
    @Autowired
    StudentBuyCourseService service;

    public List<StudentBuyCourse> findCourseByStudentid(Integer studentid) {
        return service.findCourses(studentid);
    }

    public int updateStudentBuyCourse(StudentBuyCourse sc) {
        return service.updateStudentBuyCourse(sc);
    }
}
