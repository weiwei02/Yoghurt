package com.github.weiwei02.microservice.providemove.web;

import com.github.weiwei02.microservice.providemove.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/7
 */
@RestController
@RequestMapping("/ribbon")
public class MovieController {
    @Autowired
    MovieService movieService;



    @GetMapping("/user/{username}")
    public String findUser(@PathVariable("username") String username){
        return movieService.findUserByName(username);
    }


    /**使用ribbon绑定多个参数*/
    @GetMapping("/map/user/{username}")
    public String findUserWithMap(@PathVariable("username") String username){
        Map<String,String> param = new HashMap<>();
        param.put("username",username);
        return movieService.findUserByName(username,param);
    }
}
