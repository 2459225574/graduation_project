package com.cc.mapper.member;

import com.cc.model.member.Member;
import com.cc.core.CustomerMapper;
import org.springframework.stereotype.Service;

/**
 * @author cc
 */
@Service
public interface MemberMapper extends CustomerMapper<Member> {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Member selectByUsername(String username);
}
