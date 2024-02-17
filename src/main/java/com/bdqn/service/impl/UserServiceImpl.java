package com.bdqn.service.impl;

import com.bdqn.dao.UserDao;
import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User login(String userName,String userPassword) {
        return userDao.login(userName, userPassword);
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user) > 0;
    }

    @Override
    public User getUser(String userName) {
        return userDao.getUser(userName);
    }

}
