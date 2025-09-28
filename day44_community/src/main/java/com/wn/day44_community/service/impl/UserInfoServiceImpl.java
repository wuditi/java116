package com.wn.day44_community.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.entity.UserInfo;
import com.wn.day44_community.mapper.UserInfoMapper;
import com.wn.day44_community.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    public UserInfo login(UserInfo userInfo) {

        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(UserInfo::getUsername, userInfo.getUsername())
                .eq(UserInfo::getPassword, userInfo.getPassword());


        UserInfo user = userInfoMapper.selectOne(queryWrapper);
        return user;

    }

    @Override
    public void insertUserRoleDetail(Integer uid, Integer rid) {
        userInfoMapper.insertUserRoleDetail(uid, rid);
    }

    @Override
    @Transactional
    public void updateRolesById(UserInfo userinfo) {

        if (userinfo.getId() != null) {
            //1.根据用户编号删除管理所有角色信息
            userInfoMapper.deleteRoleById(userinfo.getId());
            //2.添加新的角色信息
            List<Role> roles = userinfo.getRoles();
            //遍历集合
            for (Role role : roles) {
                //新增
                userInfoMapper.insertUserRoleDetail(userinfo.getId(), role.getRid());
            }
        } else {
            throw new RuntimeException("修改用户角色信息中用户Id不能为null");
        }
    }
}



