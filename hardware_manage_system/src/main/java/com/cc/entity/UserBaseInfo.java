package com.cc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author chenchao
 * @Date 9:14 2020/2/19
 * @Description 用户信息实体类
 * @Param
 * @return
 **/
@Data   //省略get和set方法
public class UserBaseInfo {
  private String id;
  private String name;
  private String nickName;
  private String sex;
  private long age;
  private String idCardNo;
  private String telephone;
  private String email;
  private String password;
}
