package com.wn.day33.service.impl;

import com.wn.day33.mapper.CarMapper;
import com.wn.day33.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public List Cars() {
        List list = carMapper.getCars();
        return list;
    }
}
