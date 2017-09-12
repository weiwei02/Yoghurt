package com.github.weiwei02.microservice.providemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/12
 */
@RestController
public class MovieWithFeignController {
    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("/user/feign/search/{username}")
    public String findUserByFeign(@PathVariable("username") String username) {
        return userFeignClient.findByUserName(username);
    }
}
