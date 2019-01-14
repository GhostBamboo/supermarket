package com.chenhuan.supermarket.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@TableName("sys_dept")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("DEPT_ID")
    private String deptId;

    /**
     * 父级id
     */
    @TableField("DEPT_PID")
    private String deptPid;

    /**
     * 父级ids
     */
    @TableField("DEPT_PIDS")
    private String deptPids;

    /**
     * 部门名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 部门简称
     */
    @TableField("DEPT_SHORT")
    private String deptShort;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    public String getDeptPid() {
        return deptPid;
    }

    public void setDeptPid(String deptPid) {
        this.deptPid = deptPid;
    }
    public String getDeptPids() {
        return deptPids;
    }

    public void setDeptPids(String deptPids) {
        this.deptPids = deptPids;
    }
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptShort() {
        return deptShort;
    }

    public void setDeptShort(String deptShort) {
        this.deptShort = deptShort;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "deptId=" + deptId +
        ", deptPid=" + deptPid +
        ", deptPids=" + deptPids +
        ", deptName=" + deptName +
        ", deptShort=" + deptShort +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
