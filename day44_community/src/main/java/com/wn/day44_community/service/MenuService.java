package com.wn.day44_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day44_community.entity.Menu;

import java.util.List;

public interface MenuService extends IService<Menu> {
    List<Menu> selectMenuByName(String username);

    List<Menu> queryMenus();

    List<Menu> selectMenuByRId(Integer rid);

    List<Menu> selectMenuByPId(Integer pid);
}
