package com.bdqn.service;

import com.bdqn.pojo.Admin;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AdminService {
    Admin adminLogin(String adminName, String adminPassword);
}
