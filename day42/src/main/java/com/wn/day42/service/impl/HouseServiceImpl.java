package com.wn.day42.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day42.entity.Dweller;
import com.wn.day42.entity.House;
import com.wn.day42.mapper.DwellerMapper;
import com.wn.day42.mapper.HousrMapper;
import com.wn.day42.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl extends ServiceImpl<HousrMapper, House> implements HouseService {

}
