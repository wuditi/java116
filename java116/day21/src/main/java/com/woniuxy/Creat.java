package com.woniuxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Creat {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("sid", 2);
        map.put("aa", 3);
        Class cla = Class.forName("com.woniuxy01.Student");
        Student student = getMap(map, Student.class);


    }

    public static <T> T getMap(Map<String, Object> map, Class<T> cla) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T t = cla.getDeclaredConstructor().newInstance();
        Field[] fields = cla.getDeclaredFields();

        for (Field field : fields) {

            if (map.containsKey(field.getName())) {

                Object value = map.get(field.getName());
                field.setAccessible(true);
                field.set(t, value);


            }

        }

        return t;
    }


}
