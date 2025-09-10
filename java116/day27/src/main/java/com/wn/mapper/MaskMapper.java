package com.wn.mapper;

import com.wn.entity.Mask;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MaskMapper {

    @Select("SELECT * FROM t_mask")
    List<Mask> selectAll();
}
