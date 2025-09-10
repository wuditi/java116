package com.wn.day29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp {
    /**
     * 员工编号
     */
    private Integer empno;
    /**
     * 员工名
     */
    private String ename;
    /**
     * 职位
     */
    private String job;
    /**
     *
     */
    private Integer mgr;
    /**
     * 入职日期
     */
    private Date hiredate;
    /**
     * 工资
     */
    private BigDecimal sal;
    /**
     * 补贴
     */
    private BigDecimal comm;
    /**
     * 部门编号
     */
    private Integer deptno;


}
