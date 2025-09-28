package com.wn.day42.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageResult<T> {

    private Long pageNum;
    private Long pageSize;
    private Long total; //表示总记录数
    private List<T> list; //每页显示实际数据

}
