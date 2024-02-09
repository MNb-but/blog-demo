package com.bdqn.service;

import com.bdqn.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {

    User getById(Integer id);

    List<User> getAll();
}
