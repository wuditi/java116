package com.wn.day44_community.entity.vo;

import com.wn.day44_community.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo extends UserInfo {

    private String codeId;
    private String verifyCode;
    private Long pageNum;
    private Long pageSize;
}
