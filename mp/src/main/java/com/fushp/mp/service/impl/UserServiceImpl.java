package com.fushp.mp.service.impl;

import com.fushp.mp.dao.UserMapper;
import com.fushp.mp.entity.User;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fushp.mp.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
