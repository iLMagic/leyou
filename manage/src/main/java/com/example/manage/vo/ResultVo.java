package com.example.manage.vo;

import java.sql.ResultSet;

public class ResultVo<T> {
    private Integer code;
    private T data;
    private String message;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public static <T> ResultVo<T> success(T data) {
        ResultVo<T> vo = new ResultVo<T>();
        vo.message = "success";
        vo.code = 1000;
        vo.data = data;
        return vo;
    }

    public static <T> ResultVo<T> serverUnknown(T data) {
        ResultVo<T> vo = new ResultVo<T>();
        vo.message = "服务器发生未知错误";
        vo.code = 500;
        vo.data = data;
        return vo;
    }

    public static <T> ResultVo<T> info(T data, Integer code, String message) {
        ResultVo<T> vo = new ResultVo<T>();
        vo.code = code;
        vo.data = data;
        vo.message = message;
        return vo;
    }

}
