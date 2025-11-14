package com.ddliang.quiz.controller;

import com.ddliang.quiz.model.Result;
import com.ddliang.quiz.model.User;
import com.ddliang.quiz.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    // 用户名正则（仅允许字母、数字）
    private static final String USERNAME_REGEX = "^[a-zA-Z0-9]+$";
    // 密码盐值（增强加密安全性）
    private static final String SALT = "com.quiz";

    @RequestMapping("/register")
    public Result addUser(String username, String password, String checkpassword) {
        //  账户、密码、确认密码非空校验
        if (StringUtils.isAnyBlank(username, password, checkpassword)) {
            return Result.error("用户名或密码为空");
        }

        // 密码与确认密码一致性校验
        if (!password.equals(checkpassword)) {
            return Result.error("两次输入的密码不一致");
        }

        // 账户、密码规则校验
        // 用户名不含特殊字符
        Pattern pattern = Pattern.compile(USERNAME_REGEX);
        Matcher matcher = pattern.matcher(username);
        if (!matcher.matches()) {
            return Result.error("用户名包含特殊字符");
        }
        // 用户名长度≥4
        if (username.length() < 4) {
            return Result.error("用户名长度不能少于4个字符");
        }
        // 密码长度≥8
        if (password.length() < 8) {
            return Result.error("密码长度不能少于8位");
        }

//        // 用户名重复性校验
        //to do...
//        User existingUser = userMapper.findByUserName(username);
//        if (existingUser != null) {
//            return Result.error("用户名已存在");
//        }

        // 密码加密（盐值+MD5）
        String encryptedPassword = DigestUtils.md5DigestAsHex((SALT + password).getBytes());

        // 构造用户对象并插入数据库
        User user = new User();
        user.setUserName(username);
        user.setUserPassword(encryptedPassword);
        user.setUserRole(0); // 默认普通用户
        user.setIsDelete(0); // 默认未删除
        Date now = new Date();
        user.setCreateTime(now);
        user.setUpdateTime(now);

        int insertResult = userMapper.saveUser(user);
        return insertResult > 0 ? Result.success("注册成功") : Result.error("注册失败，请稍后重试");
    }
}