package com.cn.course.course.controller;

import com.cn.course.course.CourseInfo;
import com.cn.course.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 下午5:11 2018/4/23.
 * Description:
 * Modified By:
 */
@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public int saveCourse(@RequestParam(value = "info") CourseInfo info, @RequestAttribute(value = "userid") Integer userid) {
        return courseService.saveCourse(info, userid);
    }

    @RequestMapping(value = "del", method = RequestMethod.GET)
    public int delCourse(@RequestParam(value = "id") Integer id, @RequestAttribute(value = "userid") Integer userid) {
        return courseService.delCourse(id, userid);
    }


    @RequestMapping(value = "update", method = RequestMethod.GET)
    public int updateCourse(@RequestParam(value = "info") CourseInfo info, @RequestAttribute(value = "userid") Integer userid) {
        return courseService.updateCourse(info, userid);
    }

    @RequestMapping(value = "findbyid", method = RequestMethod.GET)
    public CourseInfo findCourse(@RequestParam(value = "id") Integer courseid) {
        return courseService.findCourse(courseid);
    }

    @RequestMapping(value = "findbyorg", method = RequestMethod.GET)
    public List<CourseInfo> findCourseByOrg(@RequestParam(value = "orgid") String orgid) {
        return courseService.findCourseByOrg(orgid);
    }

    @RequestMapping(value = "findbyteacherid", method = RequestMethod.GET)
    public List<CourseInfo> findCourseByTeacher(@RequestParam(value = "teacherid") Integer teacherid) {
        return courseService.findCourseByTeacher(teacherid);
    }

    @RequestMapping(value = "findbycategory", method = RequestMethod.GET)
    public List<CourseInfo> findCourseByCategory(@RequestParam(value = "category") String category) {
        return courseService.findCourseByCategory(category);
    }

    @RequestMapping(value = "findbynamekey", method = RequestMethod.GET)
    public List<CourseInfo> findCourseByName(@RequestParam(value = "name") String name) {
        return courseService.findCourseByLikeName(name);
    }

}
