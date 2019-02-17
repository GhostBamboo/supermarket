package com.chenhuan.supermarket.core.exception;

/**
 * @Description: 自定义异常
 * @Author: 陈欢
 * @Date: 2019/2/17 08:40
 */
public class ServiceException extends RuntimeException {

    private Integer code;
    private String message;

    public ServiceException(String message, Integer code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
