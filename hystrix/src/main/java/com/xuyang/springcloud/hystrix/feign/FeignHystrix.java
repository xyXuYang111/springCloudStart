package com.xuyang.springcloud.hystrix.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Auther: xuy
 * @Date: 2019/3/23 00:49
 * @Description:
 */
@Component
@Slf4j
public class FeignHystrix implements TestFeign{

    @Override
    public String getUserList() {
        log.info("测试feign的熔断机制");
        return "测试feign";
    }
}
