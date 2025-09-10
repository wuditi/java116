package com.wn.mapper;

import com.wn.entity.Dep;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepMapper {

    @Select("SELECT * FROM dep")
    List<Dep> selectAll();

}
