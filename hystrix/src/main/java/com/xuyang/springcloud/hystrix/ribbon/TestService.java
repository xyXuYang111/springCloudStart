package com.xuyang.springcloud.hystrix.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
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

    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hiService() {
        log.info("通过注册名，根据restTemplate就可以实现服务之间的项目调用");
        return restTemplate.getForObject("http://server01/userList.do",String.class);
    }

    public String hystrixError() {
        log.info("hystrixError测试，当服务挂了调用这个服务");
        return restTemplate.getForObject("http://server01/userList.do",String.class);
    }
}
