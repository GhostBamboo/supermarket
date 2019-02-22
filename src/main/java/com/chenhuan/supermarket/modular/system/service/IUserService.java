package com.chenhuan.supermarket.modular.system.service;

import com.chenhuan.supermarket.modular.system.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
public interface IUserService extends IService<User> {

    /**
     * 登录校验
     */
    boolean login(String account, String password);

    /**
     * 账号唯一性校验
     */
    boolean validateAccount(String account);


}
