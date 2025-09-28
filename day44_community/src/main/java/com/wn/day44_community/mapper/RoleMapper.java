package com.wn.day44_community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.day44_community.entity.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select * from t_role r join t_user_role ur on ur.rid=r.rid where ur.uid=#{id}")
    List<Role> selectRoleById(Integer id);


    /**
     * 根据rid删除管理所有菜单
     */
    @Delete("delete from t_role_menu where rid=#{rid}")
    void delMenusByRid(Integer rid);
    /**
     * 给指定角色添加 菜单
     */
    @Insert("insert into t_role_menu(rid,mid) values(#{rid},#{mid})")
    void insertMenusByRid(@Param("rid") Integer rid, @Param("mid") Integer mid);

}
