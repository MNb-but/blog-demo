package com.bdqn.dao;

import com.bdqn.pojo.Sort;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SortDao {
    @Select("select * from sort")
    List<Sort> getAll();
}
