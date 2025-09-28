package com.wn.day44_community.controller;

import com.wn.day44_community.entity.Menu;
import com.wn.day44_community.service.MenuService;
import com.wn.day44_community.utils.ResultObj;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("menu")
@CrossOrigin
public class MenuController {


    @Autowired
    private MenuService menuService; //自动注入MenuService bean


    /**
     * 根据用户名查询对应菜单信息
     */
    @GetMapping("/queryMenuByName/{username}")
    public ResultObj queryMenuByName(@PathVariable String username) {
        return ResultObj.Ok(menuService.selectMenuByName(username));
    }

    /**
     * 查询所有菜单信息,根据pid去查
     */
    @GetMapping("queryAllMenuByPid")
    public ResultObj queryAllMenuByPid(Integer pid) {
        return ResultObj.Ok(menuService.list());
    }

    @GetMapping("/menus")
    public ResultObj queryMenus() {
        //service调用查询所有方法
        List<Menu> list = menuService.queryMenus();
        return ResultObj.Ok(list);
    }


    @PostMapping("/addAndUpdate")
    public ResultObj addAndUpdate(@RequestBody Menu menu) {

        menu.setCreatetime(new Date());
        menu.setUpdatetime(new Date());
        if (menu.getPid() == null) {
            menu.setPid(0);
        }
        menuService.saveOrUpdate(menu);
        return ResultObj.Ok();
    }

    @PostMapping("/update")
    public ResultObj update(@RequestBody Menu menu) {

        menu.setCreatetime(new Date());
        menu.setUpdatetime(new Date());

        menuService.saveOrUpdate(menu);
        return ResultObj.Ok();
    }

    @DeleteMapping("/deleteById")
    public ResultObj delete(Integer mid , Integer  pid) {
//               判断菜单级别
        if (pid != 0) {
            menuService.removeById(mid);
            return ResultObj.Ok();
        } else {
            List<Menu> menus = menuService.selectMenuByPId(mid);
            List<Integer> counts=new ArrayList<>();
             for(Menu m:menus){
              counts.add(m.getMid());
             }
             menuService.removeByIds(counts);
             menuService.removeById(mid);
            return ResultObj.Ok();
        }

    }

}
