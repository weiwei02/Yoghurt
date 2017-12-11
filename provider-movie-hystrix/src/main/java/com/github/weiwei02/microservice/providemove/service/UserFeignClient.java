package com.github.weiwei02.microservice.providemove.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**使用feign服务远程调用用户服务
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/12
 */
@FeignClient(name = "provider-user")
public interface UserFeignClient {

    @RequestMapping(value = "/user/search/{username}", method = RequestMethod.GET)
    String findByUserName(@PathVariable("username") String username);
}
