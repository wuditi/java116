package com.wn.test;

import com.wn.controller.MaskController;
import com.wn.entity.Mask;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MaskTest {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-mapper.xml");
        MaskController maskController = (MaskController) context.getBean("maskController");
        List<Mask> im = maskController.getMaskList();
        im.forEach(System.out::println);

    }
}
