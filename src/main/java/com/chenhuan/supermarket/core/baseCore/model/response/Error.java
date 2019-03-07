package com.chenhuan.supermarket.core.baseCore.model.response;

/**
 * @Description: 返回失败实体类
 * @Author: chenhuan
 * @Date: 15:03 2019/2/22
 */
public class Error extends ResponseData {

    public Error() {
        super(500, "网络异常", null);
    }

    public Error(Object o) {
        super(500, "网络异常", o);
    }
}
