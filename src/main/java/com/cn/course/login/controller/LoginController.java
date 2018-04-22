package com.cn.course.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(@RequestParam(value = "username" ,required=false ) String username, @RequestParam(value = "password",required = false) String password){
        System.out.println("login :"+username+"-"+password);
        return "success";
    }
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String home(@RequestParam(value = "username" ,required=false ) String username, @RequestParam(value = "password",required = false) String password){
        System.out.println("home "+username+"-"+password);
        return "home";
    }
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(@RequestParam(value = "username" ,required=false ) String username, @RequestParam(value = "password",required = false) String password){
        System.out.println("index "+username+"-"+password);
        return "index";
    }
}
