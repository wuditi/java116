package com.wn.mapper;

import com.wn.entity.Dep;

import java.util.List;

/**
 * @author 17600
 * @description 针对表【dep】的数据库操作Mapper
 * @createDate 2025-09-01 21:24:45
 * @Entity com.wn.entity.Dep
 */
public interface DepMapper {

    List<Dep> findtAll();
}




