package com.chenhuan.supermarket.modular.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品类别表
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@TableName("pro_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CATE_ID")
    private String cateId;

    @TableField("CATE_CODE")
    private String cateCode;

    @TableField("CATE_NAME")
    private String cateName;

    @TableField("CATE_SORT")
    private String cateSort;

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

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }
    public String getCateCode() {
        return cateCode;
    }

    public void setCateCode(String cateCode) {
        this.cateCode = cateCode;
    }
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
    public String getCateSort() {
        return cateSort;
    }

    public void setCateSort(String cateSort) {
        this.cateSort = cateSort;
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
        return "Category{" +
        "cateId=" + cateId +
        ", cateCode=" + cateCode +
        ", cateName=" + cateName +
        ", cateSort=" + cateSort +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
