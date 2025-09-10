package com.wn.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mask {

    /**
     * 口罩类型
     */
    private String masktype;
    /**
     * 口罩名称
     */
    private String mname;
    /**
     * 口罩数量
     */
    private Integer num;
    /**
     * 口罩价格
     */
    private Double price;


}
