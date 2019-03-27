package com.xuyang.springcloud.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: xuy
 * @Date: 2019/3/23 00:24
 * @Description:
 */
@Component
@FeignClient(value = "server01")
public interface TestFeign {

    @RequestMapping(value = "userList.do",method = RequestMethod.GET)
    String getUserList();
}
