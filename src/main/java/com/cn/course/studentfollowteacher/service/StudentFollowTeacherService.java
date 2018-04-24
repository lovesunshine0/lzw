package com.cn.course.studentfollowteacher.service;

import com.cn.course.studentfollowteacher.StudentFollowTeacher;
import com.cn.course.studentfollowteacher.StudentFollowTeacherExample;
import com.cn.course.studentfollowteacher.dao.StudentFollowTeacherMapper;
import com.cn.course.teacher.Teacher;
import com.cn.course.teacher.service.TeacherService;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 下午12:16 2018/4/24.
 * Description:
 * Modified By:
 */
@Service
public class StudentFollowTeacherService {
    @Resource
    StudentFollowTeacherMapper mapper;
    @Autowired
    TeacherService service;

    public int save(Integer studentid, Integer teacherid) {
        StudentFollowTeacher sft = new StudentFollowTeacher();
        sft.setStudentid(studentid);
        sft.setTeacherid(teacherid);
        sft.setTimestamp(TimeUtil.currentTimeStr());
        return mapper.insert(sft);
    }

    public int del(Integer studentid, Integer teacherid) {
        StudentFollowTeacherExample example = new StudentFollowTeacherExample();
        StudentFollowTeacherExample.Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        criteria.andTeacheridEqualTo(teacherid);
        return mapper.deleteByExample(example);
    }

    public List<Teacher> findTeacherbystudentid(Integer studentid) {
        StudentFollowTeacherExample example = new StudentFollowTeacherExample();
        StudentFollowTeacherExample.Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        List<StudentFollowTeacher> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<Teacher> teachers = new ArrayList<>();
        for (StudentFollowTeacher s : list) {
            Teacher t = service.findteacher(s.getTeacherid());
            if (t != null) {//置空一些信息不给学生查看
                t.setAddress(null);
                t.setCreatetime(null);
                t.setMoney(null);
                t.setAssessor(null);
                teachers.add(t);
            }
        }
        return teachers;
    }

}
