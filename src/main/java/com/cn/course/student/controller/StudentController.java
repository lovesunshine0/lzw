package com.cn.course.student.controller;

import com.cn.course.student.Student;
import com.cn.course.student.service.StudentService;
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
 * Date: Created 下午5:51 2018/4/23.
 * Description:
 * Modified By:
 */
@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public int saveStudent(@RequestParam("student") Student student) {
        return studentService.saveStudent(student);
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public int updateStudent(@RequestParam("student") Student student) {
        return studentService.updateStudent(student);
    }

    @RequestMapping(value = "updatepassword", method = RequestMethod.GET)
    public int updateStudentPassword(@RequestParam("studentid") Integer studentid, @RequestParam("oldpassword") String oldpassword, @RequestParam("newpassword") String newpassword) {
        return studentService.updateStudent(studentid, oldpassword, newpassword);
    }

    @RequestMapping(value = "loginbyphone", method = RequestMethod.GET)
    public Student findStudentByphone(@RequestParam("phone") String phone, @RequestParam("password") String password) {
        return studentService.findStudentByphone(phone, password);
    }

    @RequestMapping(value = "loginbycode", method = RequestMethod.GET)
    public Student findStudentByCode(@RequestParam("code") String code, @RequestParam("password") String password) {
        return studentService.findStudentBycode(code, password);
    }

    @RequestMapping(value = "findbyid", method = RequestMethod.GET)
    public Student findStudents(@RequestParam("studentid") Integer studentid) {
        return studentService.findStudentbyid(studentid);
    }

    @RequestMapping(value = "findbyname", method = RequestMethod.GET)
    public List<Student> findstudent(@RequestParam("name") String name) {
        return studentService.findStudents(name);
    }

}
