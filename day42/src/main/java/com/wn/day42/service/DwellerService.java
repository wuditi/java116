package com.wn.day42.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wn.day42.entity.Dweller;
import com.wn.day42.utils.PageResult;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface DwellerService extends IService<Dweller> {
    PageResult<Dweller> selectAll(Integer pageNum, Integer pageSize, Dweller dweller);
}

