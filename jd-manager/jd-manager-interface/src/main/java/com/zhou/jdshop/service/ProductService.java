package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProducts();

    int saveProduct(Product product);
}
