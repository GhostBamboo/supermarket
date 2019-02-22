package com.chenhuan.supermarket.config.model.response;

/**
 * @Description: 返回成功实体类
 * @Author: chenhuan
 * @Date: 14:51 2019/2/22
 */
public class Success extends ResponseData {

    public Success() {
        super(200, "操作成功",null);
    }

    public Success(Object object){
        super(200, "操作成功", object);
    }
}
