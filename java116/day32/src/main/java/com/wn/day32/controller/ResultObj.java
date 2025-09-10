package com.wn.day32.controller;


import com.wn.day32.entity.Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("Result")
@RestController
public class ResultObj {

    public Map<String, Object> resultObj01() {

        Map<String, Object> resultObj = new HashMap<String, Object>();
        resultObj.put("code", 200);
        resultObj.put("msg", "success");
        resultObj.put("data", List.of("s"));
        return resultObj;

    }


    @RequestMapping("resultObj02")
    public Utils resultObj02() {
        //通过service判断之后统一响应给前端

        return Utils.Ok().code(120);


    }


}
