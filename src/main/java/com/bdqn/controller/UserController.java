package com.bdqn.controller;

import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Result getById(@PathVariable int id) {
        User user = userService.getById(id);
        Integer code = user != null ? Code.GET_OK : Code.GET_ERR;
        String msg = user != null ? "" : "数据查询失败，请重试！";
        return new Result(code, user, msg);
    }

    @GetMapping
    public Result getAll() {
        List<User> all = userService.getAll();
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code, all, msg);
    }

    @GetMapping("/login/{userName}/{userPassword}")
    public Result login(@PathVariable String userName,@PathVariable String userPassword){
        User u = userService.login(userName, userPassword);
        Integer code = u != null ? Code.GET_OK : Code.GET_ERR;
        String msg = u != null ? "" : "账号或密码错误，请重试！";
        return new Result(code, u, msg);
    }

    @PostMapping("/register")
    public Result addUser(@RequestBody User user) {
        boolean flag = userService.addUser(user);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @GetMapping("/getUser/{userName}")
    public Result getUser(@PathVariable String userName) {
        User u = userService.getUser(userName);
        Integer code = u != null ? Code.GET_OK : Code.GET_ERR;
        String msg = u != null ? "" : "数据查询失败，请重试！";
        return new Result(code, u, msg);
    }
}
