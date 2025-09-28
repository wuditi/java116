package com.wn.day37community.controller;

import com.wn.day37community.entity.Building;
import com.wn.day37community.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bu")
public class BulidingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("all")
    public List<Building> getAllBuilding() {

        return buildingService.list();

    }

    @GetMapping("id")
    public Building getBuildingById(Integer id) {

        return buildingService.getById(id);

    }


}
