package com.wn.day33.mapper;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarMapper {


    public List getCars() {

        return List.of("bmw", "bnze");
    }

}
