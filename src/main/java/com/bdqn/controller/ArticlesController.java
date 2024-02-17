package com.bdqn.controller;

import com.bdqn.pojo.Articles;
import com.bdqn.service.ArticlesService;
import org.apache.ibatis.annotations.Delete;
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

    @GetMapping("/getCard/{userName}")
    public Result getCard(@PathVariable String userName) {
        Articles articles = articlesService.getCard(userName);
        Integer code = articles != null ? Code.GET_OK : Code.GET_ERR;
        String msg = articles != null ? "" : "数据查询失败，请重试！";
        return new Result(code,articles,msg);
    }

    @GetMapping("/getUserBlog/{userName}")
    public Result getUserBlog(@PathVariable String userName) {
        List<Articles> articles = articlesService.getUserBlog(userName);
        Integer code = articles != null ? Code.GET_OK : Code.GET_ERR;
        String msg = articles != null ? "" : "数据查询失败，请重试！";
        return new Result(code,articles,msg);
    }

    @PostMapping
    public Result insertBlog(@RequestBody Articles articles) {
        boolean flag = articlesService.insertBlog(articles);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping("/upBlog")
    public Result upBlog(@RequestBody Articles articles) {
        boolean flag = articlesService.upBlog(articles);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delBlog(@PathVariable Integer id){
        boolean flag = articlesService.delBlog(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }
}
