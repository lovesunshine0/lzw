package com.cn.course.student.service;

import com.cn.course.student.Student;
import com.cn.course.student.StudentExample;
import com.cn.course.student.dao.StudentMapper;
import com.cn.course.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Project_name: lzw
 * Company: aleiye
 * Author: aleiye
 * Date: Created 下午5:28 2018/4/23.
 * Description:
 * Modified By:
 */
@Service
public class StudentService {
    @Resource
    StudentMapper studentMapper;


    public int saveStudent(Student student) {
        Student s = findStudentPhone(student.getPhone());
        if (s == null) {
            student.setCreatetime(new Date());
            student.setPassword(Md5Util.MD5(student.getPassword()));
            return studentMapper.insertSelective(student);
        } else return 0;
    }

    /**
     * 修改个人信息（不修改密码）
     *
     * @param student
     * @return
     */
    public int updateStudent(Student student) {

        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria c = studentExample.createCriteria();
        c.andIdEqualTo(student.getId());
        student.setPassword(null);
        return studentMapper.updateByExampleSelective(student, studentExample);
    }

    /**
     * 修改密码
     *
     * @param studentid
     * @param oldpassword
     * @param newpassword
     * @return
     */
    public int updateStudent(Integer studentid, String oldpassword, String newpassword) {
        Student student = findStudentbyid(studentid);
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria c = studentExample.createCriteria();
        c.andIdEqualTo(studentid);
        c.andPasswordEqualTo(Md5Util.MD5(oldpassword));
        student.setPassword(Md5Util.MD5(newpassword));
        return studentMapper.updateByExampleSelective(student, studentExample);
    }

    public Student findStudentByphone(String telphone, String password) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria c = studentExample.createCriteria();
        c.andPhoneEqualTo(telphone);
        c.andPasswordEqualTo(Md5Util.MD5(password));
        List<Student> list = studentMapper.selectByExample(studentExample);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            Student student = list.get(0);
            student.setPassword(null);
            return student;
        }
    }

    public Student findStudentBycode(String code, String password) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria c = studentExample.createCriteria();
        c.andCodeEqualTo(code);
        c.andPasswordEqualTo(Md5Util.MD5(password));
        List<Student> list = studentMapper.selectByExample(studentExample);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            Student student = list.get(0);
            student.setPassword(null);
            return student;
        }
    }

    public Student findStudentPhone(String telphone) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria c = studentExample.createCriteria();
        c.andPhoneEqualTo(telphone);
        List<Student> list = studentMapper.selectByExample(studentExample);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            Student student = list.get(0);
            student.setPassword(null);
            return student;
        }
    }

    public Student findStudentbyid(Integer studentid) {
        Student student = studentMapper.selectByPrimaryKey(studentid);
        student.setPassword(null);
        return student;
    }

    public List<Student> findStudents(String name) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria c = studentExample.createCriteria();
        c.andNameLike(name);
        List<Student> list = studentMapper.selectByExample(studentExample);
        for (Student s : list) {
            s.setPassword(null);
        }
        return list;
    }
}
