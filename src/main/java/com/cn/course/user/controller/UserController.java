package com.cn.course.user.controller;

import com.cn.course.user.User;
import com.cn.course.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        return user;
    }


}
