package com.xuyang.springcloud.feign.controller;

import com.xuyang.springcloud.feign.feign.TestFeign;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuy
 * @Date: 2019/3/23 00:27
 * @Description:
 */
@RestController
@Slf4j
public class FeignController {

    @Autowired
    private TestFeign testFeign;

    @RequestMapping(value = "feign.do", method = RequestMethod.GET)
    public String getFeignTest(){
        log.info("通过feign代理去调用其他平台的服务");
        testFeign.getUserList();
        return "feign测试";
    }
}
