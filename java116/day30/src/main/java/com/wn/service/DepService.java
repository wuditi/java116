package com.wn.service;

import com.wn.entity.Dep;
import com.wn.mapper.DepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.ref.PhantomReference;
import java.util.List;

@Service
public class DepService {
    @Autowired
    private DepMapper depMapper;

    public void find() {
        List<Dep> deps = depMapper.selectAll();
        deps.stream().forEach(System.out::println);

    }


}
