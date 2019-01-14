package com.chenhuan.supermarket.modular.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品, 供应商关联表
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@TableName("pro_product_provider")
public class ProductProvider implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("PRODUCT_PROVIDER_ID")
    private String productProviderId;

    /**
     * 商品主键id
     */
    @TableField("PRODUCT_ID")
    private String productId;

    /**
     * 供应商主键id
     */
    @TableField("PROVIDER_ID")
    private String providerId;

    public String getProductProviderId() {
        return productProviderId;
    }

    public void setProductProviderId(String productProviderId) {
        this.productProviderId = productProviderId;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "ProductProvider{" +
        "productProviderId=" + productProviderId +
        ", productId=" + productId +
        ", providerId=" + providerId +
        "}";
    }
}
