package com.cn.course.course.service;

import com.cn.course.course.CourseInfo;
import com.cn.course.course.CourseInfoExample;
import com.cn.course.course.dao.CourseInfoMapper;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 下午4:24 2018/4/23.
 * Description:
 * Modified By:
 */
@Service
public class CourseService {
    @Autowired
    CourseInfoMapper courseInfoMapper;


    public CourseInfo findCourse(Integer courseid) {
        return courseInfoMapper.selectByPrimaryKey(courseid);
    }

    public List<CourseInfo> findCourseByOrg(String organizationid) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria c = courseInfoExample.createCriteria();
        c.andOrganizationidEqualTo(organizationid);
        return courseInfoMapper.selectByExample(courseInfoExample);
    }

    public List<CourseInfo> findCourseByTeacher(Integer teacherid) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria c = courseInfoExample.createCriteria();
        c.andTeacheridEqualTo(teacherid);
        return courseInfoMapper.selectByExample(courseInfoExample);
    }

    public List<CourseInfo> findCourseByCategory(String categoryid) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria c = courseInfoExample.createCriteria();
        c.andCoursetypeEqualTo(categoryid);
        return courseInfoMapper.selectByExample(courseInfoExample);
    }

    public List<CourseInfo> findCourseByLikeName(String name) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria c = courseInfoExample.createCriteria();
        c.andTitleLike(name);
        CourseInfoExample.Criteria nc = courseInfoExample.createCriteria();
        nc.andIntroductionLike(name);
        courseInfoExample.or(nc);
        return courseInfoMapper.selectByExample(courseInfoExample);
    }

    public int delCourse(Integer id, Integer userid) {
        CourseInfo courseInfo = findCourse(id);
        if (courseInfo == null) {
            throw new RuntimeException("不存在的课程！");
        }
        courseInfo.setIsvalid(1);
        courseInfo.setUpdateuser(userid);
        courseInfo.setUpdatetime(new Date());
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria c = courseInfoExample.createCriteria();
        c.andIdEqualTo(id);
        c.andTimestampEqualTo(courseInfo.getTimestamp());
        c.andIsvalidEqualTo(0);
        courseInfo.setTimestamp(TimeUtil.currentTimeStr());
        return courseInfoMapper.updateByExampleSelective(courseInfo, courseInfoExample);
    }

    public int updateCourse(CourseInfo courseInfo, Integer userid) {
        courseInfo.setUpdatetime(new Date());
        courseInfo.setUpdateuser(userid);
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria c = courseInfoExample.createCriteria();
        c.andIdEqualTo(courseInfo.getId());
        c.andTimestampEqualTo(courseInfo.getTimestamp());
        c.andIsvalidEqualTo(0);
        courseInfo.setTimestamp(TimeUtil.currentTimeStr());
        return courseInfoMapper.updateByExampleSelective(courseInfo, courseInfoExample);
    }

    public int saveCourse(CourseInfo courseInfo, Integer userid) {
        courseInfo.setTimestamp(TimeUtil.currentTimeStr());
        courseInfo.setCreatetime(new Date());
        courseInfo.setCreateuser(userid);
        courseInfo.setIsvalid(0);
        return courseInfoMapper.insertSelective(courseInfo);
    }
}
