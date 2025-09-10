package com.wn.day29.mapper;

import com.wn.day29.entity.TRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 17600
 * @description 针对表【t_role】的数据库操作Mapper
 * @createDate 2025-08-29 16:18:03
 * @Entity com.wn.day29.entity.TRole
 */
@Mapper
public interface TRoleMapper {

    @Select("select * from t_role")
    @Results({
            @Result(id = true, property = "rid", column = "rid"),

            @Result(column = "rid", property = "tMenus", many = @Many(select = "com.wn.day29.mapper.TMenuMapper.selectMenuByRid")),

    })
    List<TRole> selectAll();

    @Select("select * from t_role r inner join t_user_role ur on r.rid=ur.rid where uid=#{id}")
    List<TRole> selectByUid(Integer id);


}




