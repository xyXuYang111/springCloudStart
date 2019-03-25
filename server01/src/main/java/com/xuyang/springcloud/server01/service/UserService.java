package com.xuyang.springcloud.server01.service;

import com.xuyang.springcloud.server01.dao.UserDao;
import com.xuyang.springcloud.server01.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: xuy
 * @Date: 2019/3/18 23:38
 * @Description:
 */
@Service
@Transactional(transactionManager = "userTransactional")
@Slf4j
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo(User user){
        log.info("获取用户信息:"+user.getUserId());
        return userDao.getUserInfo(user);
    }
}
