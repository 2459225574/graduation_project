package com.cc.controller;

import com.cc.entity.UserBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author chenchao
 * @Date 16:33 2020/2/22
 * @Description
 * @Param
 * @return
 **/
@RestController
@RequestMapping(value = "/test")
public class Test {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    //未使用ribbon负载均衡时候resttemplate调用
    @RequestMapping(value = "/one/{id}")
    public UserBaseInfo testOne(@PathVariable String id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("user_manage_system_service");
        ServiceInstance instance = instances.get(0);
        return restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort() + "/UserBaseInfo/getUserBaseInfoById/1", UserBaseInfo.class);
    }

    //使用ribbon负载均衡   是一个典型的客户端负载均衡
    //1.服务端负载均衡 nginx，F5，由服务器代码访问
    //2.客户端负载均衡 从所有的地址里选择合适的地址
    //
    @RequestMapping(value = "/two/{id}")
    public UserBaseInfo testTwo(@PathVariable String id) {
        //此处直接使用服务名
        return restTemplate.getForObject("http://user_manage_system_service/UserBaseInfo/getUserBaseInfoById/1", UserBaseInfo.class);
    }

}
