package com.ddliang.quiz;

import com.ddliang.quiz.mapper.UserMapper;
import com.ddliang.quiz.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

@SpringBootTest
class QuizApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSaveUser(){
        // 注释的查询代码
        // List<User> userList = userMapper.list();
        // userList.forEach(user-> {
        //     System.out.println(user);
        // });

        // 构造User对象
        User user = new User();
        user.setUserName("toms");
        user.setUserPassword("password123");
        user.setUserRole(0);
        user.setIsDelete(0);

        Date now = new Date();
        user.setCreateTime(now);
        user.setUpdateTime(now);

        // 执行插入操作
        int result = userMapper.saveUser(user);
        System.out.println(result);

        // 输出插入后的自增ID
        // System.out.println(user);
        // System.out.println(user.getId());
    }
}