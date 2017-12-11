package com.github.weiwei02.microservice.providemove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.weiwei02.microservice.*"
)
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker  //启用hystrix
//@EnableHystrix	// 这个注解也可以启用hystrix
public class ProviderMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderMovieApplication.class, args);
	}
}
