package com.cn.course.studentbuycourse.service;

import com.cn.course.course.CourseInfo;
import com.cn.course.course.service.CourseService;
import com.cn.course.studentbuycourse.StudentBuyCourse;
import com.cn.course.studentbuycourse.StudentBuyCourseExample;
import com.cn.course.studentbuycourse.dao.StudentBuyCourseMapper;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentBuyCourseService {
    @Resource
    StudentBuyCourseMapper mapper;

    @Autowired
    CourseService courseService;

    public int saveStudentBuyCourse(StudentBuyCourse studentBuyCourse) {
        studentBuyCourse.setIsvalid(0);
        studentBuyCourse.setTimestamp(TimeUtil.currentTimeStr());
        return mapper.insert(studentBuyCourse);
    }

    public int updateStudentBuyCourse(StudentBuyCourse studentBuyCourse) {
        StudentBuyCourseExample studentBuyCourseExample = new StudentBuyCourseExample();
        StudentBuyCourseExample.Criteria criteria = studentBuyCourseExample.createCriteria();
        criteria.andStudentidEqualTo(studentBuyCourse.getStudentid());
        criteria.andCourseidEqualTo(studentBuyCourse.getCourseid());
        criteria.andTimestampEqualTo(studentBuyCourse.getTimestamp());
        studentBuyCourse.setTimestamp(TimeUtil.currentTimeStr());
        return mapper.updateByExampleSelective(studentBuyCourse, studentBuyCourseExample);
    }

    public List<CourseInfo> findCourses(Integer studentid) {
        StudentBuyCourseExample studentBuyCourseExample = new StudentBuyCourseExample();
        StudentBuyCourseExample.Criteria criteria = studentBuyCourseExample.createCriteria();
        criteria.andStudentidEqualTo(studentid);
        criteria.andIsvalidEqualTo(0);
        List<StudentBuyCourse> list = mapper.selectByExample(studentBuyCourseExample);

        List<Integer> cs = new ArrayList<>();
        for (StudentBuyCourse sbc : list) {
            int c = sbc.getCourseid();
            if (c != 0) {
                cs.add(c);
            }
        }
        List<CourseInfo>  courseInfos =courseService.findCourseByIds(cs);
        return courseInfos;
    }
}
