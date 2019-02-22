package com.chenhuan.supermarket.modular.system.service;

import com.chenhuan.supermarket.modular.system.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
public interface IRoleService extends IService<Role> {

    /**
     * 获取角色列表
     */
    List<Role> list();

    /**
     * 角色详情
     */
    Role detail(String roleId);

    /**
     * 新增角色
     */
    boolean add(Role role);

    /**
     * 编辑角色
     */
    boolean update(Role role);

    /**
     * 删除角色
     */
    boolean delete(String roleId);

    /**
     * 校验角色名称唯一性
     */
    boolean valRoleName(Role role);


}
