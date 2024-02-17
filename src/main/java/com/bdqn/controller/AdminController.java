package com.bdqn.controller;

import com.bdqn.pojo.Admin;
import com.bdqn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/{adminName}/{adminPassword}")
    public Result login(@PathVariable String adminName, @PathVariable String adminPassword){
        Admin u = adminService.adminLogin(adminName, adminPassword);
        Integer code = u != null ? Code.GET_OK : Code.GET_ERR;
        String msg = u != null ? "" : "账号或密码错误，请重试！";
        return new Result(code, u, msg);
    }
}
