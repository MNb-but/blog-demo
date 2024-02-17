package com.bdqn.controller;

import com.bdqn.pojo.Labels;
import com.bdqn.service.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/labels")
public class LabelsController {

    @Autowired
    private LabelsService labelsService;

    @GetMapping
    public Result getAll() {
        List<Labels> all = labelsService.getAll();
        Integer code = all != null ? Code.GET_OK : Code.GET_ERR;
        String msg = all != null ? "" : "数据查询失败，请重试！";
        return new Result(code, all, msg);
    }
}
