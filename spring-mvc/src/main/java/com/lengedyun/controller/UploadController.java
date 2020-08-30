package com.lengedyun.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author zjy
 * @title: UploadController
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/30 15:49
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file){
        try {

            FileUtils.writeByteArrayToFile(new File("E://upload/"+file.getOriginalFilename()),file.getBytes());
            //file.transferTo(new File("E:/upload/"+file.getOriginalFilename()));
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "uploadError";
        }
    }
}
