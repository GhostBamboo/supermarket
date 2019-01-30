package com.chenhuan.supermarket.modular.product.service.impl;

import com.chenhuan.supermarket.modular.product.entity.Category;
import com.chenhuan.supermarket.modular.product.mapper.CategoryMapper;
import com.chenhuan.supermarket.modular.product.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类别表 服务实现类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-16
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
