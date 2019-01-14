package com.chenhuan.supermarket.modular.product.service.impl;

import com.chenhuan.supermarket.modular.product.entity.ProductProvider;
import com.chenhuan.supermarket.modular.product.mapper.ProductProviderMapper;
import com.chenhuan.supermarket.modular.product.service.IProductProviderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品, 供应商关联表 服务实现类
 * </p>
 *
 * @author chenhuan
 * @since 2019-01-14
 */
@Service
public class ProductProviderServiceImpl extends ServiceImpl<ProductProviderMapper, ProductProvider> implements IProductProviderService {

}
