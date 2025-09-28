package com.wn.day44_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day44_community.entity.Dweller;
import com.wn.day44_community.utils.PageResult;

public interface DwellerService extends IService<Dweller> {
    PageResult<Dweller> selectAll(Integer pageNum, Integer pageSize, Dweller dweller);
}

