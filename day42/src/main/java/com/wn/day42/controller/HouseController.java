package com.wn.day42.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wn.day42.entity.Dweller;
import com.wn.day42.entity.House;
import com.wn.day42.service.HouseService;
import com.wn.day42.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
@CrossOrigin
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping
    public ResultObj houserAll() {

        LambdaQueryWrapper<House> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(House::getId,House::getNumbers, House::getBuildingId);
        List<House> houses = houseService.list(wrapper);
        if (houses != null && !houses.isEmpty()) {
            return ResultObj.Ok(houses);
        }

        return null;
    }


}
