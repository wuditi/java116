package com.wn.day44_community.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day44_community.entity.Dweller;
import com.wn.day44_community.entity.House;
import com.wn.day44_community.entity.Role;
import com.wn.day44_community.mapper.HousrMapper;
import com.wn.day44_community.service.HouseService;
import com.wn.day44_community.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl extends ServiceImpl<HousrMapper, House> implements HouseService {
    @Autowired
    private HousrMapper housrMapper;

    @Override
    public PageResult<House> selectAll(Integer pageNum, Integer pageSize, House house) {
        //条件封装
        LambdaQueryWrapper<House> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(house.getIntoDate() != null, House::getIntoDate, house.getIntoDate())
                .like(house.getRemarks() != null && !house .getRemarks().trim().isEmpty(),
                       House::getRemarks, house.getRemarks())
                .ge(house.getArea() != null, House::getArea, house.getArea());

        //分页
        Page<House> page = new Page<>(pageNum, pageSize);

        List<House> houses = housrMapper.selectList(page, queryWrapper);

        if (houses != null && !(houses.isEmpty())) {


            PageResult<House> result = new PageResult<>(page.getCurrent(), page.getSize(), page.getTotal(), houses);
            return result;
        }
        return null;
    }
}
