package com.wn.day29.mapper;

import com.wn.day29.entity.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 17600
 * @description 针对表【userinfo】的数据库操作Mapper
 * @createDate 2025-08-29 16:18:03
 * @Entity com.wn.day29.entity.Userinfo
 */
@Mapper
public interface UserinfoMapper {

    @Select("select * from userinfo where id=#{id}")
    @Results({

            @Result(id = true, column = "id", property = "id"),
            @Result(column = "id", property = "tRoles", many = @Many(select = "com.wn.day29.mapper.TRoleMapper.selectByUid"))

    })
    List<Userinfo> selectUserinfoById(Integer id);

    @Insert("INSERT INTO userinfo values(null,#{username},#{password},#{password},#{type},#{remarks},#{imgPath},#{isdelete})")
    void insertUserinfo(Userinfo userinfo);

    @Insert("INSERT INTO t_user_role values (null,#{uid},#{rid})")
    void insertUserRole(Integer id, Integer uid, Integer rid);


}




