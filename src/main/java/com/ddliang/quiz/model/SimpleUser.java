// 包路径需与项目结构对应，例如：
package com.ddliang.quiz.model;

public class SimpleUser {
    private String name;
    private Integer age;

    // 获取name
    public String getName() {
        return name;
    }

    // 设置name
    public void setName(String name) {
        this.name = name;
    }

    // 获取age
    public Integer getAge() {
        return age;
    }

    // 设置age
    public void setAge(Integer age) {
        this.age = age;
    }

    // 打印对象信息
    @Override
    public String toString() {
        return "SimpleUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}