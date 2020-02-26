package com.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author chenchao
 * @Date 17:32 2020/2/20
 * @Description
 * @Param
 * @return
 **/

@SpringBootApplication
@EntityScan("com.cc.entity")
@MapperScan("com.cc.mapper")
@EnableEurekaClient
public class UserManageServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManageServerApplication.class,args);
    }

    /***
     * @Author chenchao
     * @Date 11:19 2020/2/22
     * @Description 创建restTemplate，用于发送请求
     * @Param []
     * @return org.springframework.web.client.RestTemplate
     **/
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
