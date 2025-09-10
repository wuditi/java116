package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
//@ConfigurationProperties(prefix = "dogbean")
public class Dog {
    @Value("${dogbean.id}")
    private int id;
    @Value("${dogbean.name}")
    private String name;
//
//    @Override
//    public String toString() {
//        return "Dog{id=" + id + ", name='" + name + "'}";
//    }
//
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}


