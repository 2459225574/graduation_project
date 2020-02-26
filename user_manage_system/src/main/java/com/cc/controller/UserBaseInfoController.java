package com.cc.controller;

import com.cc.entity.UserBaseInfo;
import com.cc.service.UserBaseInfoService;
import com.cc.service.serviceImpl.UserBaseInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenchao
 * @Date 17:16 2020/2/20
 * @Description
 * @Param
 * @return
 **/
@RestController
@RequestMapping("/UserBaseInfo")
public class UserBaseInfoController {
    @Autowired
    private UserBaseInfoService userBaseInfoService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getUserBaseInfoById/{id}",method = RequestMethod.GET)
    public UserBaseInfo getUserBaseInfoById(@PathVariable String id){
        return userBaseInfoService.findById(id);
    }

    public String saveUserBaseInfo(@RequestBody UserBaseInfo userBaseInfo){
        userBaseInfoService.save(userBaseInfo);
        return "sussessful";
    }

    public UserBaseInfo test(){
        return restTemplate.getForObject("",UserBaseInfo.class);
    }

}
