package com.ddliang.quiz.service;

import com.ddliang.quiz.model.Result;

// UserService.java 接口文件
public interface UserService {
    // add user to mysql
    Result saveUser(String username, String password, String checkpassword);
}