package com.wn.day44_community.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("userinfo")

public class UserInfo {

       @TableId(value = "id",type = IdType.AUTO)
       private  Integer id;
       private  String username;
       private  String password;
       private  Integer type;
       private  String remarks;
       @TableField("imgPath")
       private  String imgPath;
       private  Integer isdelete;
       @TableField(exist = false)
       private List<Role> roles;


}
