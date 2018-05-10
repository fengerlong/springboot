package com.springboot.test1.controller;

import com.alibaba.fastjson.annotation.JSONField;
import com.springboot.test1.entity.User;
import com.springboot.test1.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserJpa userJpa;

    @GetMapping("/list")
    private List<User> list(){
        return  userJpa.findAll();
    }

    @GetMapping(value = "/add")
    private User add(User user){
        return userJpa.save(user);
    }


}
