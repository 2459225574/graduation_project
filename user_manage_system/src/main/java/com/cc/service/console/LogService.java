package com.cc.service.console;

import com.cc.mapper.console.LogMapper;
import com.cc.model.console.Log;
import com.cc.util.CamelCaseUtil;
import com.cc.util.DateUtil;
import com.cc.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cc
 */
@Service
public class LogService {

    @Autowired
    private LogMapper logMapper;

    public List<Log> getPageList(Log log) {
        PageHelper.offsetPage(log.getOffset(), log.getLimit());
        PageHelper.orderBy(CamelCaseUtil.toUnderlineName(log.getSort())+" "+log.getOrder());
        return logMapper.selectAll();
    }

    public void insert(Log log){
        logMapper.insert(log);
    }

    public void insertLoginLog(String username, String ip, String action){
        Log  log = new Log();
        log.setLogId(UuidUtil.getUUID());
        log.setLogUser(username);
        log.setLogTime(DateUtil.getCurrentTime());
        log.setLogIp(ip);
        log.setLogAction(action);
        this.insert(log);
    }


}
