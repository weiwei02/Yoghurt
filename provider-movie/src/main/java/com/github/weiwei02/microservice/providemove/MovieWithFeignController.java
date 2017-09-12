package com.github.weiwei02.microservice.providemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/12
 */
@Controller
public class MovieWithFeignController {
    @Autowired
    UserFeignClient userFeignClient;

    @GetMapping("/user/feign/search/{username}")
    public String findUserByFeign(@PathVariable("username") String username) {
        return super.toString();
    }
}
