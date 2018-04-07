package com.cn.course.user.service;

import com.cn.course.serialnum.service.SerialNumService;
import com.cn.course.user.User;
import com.cn.course.user.UserExample;
import com.cn.course.user.dao.UserMapper;
import com.cn.course.util.Md5Util;
import com.cn.course.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    SerialNumService serialNumService;


    public User findUserinfo(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria c = userExample.createCriteria();
        c.andNameEqualTo(username);
        c.andPasswordEqualTo(password);
        c.andIsvalidEqualTo(1);
        List<User> list = userMapper.selectByExample(userExample);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            User u = list.get(0);
            u.setPassword("");
            return u;
        }
    }
    public User findUserinfo(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria c = userExample.createCriteria();
        c.andNameEqualTo(username);
        List<User> list = userMapper.selectByExample(userExample);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            User u = list.get(0);
            u.setPassword("");
            return u;
        }
    }
    public List<User> findAllUserinfo() {
        List<User> list = userMapper.selectByExample(null);
        for(User u:list){
            u.setPassword("");
        }
        return list;
    }

    public int saveUserinfo(User user) {
        user.setId(0);
        String password = user.getPassword();
        if (password == null || "".equals(password)) {
            throw new RuntimeException("密码无效！");
        }
        if (user.getName() == null || "".equalsIgnoreCase(user.getName())) {
            throw new RuntimeException("用户名无效！");
        }

        String encryptpassword = Md5Util.MD5(password);
        user.setPassword(encryptpassword);
        user.setIsvalid(1);
        user.setCode(serialNumService.getNextCode(SerialNumService.userKey));
        return userMapper.insert(user);
    }

    public int updatdUser(User user) {
        if (user.getId() == null || user.getId() == 0) {
            return 0;
        }
        UserExample userExample = new UserExample();
        UserExample.Criteria c = userExample.createCriteria();
        c.andIdEqualTo(user.getId());
        c.andTimestampEqualTo(user.getTimestamp());
        user.setPassword(Md5Util.MD5(user.getPassword()));
        user.setTimestamp(TimeUtil.currentTimeStr());
        user.setCode(null);
        return userMapper.updateByExample(user, userExample);
    }
}
