package com.ddliang.quiz.model;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    /** 用户ID */
    private Long id;
    /** 用户名 */
    private String userName;
    /** 密码 */
    private String userPassword;
    /** 是否删除 */
    private Integer isDelete;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** 用户角色：0-普通用户，1-管理员 */
    private Integer userRole;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}