package com.xuyang.springcloud.server01.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: xuy
 * @Date: 2019/3/17 21:16
 * @Description:
 */
@Slf4j
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 1337463153759454380L;

    @JsonProperty("userId")
    private int userId;

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("createTime")
    private Date createTime;

    @JsonProperty("updateTime")
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
