package com.wn.entity;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "dogbean")
public class Dog {
    // @Value("${dogbean.id}")
    private Integer id;
    // @Value("${dogbean.name}")
    private String name;


}