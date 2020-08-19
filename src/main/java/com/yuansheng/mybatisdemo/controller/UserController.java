package com.yuansheng.mybatisdemo.controller;

import com.yuansheng.mybatisdemo.pojo.User;
import com.yuansheng.mybatisdemo.service.UserService;
import com.yuansheng.mybatisdemo.utils.PropertiesUtil;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PropertiesUtil propertiesUtil;

    @GetMapping("/users")
    public String getAllUsers(){
        System.out.println(propertiesUtil.toString());
        List<User> allusers = userService.getAllusers();
        return allusers.toString();
    }
}
