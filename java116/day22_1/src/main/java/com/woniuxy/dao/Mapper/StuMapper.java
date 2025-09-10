package com.woniuxy.dao.Mapper;

import com.woniuxy.entity.Dep;
import com.woniuxy.entity.Emp;
import com.woniuxy.entity.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper {
    void insert(Stu stu);

    void update(Stu stu);

    Stu selectBysid(int sid);

    List<Stu> selectALL(int sid);

    List<Stu> selectByCondition01(Stu stu);

    void insertBatch(List<Stu> stus);

    int selectConditionPageCount(@Param("stus") Stu stu);

    List<Stu> selectConditionPage(@Param("stus") Stu stu, @Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize);

    Emp selectByEid(Emp emp);

    List<Emp> selectByDid(Dep dep);
}
