package com.bdqn.controller;

import com.bdqn.pojo.Sort;
import com.bdqn.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sort")
public class SortController {

    @Autowired
    private SortService sortService;
    @GetMapping
    public Result getAll() {
        List<Sort> all = sortService.getAll();
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code, all, msg);
    }
}
