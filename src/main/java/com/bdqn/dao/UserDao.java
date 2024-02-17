package com.bdqn.dao;

import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user where user_id = #{id}")
    User getById(Integer id);

    @Select("select * from user")
    List<User> getAll();

    @Select("select * from user where user_name = #{userName} and user_password = #{userPassword}")
    User login(@Param("userName")String userName,@Param("userPassword") String userPassword);

    @Insert("insert into user (user_name, user_password,user_email,user_registration_time) values (#{userName},#{userPassword},#{userEmail},now())")
    int addUser(User user);

    @Select("select * from user where user_name = #{userName}")
    User getUser(String userName);
}
