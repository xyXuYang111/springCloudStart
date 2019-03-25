package com.xuyang.springcloud.ribbon.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: xuy
 * @Date: 2019/3/23 00:00
 * @Description:
 */
@Service
@Slf4j
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService() {
        log.info("通过注册名，根据restTemplate就可以实现服务之间的项目调用");
        return restTemplate.getForObject("http://server01/userList.do",String.class);
    }
}
