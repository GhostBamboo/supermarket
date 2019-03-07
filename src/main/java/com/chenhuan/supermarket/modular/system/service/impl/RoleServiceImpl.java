package com.chenhuan.supermarket.modular.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.chenhuan.supermarket.core.baseCore.exception.ServiceException;
import com.chenhuan.supermarket.core.exceptionEnum.FieldNullException;
import com.chenhuan.supermarket.modular.system.entity.Role;
import com.chenhuan.supermarket.modular.system.mapper.RoleMapper;
import com.chenhuan.supermarket.modular.system.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Override
    public List<Role> list() {
        return this.baseMapper.selectList(
                new QueryWrapper<Role>()
                        .orderByAsc("ROLE_SORT"));
    }

    @Override
    public Role detail(String roleId) {

        if (StringUtils.isEmpty(roleId)) {
            throw new FieldNullException("roleId");
        }
        Role role = this.baseMapper.selectById(roleId);
        return role;
    }

    @Override
    public boolean add(Role role) {

        validate(role);
        role.setCreateTime(LocalDateTime.now());
        role.setRoleId(IdWorker.get32UUID());

        int row = this.baseMapper.insert(role);
        if (row > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Role role) {

        validate(role);
        role.setUpdateTime(LocalDateTime.now());

        int row = this.baseMapper.updateById(role);
        if (row > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String roleId) {

        if (StringUtils.isEmpty(roleId)) {
            throw new FieldNullException("roleId");
        }
        int row = this.baseMapper.deleteById(roleId);
        if (row > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean valRoleName(Role role) {
        if (StringUtils.isEmpty(role.getRoleName())) {
            throw new FieldNullException("roleName");
        }
        //角色名称唯一性校验
        List<Role> roleList = null;
        if (StringUtils.isEmpty(role.getRoleId())) {
            roleList = this.baseMapper.selectList(
                    new QueryWrapper<Role>()
                            .eq("ROLE_NAME", role.getRoleName()));
        } else {
            roleList = this.baseMapper.selectList(
                    new QueryWrapper<Role>()
                            .eq("ROLE_NAME", role.getRoleName())
                            .ne("ROLE_ID", role.getRoleId())
            );
        }
        if (roleList == null) {
            return true;
        }
        return false;
    }

    /**
     * @Description: 数据合法性校验
     * @Author: chenhuan
     * @Date: 16:01 2019/2/22
     **/
    private void validate(Role role) {

        if (StringUtils.isEmpty(role.getRoleName())) {
            throw new FieldNullException("roleName");
        }
        if (StringUtils.isEmpty(role.getRoleSort())) {
            throw new FieldNullException("roleSort");
        }
        //角色名称唯一性校验
        List<Role> roleList = null;
        if (StringUtils.isEmpty(role.getRoleId())) {
            roleList = this.baseMapper.selectList(
                    new QueryWrapper<Role>()
                            .eq("ROLE_NAME", role.getRoleName()));
        } else {
            roleList = this.baseMapper.selectList(
                    new QueryWrapper<Role>()
                            .eq("ROLE_NAME", role.getRoleName())
                            .ne("ROLE_ID", role.getRoleId())
            );
        }
        if (roleList != null) {
            throw new ServiceException("该角色名称已存在", 6001);
        }

    }
}
