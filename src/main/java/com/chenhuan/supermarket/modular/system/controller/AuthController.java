package com.chenhuan.supermarket.modular.system.controller;

import com.chenhuan.supermarket.core.baseCore.model.request.RequestData;
import com.chenhuan.supermarket.core.baseCore.model.response.ResponseData;
import com.chenhuan.supermarket.modular.system.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 登录
 * @Author: 陈欢
 * @Date: 2019/2/16 09:21
 */
@RestController
@RequestMapping(name = "登录服务", path = "/")
public class AuthController {

    @Resource(name = "userServiceImpl")
    private IUserService userService;

    @RequestMapping(name = "登录", path = "login")
    public ResponseData login(String account, String password) {
        boolean b = this.userService.login(account, password);
        return ResponseData.success(b);
    }

    @RequestMapping(name = "账号唯一性校验", path = "validate")
    public ResponseData validate(RequestData requestData) {
        String account = requestData.getString("account");
        boolean b = this.userService.validateAccount(account);
        return ResponseData.success(b);
    }
}
