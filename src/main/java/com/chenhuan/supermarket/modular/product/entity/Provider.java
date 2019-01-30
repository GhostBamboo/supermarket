package com.chenhuan.supermarket.modular.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 供应商
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-16
 */
@TableName("pro_provider")
public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("PROVIDER_ID")
    private String providerId;

    /**
     * 供应商编号
     */
    @TableField("PROVIDER_CODE")
    private String providerCode;

    /**
     * 供应商名称
     */
    @TableField("PROVIDER_NAME")
    private String providerName;

    /**
     * 供应商地址
     */
    @TableField("PROVIDER_ADDRESS")
    private String providerAddress;

    /**
     * 供应商电话
     */
    @TableField("PROVIDER_PHONE")
    private String providerPhone;

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

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }
    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
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
        return "Provider{" +
        "providerId=" + providerId +
        ", providerCode=" + providerCode +
        ", providerName=" + providerName +
        ", providerAddress=" + providerAddress +
        ", providerPhone=" + providerPhone +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
