package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> getUsers(){
        return service.getUsers();
    }
}
