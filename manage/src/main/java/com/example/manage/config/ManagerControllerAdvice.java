package com.example.manage.config;

import com.example.manage.vo.ResultVo;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ManagerControllerAdvice {


    @ExceptionHandler(value = Exception.class)
    public ResultVo errorHandler(Exception ex) {
        System.out.println("ex" + ex);
        return ResultVo.serverUnknown(ex.toString());
    }
}
