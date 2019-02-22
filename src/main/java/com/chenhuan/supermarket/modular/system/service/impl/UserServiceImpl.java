package com.chenhuan.supermarket.modular.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.chenhuan.supermarket.config.exception.ServiceException;
import com.chenhuan.supermarket.core.exceptionEnum.FieldNullException;
import com.chenhuan.supermarket.modular.system.entity.User;
import com.chenhuan.supermarket.modular.system.mapper.UserMapper;
import com.chenhuan.supermarket.modular.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public boolean login(String account, String password) {

        if (StringUtils.isEmpty(account)) {
            throw new ServiceException("account不能为空", 5000);
        }
        if (StringUtils.isEmpty(password)) {
            throw new ServiceException("password不能为空", 5001);
        }
        List<User> list = this.baseMapper.selectList(
                new QueryWrapper<User>()
                        .eq("ACCOUNT", account)
                        .eq("PASSWORD", password)
        );
        if (list != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validateAccount(String account) {

        if (StringUtils.isEmpty(account)) {
            throw new FieldNullException("account");
        }
        //账号唯一性校验
        List<User> list = this.baseMapper.selectList(
                new QueryWrapper<User>().eq("ACCOUNT", account)
        );
        if (list == null) {
            return true;
        }
        return false;
    }


    /**
     * @Description: 数据合法性校验
     * @Author: chenhuan
     * @Date: 14:16 2019/2/22
     **/
    private void validate(User user) {

        if (StringUtils.isEmpty(user.getRoleId())) {
            throw new FieldNullException("roleId");
        }
        if (StringUtils.isEmpty(user.getAccount())) {
            throw new FieldNullException("account");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            throw new FieldNullException("password");
        }
        //账号唯一性校验
        List<User> list = this.baseMapper.selectList(
                new QueryWrapper<User>().eq("ACCOUNT", user.getAccount())
        );
        if (list != null) {
            throw new ServiceException("该账号已存在", 8000);
        }
    }
}
