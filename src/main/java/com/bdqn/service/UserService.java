package com.bdqn.service;

import com.bdqn.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    List<User> getAll();
}
