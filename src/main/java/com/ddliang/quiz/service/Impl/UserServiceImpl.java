package com.ddliang.quiz.mapper;

import com.ddliang.quiz.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select; // 确保导入了 Select
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll(); // public 关键字在接口中可以省略

    @Insert("insert into user(userName, userPassword, isDelete, userRole, createTime, updateTime) " +
            "values(#{userName}, #{userPassword}, #{isDelete}, #{userRole}, #{createTime}, #{updateTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int saveUser(User user); // public 关键字在接口中可以省略

    //根据用户名查询用户
    @Select("SELECT * FROM user WHERE userName = #{userName}")
    User findByUserName(String userName);
}