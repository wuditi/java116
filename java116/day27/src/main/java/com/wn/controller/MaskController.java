package com.wn.controller;

import com.wn.entity.Mask;
import com.wn.service.MaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MaskController {
    @Autowired
    private MaskService maskService;


    public List<Mask> getMaskList() {

        return maskService.getMaskIm();

    }
}
