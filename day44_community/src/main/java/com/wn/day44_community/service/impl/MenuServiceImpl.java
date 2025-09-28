package com.wn.day44_community.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day44_community.entity.Menu;
import com.wn.day44_community.mapper.MenuMapper;
import com.wn.day44_community.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectMenuByName(String username) {

        List<Menu> menus = menuMapper.selectMenuByName(username);
        return creatTreeNode(menus);
    }

    @Override
    public List<Menu> queryMenus() {
        List<Menu> menus = menuMapper.selectList(null);
        return creatTreeNode(menus);
    }
    //封装一个树形菜单创建的方法

    public List<Menu> creatTreeNode(List<Menu> menus) {

        List<Menu> oneList = new ArrayList<>();
        for (Menu menu : menus) {
            //查找一级菜单
            if (menu.getPid() == 0) {
                oneList.add(menu);
            }
        }

        for (Menu menu : oneList) {
            //查找子菜单
            List<Menu> OneChild = new ArrayList<>();
            for (Menu child : menus) {

                if (menu.getMid() == child.getPid()) {
                    OneChild.add(child);
                }

            }
            menu.setChildren(OneChild);
        }

        return oneList;
    }

    //根据角色id查菜单
    @Override
    public List<Menu> selectMenuByRId(Integer rid) {

        List<Menu> menus = menuMapper.selectMenuByRoleId(rid);
        return creatTreeNode(menus);
    }

    @Override
    public List<Menu> selectMenuByPId(Integer pid) {

        return menuMapper.selectMenuByPId(pid);
    }


}
