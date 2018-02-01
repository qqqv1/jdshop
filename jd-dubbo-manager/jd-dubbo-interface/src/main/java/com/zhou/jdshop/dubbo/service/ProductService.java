package com.zhou.jdshop.dubbo.service;

import com.zhou.jdshop.dto.ProductOption;
import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.TbProductCustom;

import java.util.List;

public interface ProductService {
//    List<TbProduct> listProducts();

    List<TbProductCustom> listProducts();

    int saveProduct(TbProduct product);

    int updateProduct(List<Long> pids, Integer pflag);

    TbProduct getProductById(Long pid);

    int editProduct(TbProduct product);

    int total(ProductOption productOption);

    List<TbProductCustom> productList(ProductOption productOption);

    TbProductCustom findProductById(Long pid);
}
