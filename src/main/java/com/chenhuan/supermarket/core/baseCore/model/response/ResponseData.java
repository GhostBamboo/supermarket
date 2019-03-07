package com.chenhuan.supermarket.core.baseCore.model.response;

/**
 * @Description: 响应到前端的实体类
 * @Author: chenhuan
 * @Date: 14:43 2019/2/22
 */
public class ResponseData {

    private static final Integer successCode = 1;
    private static final String successMessage = "操作成功";
    private static final String errorMessage = "网络异常";
    private static final Integer errorCode = -1;

    private Integer code;
    private String message;
    private Object data;

    public ResponseData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResponseData success() {
        return new Success();
    }

    public static ResponseData success(Object o) {
        return new Success(o);
    }

 public static ResponseData error() {
        return new Success();
    }

    public static ResponseData error(Object o) {
        return new Success(o);
    }


}
