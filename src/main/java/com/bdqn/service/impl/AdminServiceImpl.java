package com.bdqn.service.impl;

import com.bdqn.dao.AdminDao;
import com.bdqn.pojo.Admin;
import com.bdqn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin adminLogin(String adminName, String adminPassword) {
        return adminDao.adminLogin(adminName,adminPassword);
    }
}
