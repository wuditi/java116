package com.wn.day37.function;


import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.function.Function;

public class BuindFindFunction implements Function<BuindFindFunction.Request, Object> {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Object apply(Request request) {

        restTemplate.getForObject("http://localhost:8081/bu/all", Object.class, request.getId());
        return null;
    }


    public static class Request {
        private Integer id; //节后楼宇编号

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }


}
