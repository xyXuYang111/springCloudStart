package com.xuyang.springcloud.hystrix.controller;

import com.xuyang.springcloud.hystrix.ribbon.TestService;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuy
 * @Date: 2019/3/23 00:42
 * @Description:
 */
@RestController
@Slf4j
public class HystrixController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "getRibbonHystrix", method = RequestMethod.GET)
    public String getRibbonHystrix(){
        log.info("ribbon的熔断");
        log.info("hystrix测试，当其他平台服务挂掉了，进行其他的调用");
        testService.hiService();
        return "hystrix测试";
    }

    @RequestMapping(value = "getFeignHystrix", method = RequestMethod.GET)
    public String getFeignHystrix(){
        log.info("feign的熔断");
        log.info("hystrix测试，当其他平台服务挂掉了，进行其他的调用");
        testService.hiService();
        return "hystrix测试";
    }
}
