package com.cn.course.studentfollowcourse.service;

import com.cn.course.course.CourseInfo;
import com.cn.course.course.service.CourseService;
import com.cn.course.studentfollowcourse.StudentFollowCourse;
import com.cn.course.studentfollowcourse.StudentFollowCourseExample;
import com.cn.course.studentfollowcourse.dao.StudentFollowCourseMapper;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFollowCourseService {
    @Resource
    StudentFollowCourseMapper courseMapper;
    @Autowired
    CourseService courseService;

    public int save(Integer studentid, Integer courseid) {
        StudentFollowCourse sfc = new StudentFollowCourse();
        sfc.setStudentid(studentid);
        sfc.setCourseid(courseid);
        sfc.setTimestamp(TimeUtil.currentTimeStr());
        return courseMapper.insertSelective(sfc);
    }

    public int del(Integer studentid, Integer courseid) {
        StudentFollowCourseExample example = new StudentFollowCourseExample();
        StudentFollowCourseExample.Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        criteria.andCourseidEqualTo(courseid);
        return courseMapper.deleteByExample(example);
    }

    public List<CourseInfo> findStudentFollowCourse(Integer studentid) {
        StudentFollowCourseExample example = new StudentFollowCourseExample();
        StudentFollowCourseExample.Criteria criteria = example.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        List<StudentFollowCourse> list = courseMapper.selectByExample(example);
        List<Integer> courseids = new ArrayList<>();
        for (StudentFollowCourse sfc : list) {
            courseids.add(sfc.getCourseid());
        }
        return courseService.findCourseByIds(courseids);
    }
}
