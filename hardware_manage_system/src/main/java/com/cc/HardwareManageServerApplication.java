package com.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenchao
 * @Date 16:35 2020/2/22
 * @Description
 * @Param
 * @return
 **/
@SpringBootApplication
@EnableEurekaClient
public class HardwareManageServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HardwareManageServerApplication.class,args);
    }
    @Bean
    @LoadBalanced  //使用ribbon负载均衡，ribbon已经集成在eureka里
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
