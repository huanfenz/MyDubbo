package com.wangpeng.dubbo.service.impl;

import com.wangpeng.dubbo.model.User;
import com.wangpeng.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("lisi");
        user.setAge(23);
        return user;
    }
}
