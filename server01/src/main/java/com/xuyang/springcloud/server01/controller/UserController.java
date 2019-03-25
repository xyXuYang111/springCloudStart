package com.xuyang.springcloud.server01.controller;

import com.xuyang.springcloud.server01.model.User;
import com.xuyang.springcloud.server01.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: xuy
 * @Date: 2019/3/17 21:53
 * @Description:
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "userList.do", method = RequestMethod.GET)
    public User getUserList(){
        log.info("路由测试访问");
        User user = new User();
        user.setUserId(1);
        user.setUserName("许洋");
        user.setPassword("1111111");
        return user;
    }
}
