package com.yuansheng.mybatisdemo.service.impl;

import com.yuansheng.mybatisdemo.dao.UserMapper;
import com.yuansheng.mybatisdemo.pojo.User;
import com.yuansheng.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllusers() {
        System.out.println("hello");
        return userMapper.getAllUsers();
    }
}
