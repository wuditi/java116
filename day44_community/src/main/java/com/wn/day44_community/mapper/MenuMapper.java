package com.wn.day44_community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.day44_community.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<Menu> {


    @Select("select * from t_menu m " +
            "join t_role_menu rm on m.mid=rm.mid " +
            "join t_role r on r.rid=rm.rid " +
            "join t_user_role ur on ur.rid=r.rid" +
            " join userinfo u on u.id=ur.uid " +
            "where u.username=#{username} ")
    List<Menu> selectMenuByName(String username);


    @Select("select * from t_menu where pid=#{pid}")
    List<Menu> selectMenuByPId(Integer pid);

    @Select("select * from t_menu")
    List<Menu> selectMenus();

    @Select("select * from t_menu m join t_role_menu rm on rm.mid=m.mid and rm.rid=#{rid} ")
    List<Menu> selectMenuByRoleId(Integer rid);



}