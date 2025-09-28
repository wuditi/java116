package com.wn.day44_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day44_community.entity.Account;
import com.wn.day44_community.entity.Menu;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.utils.PageResult;

import java.util.List;

public interface RoleService extends IService<Role> {
    List<Role> findRoleByUid(Integer uid);

    PageResult<Role> selectAll(Integer pageNum, Integer pageSize, Role role);

    void updateMenusByRid(Integer rid,List<Menu> menus);


}
