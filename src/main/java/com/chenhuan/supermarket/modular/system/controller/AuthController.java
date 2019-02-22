package com.chenhuan.supermarket.modular.system.controller;

import com.chenhuan.supermarket.config.model.request.RequestData;
import com.chenhuan.supermarket.config.model.response.ResponseData;
import com.chenhuan.supermarket.modular.system.entity.User;
import com.chenhuan.supermarket.modular.system.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Description: 登录
 * @Author: 陈欢
 * @Date: 2019/2/16 09:21
 */
@RestController
@RequestMapping(name = "登录服务", path = "/")
public class AuthController {

    @Resource
    private IUserService userService;

    @RequestMapping(name = "登录", path = "login")
    public ModelAndView login(String account, String password){
        ModelAndView modelAndView = new ModelAndView("index.html");
        boolean b = this.userService.login(account, password);
        modelAndView.addObject(b);
        return modelAndView;
    }

    @RequestMapping(name = "账号唯一性校验", path = "validate")
    public ResponseData validate(RequestData requestData){
        String account = requestData.getString("account");
        boolean b = this.userService.validateAccount(account);
        return ResponseData.success(b);
    }
}
