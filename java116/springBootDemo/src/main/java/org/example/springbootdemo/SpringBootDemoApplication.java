package org.example.springbootdemo;

import lombok.Data;
import org.example.entity.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Data
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "org.example")
public class SpringBootDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);


    }

}
