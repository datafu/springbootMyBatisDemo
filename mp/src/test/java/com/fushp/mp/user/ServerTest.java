package com.fushp.mp.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fushp.mp.MpApplicationTests;
import com.fushp.mp.dao.UserMapper;
import com.fushp.mp.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServerTest extends MpApplicationTests {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void selecMypage() {
        // 条件构造器
        QueryWrapper<User> userQuery = Wrappers.query();
        userQuery.ge("age", 26);

        Page<User> page = new Page<>(1, 3);

        IPage<User> userPage = userMapper.selectUserPage(page, userQuery);
        System.out.println("总页数：" + userPage.getPages());
        System.out.println("总记录数：" + userPage.getTotal());

        List<User> userList = userPage.getRecords();
        userList.forEach(System.out::println);
    }

}
