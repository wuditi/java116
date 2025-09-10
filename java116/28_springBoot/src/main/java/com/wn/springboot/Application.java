package com.wn.springboot;

import com.wn.entity.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.wn")

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog);
    }

}
