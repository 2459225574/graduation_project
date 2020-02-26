package com.cc.service.serviceImpl;

import com.cc.dao.UserBaseInfoDao;
import com.cc.entity.UserBaseInfo;
import com.cc.service.UserBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author chenchao
 * @Date 17:10 2020/2/20
 * @Description
 * @Param
 * @return
 **/
@Service
public class UserBaseInfoServiceImpl implements UserBaseInfoService {
    @Autowired
    UserBaseInfoDao userBaseInfoDao;

    @Override
    public UserBaseInfo findById(String id) {
        return userBaseInfoDao.findById(id).get();
    }

    @Override
    public void update(UserBaseInfo ubi) {
        userBaseInfoDao.save(ubi);
    }

    @Override
    public void save(UserBaseInfo ubi) {
        userBaseInfoDao.save(ubi);
    }

    @Override
    public void delete(String id) {
        userBaseInfoDao.deleteById(id);
    }

}
