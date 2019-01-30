package com.chenhuan.supermarket.modular.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-16
 */
@TableName("pro_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("PRODUCT_ID")
    private String productId;

    /**
     * 商品分类主键id
     */
    @TableField("CATE_ID")
    private String cateId;

    /**
     * 商品编号
     */
    @TableField("PRODUCT_CODE")
    private String productCode;

    /**
     * 商品名称
     */
    @TableField("PRODUCT_NAME")
    private String productName;

    /**
     * 商品价格
     */
    @TableField("PRODUCT_PRICE")
    private BigDecimal productPrice;

    /**
     * 产地
     */
    @TableField("PRODUCT_ADDRESS")
    private String productAddress;

    /**
     * 生产日期
     */
    @TableField("PRODUCT_BEGINTIME")
    private LocalDateTime productBegintime;

    /**
     * 保质期
     */
    @TableField("PRODUCT_SHELFLIFE")
    private String productShelflife;

    /**
     * 材料
     */
    @TableField("PRODUCT_MATERIAL")
    private String productMaterial;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductAddress() {
        return productAddress;
    }

    public void setProductAddress(String productAddress) {
        this.productAddress = productAddress;
    }
    public LocalDateTime getProductBegintime() {
        return productBegintime;
    }

    public void setProductBegintime(LocalDateTime productBegintime) {
        this.productBegintime = productBegintime;
    }
    public String getProductShelflife() {
        return productShelflife;
    }

    public void setProductShelflife(String productShelflife) {
        this.productShelflife = productShelflife;
    }
    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
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
        return "Product{" +
        "productId=" + productId +
        ", cateId=" + cateId +
        ", productCode=" + productCode +
        ", productName=" + productName +
        ", productPrice=" + productPrice +
        ", productAddress=" + productAddress +
        ", productBegintime=" + productBegintime +
        ", productShelflife=" + productShelflife +
        ", productMaterial=" + productMaterial +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
