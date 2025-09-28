package com.wn.day37.controller;

import com.wn.day37.template.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("b")
public class BulidController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("find")
    public Object findAll() {

        return restTemplate.getForObject("http://localhost:8081/bu/all", List.class);

    }

}
