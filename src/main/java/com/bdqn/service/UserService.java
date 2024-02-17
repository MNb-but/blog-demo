package com.bdqn.service;

import com.bdqn.pojo.Articles;
import com.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    User getById(Integer id);

    List<User> getAll();

    User login(String userName,String userPassword);

    boolean addUser(User user);

    User getUser(String userName);

}
