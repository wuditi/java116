package com.wn.day44_community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.day44_community.entity.UserInfo;
import com.wn.day44_community.entity.vo.UserInfoVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Insert("insert into t_user_role(uid,rid) values(#{uid},#{rid})")
    void insertUserRoleDetail(@Param("uid") Integer uid, @Param("rid") Integer rid);

    //先删除所用有的角色，然后重新分配
    @Delete("delete from t_user_role where uid = #{uid}")
    void deleteRoleById(Integer uid);

}
