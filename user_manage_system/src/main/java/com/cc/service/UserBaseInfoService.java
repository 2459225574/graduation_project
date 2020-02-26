package com.cc.service;

import com.cc.entity.UserBaseInfo;

/**
 * @Author chenchao
 * @Date 17:07 2020/2/20
 * @Description
 * @Param
 * @return
 **/
public interface UserBaseInfoService {
    UserBaseInfo findById(String id);
    void update(UserBaseInfo ubi);
    void save(UserBaseInfo ubi);
    void delete(String id);
}
