package com.wn.service.impl;

import com.wn.entity.Mask;
import com.wn.mapper.MaskMapper;
import com.wn.service.MaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaskServiceImpl implements MaskService {
    @Autowired
    private MaskMapper maskMapper;

    @Override
    public List<Mask> getMaskIm() {
        return maskMapper.selectAll();
    }
}
