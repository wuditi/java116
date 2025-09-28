package com.wn.day42.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wn.day42.entity.Dweller;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DwellerMapper  extends BaseMapper<Dweller> {
}
