package com.cn.course.teacher.service;

import com.cn.course.teacher.Teacher;
import com.cn.course.teacher.TeacherExample;
import com.cn.course.teacher.dao.TeacherMapper;
import com.cn.course.util.Md5Util;
import com.cn.course.util.TimeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project_name: lzw
 * Company: gejigang
 * Author: gejigang
 * Date: Created 上午10:30 2018/4/24.
 * Description:
 * Modified By:
 */
@Service
public class TeacherService {
    @Resource
    TeacherMapper mapper;

    public int save(Teacher teacher) {
        Teacher t = findteacher(teacher.getPhone());
        if (t != null) {
            throw new RuntimeException("已注册的手机号!");
        }
        return mapper.insertSelective(teacher);
    }

    public int update(Teacher teacher) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(teacher.getId());
        criteria.andTimestampEqualTo(teacher.getTimestamp());

        teacher.setTimestamp(TimeUtil.currentTimeStr());
        teacher.setPassword(null);
        return mapper.updateByExampleSelective(teacher, example);
    }

    public Teacher findteacher(Integer id) {

        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andIsvalidEqualTo(0);
        List<Teacher> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Teacher t : list) {
            t.setPassword(null);
        }
        return list.get(0);
    }

    public List<Teacher> findTeachersByOrgid(Integer orgid) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andOrganizationidEqualTo(orgid);

        List<Teacher> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Teacher t : list) {
            t.setPassword(null);
        }
        return list;
    }

    public Teacher findTeacherbyphone(String phone, String password) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        criteria.andPasswordEqualTo(Md5Util.MD5(password));

        List<Teacher> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Teacher t : list) {
            t.setPassword(null);
        }
        return list.get(0);
    }
    public Teacher findTeachersBycode(String code, String password) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andCodeEqualTo(code);
        criteria.andPasswordEqualTo(Md5Util.MD5(password));

        List<Teacher> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Teacher t : list) {
            t.setPassword(null);
        }
        return list.get(0);
    }

    private Teacher findteacher(String phone) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);

        List<Teacher> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (Teacher t : list) {
            t.setPassword(null);
        }
        return list.get(0);
    }
}
