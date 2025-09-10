package com.wn.day33.controller;

import com.wn.day33.service.UserService;
import com.wn.day33.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@RequestMapping("User")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("userImagurl")
    public Utils userImagurl(MultipartFile multipartFile, @RequestParam String uname) throws IOException {
        //文件名
        String filename = multipartFile.getOriginalFilename();
        String baseUrl = "http://localhost:80/";
        String basePath = "D://photo/";
        //文件存放路径
        String path = basePath + filename;
        //随机生成文件名前缀
        String highName = UUID.randomUUID().toString();
        //查找文件名后缀
        String lowName = filename.substring(filename.lastIndexOf("."));
        //访问url
        String newName = highName + lowName;
        String url = baseUrl + newName;
        //新建文件
        File file = new File(basePath, newName);
        //将文件传入新文件中
        multipartFile.transferTo(file);

        userService.addImg(url, uname);

        return Utils.Ok(url);
    }


}
