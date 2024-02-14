package com.bdqn.controller;

import com.bdqn.exception.BusinessException;
import com.bdqn.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    // 系统异常处理
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 业务异常处理
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(), null, ex.getMessage());
    }

    // 处理其他异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        System.out.println("出现异常了！");
        System.out.println(ex);
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙");
    }
}
