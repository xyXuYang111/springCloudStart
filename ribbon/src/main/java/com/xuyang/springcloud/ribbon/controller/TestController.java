package com.xuyang.springcloud.ribbon.controller;

import com.xuyang.springcloud.ribbon.server.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuy
 * @Date: 2019/3/23 00:02
 * @Description:
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "text.do", method = RequestMethod.GET)
    public String textController(){
        log.info("测试ribbon，实现效果是通过restTemplate实现ribbon");
        testService.hiService();
        return "许洋测试数据";
    }
}
