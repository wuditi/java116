package com.wn.untils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class SelvertUntil {

    public static <T> T getBean(Map map, Class<T> clazz) throws InstantiationException, IllegalAccessException, InvocationTargetException {


        T beans = clazz.newInstance();
        BeanUtils.populate(beans, map);
        return beans;


    }

}
