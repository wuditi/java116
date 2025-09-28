package com.wn.day44_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day44_community.entity.House;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.utils.PageResult;

public interface HouseService extends IService<House> {

    PageResult<House> selectAll(Integer pageNum, Integer pageSize, House house);
}
