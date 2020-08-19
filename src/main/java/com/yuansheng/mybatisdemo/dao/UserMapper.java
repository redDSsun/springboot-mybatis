package com.yuansheng.mybatisdemo.dao;

import com.yuansheng.mybatisdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();
}
