package com.wn.day44_community.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.entity.UserInfo;
import com.wn.day44_community.entity.vo.UserInfoVo;
import com.wn.day44_community.mapper.UserInfoMapper;
import com.wn.day44_community.service.RoleService;
import com.wn.day44_community.service.UserInfoService;
import com.wn.day44_community.utils.PageResult;
import com.wn.day44_community.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private RoleService roleService;

    @GetMapping("selectUserAll")
    public ResultObj selectUserAll(UserInfoVo userInfoVo) {

        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(userInfoVo.getUsername() != null && !userInfoVo.getUsername().trim().isEmpty(), UserInfo::getUsername, userInfoVo.getUsername())
                .eq(userInfoVo.getType() != null, UserInfo::getType, userInfoVo.getType())
                .like(userInfoVo.getRemarks() != null && !userInfoVo.getRemarks().trim().isEmpty(),
                        UserInfo::getRemarks, userInfoVo.getRemarks())
                .ge(userInfoVo.getIsdelete() != null, UserInfo::getIsdelete, userInfoVo.getIsdelete());

        Page<UserInfo> page = new Page<>(userInfoVo.getPageNum(), userInfoVo.getPageSize());

        Page<UserInfo> userInfoPage = userInfoService.page(page, queryWrapper);


        List<UserInfo> userInfos = userInfoPage.getRecords();
        for (UserInfo userInfo : userInfos) {
            Integer id = userInfo.getId();
            List<Role> roles = roleService.findRoleByUid(id);
            userInfo.setRoles(roles);
        }

        PageResult<UserInfo> result = new PageResult<>(userInfoPage.getCurrent(), userInfoPage.getSize(), userInfoPage.getTotal(), userInfoPage.getRecords());

            return ResultObj.Ok(result);
    }

    @PostMapping("/loadFile")
    public ResultObj loadFile(MultipartFile multipartFile) throws IOException {

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
        multipartFile.transferTo( file);
        //在前端回显图片url
        return ResultObj.Ok(url);
    }

    @PostMapping("/insert")
    public ResultObj insert(@RequestBody UserInfo userInfo) {
        //1.生成一个默认密码
        String md5Pwd = DigestUtils.md5DigestAsHex("123".getBytes());
        userInfo.setPassword(md5Pwd);
        //2.设置用户可用
        userInfo.setIsdelete(0);
        //3.调用service层方法完成新增
        userInfoService.save(userInfo);
        //添加一个默认角色
        userInfoService.insertUserRoleDetail(userInfo.getId(),101);
        return ResultObj.Ok();
    }
    @PostMapping("/update")
    public ResultObj update(@RequestBody UserInfo userInfo) {

        //3.调用service层方法完成新增
        userInfoService.saveOrUpdate(userInfo);

        return ResultObj.Ok();
    }
    @DeleteMapping("/deleteById")
    public ResultObj deleteById(Integer id) {

        userInfoService.removeById( id);

        return ResultObj.Ok();
    }

    @PutMapping("/updateUserRole")
    public ResultObj updateUserRole(@RequestBody UserInfo  userInfo) {

        userInfoService.updateRolesById(userInfo);

        return ResultObj.Ok();
    }
    @DeleteMapping("/batchedDelete/{ids}")
    public ResultObj batchedDelete(@PathVariable List ids) {

        userInfoService.removeByIds(ids);
        return ResultObj.Ok();

    }



}
