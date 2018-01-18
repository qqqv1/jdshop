package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.pojo.vo.ProductCustom;

import java.util.List;

public interface ProductService {
//    List<Product> listProducts();

    List<ProductCustom> listProducts();

    int saveProduct(Product product);

    int updateProduct(List<String> pids,Integer pflag);

    Product getProductById(String pid);

    int editProduct(Product product);

    int total(String cname,String pname);

    List<ProductCustom> productList(Integer page,String cname,String pname);
}
