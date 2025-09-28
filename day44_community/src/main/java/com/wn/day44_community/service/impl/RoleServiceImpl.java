package com.wn.day44_community.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day44_community.entity.Menu;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.mapper.RoleMapper;
import com.wn.day44_community.service.RoleService;
import com.wn.day44_community.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findRoleByUid(Integer uid) {

        return roleMapper.selectRoleById(uid);
    }

    @Override
    public PageResult<Role> selectAll(@RequestParam Integer pageNum, @RequestParam Integer pageSize, Role role) {

        //条件封装
        LambdaQueryWrapper<Role> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(role.getRname() != null && !role.getRname().trim().isEmpty(), Role::getRname, role.getRname())
                .like(role.getRemark() != null && !role.getRemark().trim().isEmpty(), Role::getRemark, role.getRemark());


        //分页

        Page<Role> page = new Page<>(pageNum, pageSize);

        List<Role> roles = roleMapper.selectList(page,queryWrapper);

        if (roles != null && !(roles.isEmpty())) {


            PageResult<Role> result = new PageResult<>(page.getCurrent(), page.getSize(), page.getTotal(), roles);
            return result;
        }
        return null;
    }

    @Override
    @Transactional
    public void updateMenusByRid(Integer rid, List<Menu> menus) {

        //1.根据rid删除关联菜单
        roleMapper.delMenusByRid(rid);
        //2.添加菜单
        //遍历菜单集合
        for(Menu menu : menus) {
            roleMapper.insertMenusByRid(rid, menu.getMid());
        }
    }
}
