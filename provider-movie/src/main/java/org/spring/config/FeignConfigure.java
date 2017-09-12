package org.spring.config;

import feign.Contract;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**feign的配置类，该类不应该被扫描
 * @author Wang Weiwei <email>weiwei02@vip.qq.com / weiwei.wang@100credit.com</email>
 * @version 1.0
 * @sine 2017/9/12
 */
@Configuration
public class FeignConfigure {
    Logger logger = LoggerFactory.getLogger(FeignConfigure.class);


    /**注意此处配置，当spring上下文中已有feign的Contract默认bean之后才会加载此契约为bean*/
    @Bean(name = "default-FeignContract")
    public Contract feignContract(){
        logger.info("----------------------feignContract 成功加载-----------------");
        return new feign.Contract.Default();
    }
}
