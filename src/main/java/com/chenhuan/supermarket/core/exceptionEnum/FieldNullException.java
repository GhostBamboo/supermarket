package com.chenhuan.supermarket.core.exceptionEnum;

import com.chenhuan.supermarket.config.exception.ServiceException;

/**
 * @Description: 通用的返回参数null异常类
 * @Author: chenhuan
 * @Date: 14:26 2019/2/22
 */
public class FieldNullException extends ServiceException {

    private static final Integer code = 5000;

    public FieldNullException(String fieldName) {
        super(fieldName + " 不能为空", code);
    }
}
