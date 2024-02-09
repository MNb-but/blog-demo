package com.bdqn.controller;

import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Result getAll() {
        List<User> all = userService.getAll();
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code, all, msg);
    }
}
