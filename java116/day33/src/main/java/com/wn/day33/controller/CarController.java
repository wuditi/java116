package com.wn.day33.controller;

import com.wn.day33.exception.NamedExpection;
import com.wn.day33.service.CarService;
import com.wn.day33.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import java.util.List;

@RestController
@RequestMapping("Car")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/AddCars")
    public Utils AddCars() {

//        try {

        List carList = carService.Cars();
        //int i = 10/0
        return Utils.Ok(carList);
//
//        } catch (Exception e) {
//            return Utils.failed();
//        }

    }

    @RequestMapping("/nulladdCars")
    public Utils nulladdCars() {

//        try {

        List carList = carService.Cars();
        String s = null;
        s.length();
        return Utils.Ok(carList);
//
//        } catch (Exception e) {
//            return Utils.failed();
//        }

    }

    @RequestMapping("loginCar")
    public void loginCar(String car) {
        List carList = List.of("Bentley", "bmw", "benz", "Porsche");

        for (Object cars : carList) {

            if (cars.toString().equals(car)) {
                Utils.Ok(cars);
            } else {
                throw new NamedExpection(car);
            }
        }
    }

    @RequestMapping("inputFile")
    public Utils inputFile(MultipartFile multipartFile) {
        String filename = multipartFile.getOriginalFilename();
        System.out.println(filename);
        long size = multipartFile.getSize();


        return Utils.Ok();
    }

}




