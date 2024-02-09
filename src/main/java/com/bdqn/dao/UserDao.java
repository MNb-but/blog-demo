package com.bdqn.dao;

import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> getAll();
}
