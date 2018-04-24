package com.cn.course.user.controller;

import com.cn.course.user.User;
import com.cn.course.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/helloworld3", method = RequestMethod.GET)
    public String helloworld3(@RequestParam String abc) {
        return "helloworld3:" + abc;
    }

    @RequestMapping(value = "/saveuser", method = RequestMethod.GET)
    public User saveUser(@RequestParam String username, @RequestParam String password) {
        System.out.println(username + "-" + password);
        User user = userService.findUserinfo(username, password);
        if(user!=null) {
            System.out.println(user.getCode());
        }else{
            System.out.println("不存在的用户");
        }
        return user;
    }

    @RequestMapping(value = "/listuser", method = RequestMethod.GET)
    public List<User> listUser() {
        System.out.println("--------------------------------------listuser-");
        List<User> users = userService.findAllUserinfo();
        System.out.println(users.size());
        return users;
    }


}
