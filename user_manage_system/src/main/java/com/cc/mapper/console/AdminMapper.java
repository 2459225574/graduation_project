package com.cc.mapper.console;

import com.cc.model.console.Admin;
import com.cc.core.CustomerMapper;
import org.springframework.stereotype.Service;

/**
 * @author cc
 */
@Service
public interface AdminMapper extends CustomerMapper<Admin> {
    /**
     * 根据用户名获取用户
     * @param userName
     * @return
     */
    Admin selectByUsername(String userName);

    /**
     * 根据ID删除
     * @param id
     */
    void deleteById(String id);
}
