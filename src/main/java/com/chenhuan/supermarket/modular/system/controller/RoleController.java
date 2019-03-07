package com.chenhuan.supermarket.modular.system.controller;


import com.chenhuan.supermarket.core.baseCore.model.request.RequestData;
import com.chenhuan.supermarket.core.baseCore.model.response.ResponseData;
import com.chenhuan.supermarket.modular.system.entity.Role;
import com.chenhuan.supermarket.modular.system.service.impl.RoleServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@RestController
@RequestMapping("/system/role")
public class RoleController {

    @Resource
    private RoleServiceImpl roleService;

    @PostMapping(name = "获取角色列表", path = "list")
    public ResponseData list() {
        List<Role> list = this.roleService.list();
        return ResponseData.success(list);
    }

    @PostMapping(name = "获取角色详情", path = "detail")
    public ResponseData detail(RequestData requestData) {
        String roleId = requestData.getString("roleId");
        Role detail = this.roleService.detail(roleId);
        return ResponseData.success(detail);
    }

    @PostMapping(name = "新增角色", path = "add")
    public ResponseData add(RequestData requestData) {
        Role role = requestData.parse(Role.class);
        boolean b = this.roleService.add(role);
        if (b){
            return ResponseData.success();
        }
        return ResponseData.error();
    }

    @PostMapping(name = "编辑角色", path = "update")
    public ResponseData update(RequestData requestData) {
        Role role = requestData.parse(Role.class);
        boolean b = this.roleService.update(role);
        if (b) {
            return ResponseData.success();
        }
        return ResponseData.error();
    }

    @PostMapping(name = "删除角色", path = "delete")
    public ResponseData delete(RequestData requestData) {
        String roleId = requestData.getString("roleId");
        boolean b = this.roleService.delete(roleId);
        if (b) {
            return ResponseData.success();
        }
        return ResponseData.error();
    }

}
