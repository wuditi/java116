package com.wn.factory;

import com.wn.entity.UseName;

public class BeanUserFactory {

    public static UseName beanUser() {

        return new UseName();
    }


    public UseName useBean() {
        return new UseName();
    }

}
