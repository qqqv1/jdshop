package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.pojo.vo.ProductCustom;

import java.util.List;

public interface ProductService {
//    List<Product> listProducts();

    List<ProductCustom> listProducts();

    int saveProduct(Product product);

    int deleteProduct(List<String> pids);

    Product getProductById(String pid);

    int editProduct(Product product);
}
