package com.wn.day29.mapper;

import com.wn.day29.entity.TMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 17600
 * @description 针对表【t_menu】的数据库操作Mapper
 * @createDate 2025-08-29 16:18:03
 * @Entity com.wn.day29.entity.TMenu
 */
@Mapper
public interface TMenuMapper {

    @Select("select * from t_menu m inner join t_role_menu rm on m.mid=rm.mid where rid=#{rid}")
    List<TMenu> selectMenuByRid(Integer Rid);

}




