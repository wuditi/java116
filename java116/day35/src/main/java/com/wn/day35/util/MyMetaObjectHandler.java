package com.wn.day35.util;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增数据时，自动填充新增时间和更新时间
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("addtime", new Date(), metaObject);
        this.setFieldValByName("updatetime", new Date(), metaObject);
    }

    /**
     * 更新数据时，自动填充更新时间
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updatetime", new Date(), metaObject);
    }
}
