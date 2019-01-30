package com.chenhuan.supermarket.modular.product.service.impl;

import com.chenhuan.supermarket.modular.product.entity.Product;
import com.chenhuan.supermarket.modular.product.mapper.ProductMapper;
import com.chenhuan.supermarket.modular.product.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-16
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
