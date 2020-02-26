package com.cc.dao;

import com.cc.entity.UserBaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author chenchao
 * @Date 17:03 2020/2/20
 * @Description
 * @Param
 * @return
 **/
public interface UserBaseInfoDao extends JpaRepository<UserBaseInfo,String> , JpaSpecificationExecutor<UserBaseInfo> {}
