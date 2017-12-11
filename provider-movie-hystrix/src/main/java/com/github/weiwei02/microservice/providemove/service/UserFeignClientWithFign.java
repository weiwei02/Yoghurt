package com.github.weiwei02.microservice.providemove.service;

import feign.Param;
import feign.RequestLine;
import org.spring.config.FeignConfigure;
import org.springframework.cloud.netflix.feign.FeignClient;

/**使用feign自带注解完成feign调用
 *
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/12
 */
//@FeignClient(name = "provider-user", configuration = FeignConfigure.class)
public interface UserFeignClientWithFign {

    /**使用feign自带注解*/
    @RequestLine("GET /user/search/{username}")
    String findByUserName(@Param("username") String username) ;
}
