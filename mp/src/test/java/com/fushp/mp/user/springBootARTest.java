package com.fushp.mp.user;

import com.fushp.mp.MpApplicationTests;
import com.fushp.mp.entity.User;
import org.junit.Test;

import java.util.Date;

public class springBootARTest extends MpApplicationTests {
    @Test
    public void simplyInsert() {
        User user = new User();
        user.setName("薛思琪");
        user.setAge(40);
        user.setEmail("dmy@baomidou.com");
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(new Date());
        boolean flag = user.insert();
        System.out.println("是否成功：" + flag);

    }

}
