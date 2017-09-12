package com.github.weiwei02.microservice.providemove.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/7
 */
@Service
public class MovieService {
    @Autowired
    RestTemplate restTemplate;
    public String findUserByName(String username) {
        return restTemplate.getForObject("http://provider-user/user/search/" + username, String.class);
    }

    public String findUserByName(String username, Map<String, String> param) {
        return restTemplate.getForObject("http://provider-user/user/search/{username}" , String.class);
    }
}
