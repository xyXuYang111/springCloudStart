package com.xuyang.springcloud.zipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: xuy
 * @Date: 2019/3/24 02:13
 * @Description:
 */
@RestController
@Slf4j
public class ZipkinController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "textOwnInfo.do", method = RequestMethod.GET)
    public String textOwnInfo(){
        log.info("测试自己服务是否会监控这个接口");
        return "Zipkin接口测试";
    }

    @RequestMapping(value = "textOtherInfo.do", method = RequestMethod.GET)
    public String textOtherInfo(){
        log.info("测试其他服务是否会监控这个接口");
        return restTemplate.getForObject("http://localhost:8087/textOwnInfo.do", String.class);
    }
}
