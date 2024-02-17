package com.bdqn.dao;

import com.bdqn.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminDao {
    @Select("select * from admin where admin_name = #{adminName} and admin_password = #{adminPassword}")
    Admin adminLogin(@Param("adminName")String adminName, @Param("adminPassword") String adminPassword);
}
