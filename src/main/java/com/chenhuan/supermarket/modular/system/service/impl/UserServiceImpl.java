package com.chenhuan.supermarket.modular.system.service.impl;

import com.chenhuan.supermarket.modular.system.entity.User;
import com.chenhuan.supermarket.modular.system.mapper.UserMapper;
import com.chenhuan.supermarket.modular.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
