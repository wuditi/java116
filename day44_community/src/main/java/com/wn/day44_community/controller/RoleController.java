package com.wn.day44_community.controller;

import com.wn.day44_community.entity.Account;
import com.wn.day44_community.entity.Menu;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.entity.UserInfo;
import com.wn.day44_community.service.MenuService;
import com.wn.day44_community.service.RoleService;
import com.wn.day44_community.utils.PageResult;
import com.wn.day44_community.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
@CrossOrigin
public class RoleController {
       @Autowired
       private RoleService roleService;
       @Autowired
       private MenuService menuService;

       @GetMapping
       public ResultObj queryAllRole() {
          List<Role> list = roleService.list();
          return ResultObj.Ok(list);
       }
    @GetMapping("queryRoleAll")
    public ResultObj queryAccountAll(Integer pageNum, Integer pageSize, Role r) {

        PageResult<Role> result = roleService.selectAll(pageNum, pageSize, r);
        for(Role role:result.getList()){
            role.setMenus(menuService.selectMenuByRId(role.getRid()));
        }

        return ResultObj.Ok(result);
    }


   @PutMapping("/updateMenusByRoleId/{rid}")
    public ResultObj updateMenusByRoleId(@PathVariable Integer rid ,@RequestBody List<Menu> menus) {

       roleService.updateMenusByRid(rid, menus);


        return ResultObj.Ok();
    }


}

