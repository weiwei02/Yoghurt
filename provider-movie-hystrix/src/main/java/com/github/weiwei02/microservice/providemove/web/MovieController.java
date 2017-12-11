package com.github.weiwei02.microservice.providemove.web;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.weiwei02.microservice.providemove.service.MovieService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/7
 */
@RestController
public class MovieController {
    @Autowired
    MovieService movieService;


    @HystrixCommand(fallbackMethod = "findByNameFallBack")
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


    private String findByNameFallBack(String username) throws IOException {
        Map<String,String> map = new HashMap<>();
        map.put("username", username);
        map.put("name", "特仑苏");
        map.put("age", "20");
        map.put("id", "0");
        ObjectMapper objectMapper = new ObjectMapper();
        return  objectMapper.writeValueAsString(map);
    }
}
