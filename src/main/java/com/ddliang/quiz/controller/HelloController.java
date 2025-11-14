package com.ddliang.quiz.controller;

import com.ddliang.quiz.model.Result;
import com.ddliang.quiz.model.SimpleUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // @RequestMapping("/hello")
    // public String hello() {
    //     System.out.println("hello");
    //     return "Hello World";
    // }

    @RequestMapping("/hello")
//    public String hello(){
//        System.out.println("hello");
//        return "hello world";
//    }
    public Result hello(){
        System.out.println("hello");
        return Result.success();
    }


    @RequestMapping("/simpleParam") //表示如果接收到浏览器的/simpleParam，就执行下面的getPa
//    public String getParam(String name, Integer age) {
//        System.out.println(name+":"+age);
//        return "ok";
//    }
    public Result simpleParam(String name, Integer age){
        System.out.println(name+":"+age);
        return Result.success("simpleParam");
    }
    // 修正前：public String getUser(SimpleUser user)：
    @RequestMapping("/simpleUser")
//    public SimpleUser getUser(SimpleUser user) { // 返回值类型改为 SimpleUser
//        System.out.println(user);
//        SimpleUser simpleUser = new SimpleUser();
//        simpleUser.setAge(user.getAge() + 10);
//        simpleUser.setName(user.getName());
//        return simpleUser; // 现在返回类型和声明的一致了
//    }

    public Result getUserr(SimpleUser user){
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setAge(user.getAge() + 10);
        simpleUser.setName(user.getName());
        return Result.success( simpleUser);
    }
}
