package com.itstyle.cloud.web;

import com.alibaba.fastjson.JSONObject;
import com.itstyle.cloud.entity.ResponseEntity;
import com.itstyle.cloud.utils.FilePath;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author chenchao
 * @Date 23:04 2020/2/27
 * @Description 用户文件列表
 * @Param
 * @return
 **/

@Controller
@RequestMapping("/file")
public class FileListController {

    @ResponseBody
    @RequestMapping("/FileList")
    public Object getFilePathList(){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setData(FilePath.getFilePathTree("D:\\cloudFile_other"));
        responseEntity.setMsg("sussess");
        responseEntity.setStatu(200);
        return JSONObject.toJSON(responseEntity);
    }

    public static void main(String[] args) {
         List list = FilePath.getFilePathTree("D:\\cloudFile_other");
        System.out.println(list);
    }

}
