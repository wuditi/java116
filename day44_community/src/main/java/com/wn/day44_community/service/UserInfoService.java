package com.wn.day44_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day44_community.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoService extends IService<UserInfo> {
    UserInfo login(UserInfo userInfo);

    /**
     * 向UserRole中间表查询一条数据
     *
     */
    void insertUserRoleDetail(Integer uid,  Integer rid);


    void updateRolesById(UserInfo userinfo);
}
