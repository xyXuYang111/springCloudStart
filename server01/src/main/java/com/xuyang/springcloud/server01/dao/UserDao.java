package com.xuyang.springcloud.server01.dao;

import com.xuyang.springcloud.server01.annotation.MyBatisDao;
import com.xuyang.springcloud.server01.model.User;

import java.util.List;

/**
 * @Auther: xuy
 * @Date: 2019/3/17 20:51
 * @Description:
 */
@MyBatisDao
public interface UserDao {

    public List<User> getUserList(User user);

    public User getUserInfo(User user);

    public String insertUser(User user);

    public void updateUser(User user);
}
