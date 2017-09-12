package com.github.weiwei02.microservice.providemove.web;

import com.github.weiwei02.microservice.providemove.service.UserFeignClient;
import com.github.weiwei02.microservice.providemove.service.UserFeignClientWithFign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/12
 */
@RestController
@RequestMapping("/feign")
public class MovieWithFeignController {
    @Autowired
    UserFeignClient userFeignClient;

//    @Autowired
    UserFeignClientWithFign userFeignClientWithFign;

    @GetMapping("/user/search/{username}")
    public String findUserByFeign(@PathVariable("username") String username) {
        return userFeignClient.findByUserName(username);
    }

    @GetMapping("/user/search2/{username}")
    public String findUserByFeign2(@PathVariable("username") String username) {
        return userFeignClientWithFign.findByUserName(username);
    }


}
