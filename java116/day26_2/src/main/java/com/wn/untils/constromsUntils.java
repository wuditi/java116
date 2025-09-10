package com.wn.untils;

import com.wn.mapper.BookMapper;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class constromsUntils {

    //接受bean
    public Map<String, Object> map = new HashMap<String, Object>();

    public InputStream inputStream;

    //
    public void ApplicationContext(String file) {

        inputStream = this.getClass().getClassLoader().getResourceAsStream(file);

    }

    // 解析
    public void initobj() throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {

        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);

        Element root = document.getRootElement();
        List<Element> elements = root.elements("bean");
        for (Element element : elements) {

            String id = element.attributeValue("id");
            String classBean = element.attributeValue("class");

            Class cla = Class.forName(classBean);
         Object instance= cla.newInstance();



            List<Element> beans = root.elements("property");

            for (Element propertyTh : beans) {

                String key = propertyTh.attributeValue("name");
                String value = propertyTh.attributeValue("value");
                String ref = propertyTh.attributeValue("ref");

                    // 找 setter 方法名：set + 首字母大写
                    String methodName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1);
                    // 反射调用 setter
                    Method[] method = cla.getMethods();
                    for(Method m : method) {

                         m.invoke(instance,value);

                    }

                    // 普通属性注

            }


            }

        }


    }
}
