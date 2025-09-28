package com.wn.day44_community.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day44_community.entity.Dweller;
import com.wn.day44_community.entity.House;
import com.wn.day44_community.mapper.DwellerMapper;
import com.wn.day44_community.mapper.HousrMapper;
import com.wn.day44_community.service.DwellerService;
import com.wn.day44_community.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DwellerServiceImpl extends ServiceImpl<DwellerMapper, Dweller> implements DwellerService {
    @Autowired
    private DwellerMapper dwellerMapper;
    @Autowired
    private HousrMapper housrMapper;

    @Override
    public PageResult<Dweller> selectAll(@RequestParam Integer pageNum, @RequestParam Integer pageSize, Dweller dweller) {

       //条件封装
       LambdaQueryWrapper<Dweller> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(dweller.getUsername() != null && !dweller.getUsername().trim().isEmpty(), Dweller::getUsername, dweller.getUsername())
                .eq(dweller.getSex() != null && !dweller.getSex().trim().isEmpty(), Dweller::getSex, dweller.getSex())
                .like(dweller.getRemarks() != null && !dweller.getRemarks().trim().isEmpty(),
                        Dweller::getRemarks, dweller.getRemarks())
                .ge(dweller.getDeltime() != null, Dweller::getDeltime, dweller.getDeltime());


        //分页

        Page<Dweller> page = new Page<>(pageNum, pageSize);

        List<Dweller> dwellers = dwellerMapper.selectList(page,queryWrapper);

        if (dwellers != null && !(dwellers.isEmpty())) {

            for (Dweller d : dwellers) {
                House house = housrMapper.selectById(d.getHouseId());
                d.setHouse(house);
            }

            PageResult<Dweller> result = new PageResult<>(page.getCurrent(), page.getSize(), page.getTotal(), dwellers);
            return result;
        }
        return null;
    }
}
