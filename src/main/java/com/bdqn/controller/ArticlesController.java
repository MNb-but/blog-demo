package com.bdqn.controller;

import com.bdqn.pojo.Articles;
import com.bdqn.pojo.User;
import com.bdqn.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping
    public Result getAll() {
        List<Articles> all = articlesService.getAll();
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code, all, msg);
    }

    @PutMapping("/passOne")
    public Result passOne(@RequestBody Articles articles) {
        boolean flag = articlesService.passOne(articles);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @PutMapping("/passTow")
    public Result passTow(@RequestBody Articles articles) {
        boolean flag = articlesService.passTow(articles);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

}
