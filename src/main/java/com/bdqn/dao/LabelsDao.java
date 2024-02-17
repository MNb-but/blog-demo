package com.bdqn.dao;

import com.bdqn.pojo.Labels;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LabelsDao {
    @Select("select * from labels")
    List<Labels> getAll();
}
