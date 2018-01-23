package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.ProductCustom;

import java.util.List;

public interface ProductService {
//    List<Product> listProducts();

    List<ProductCustom> listProducts();

    int saveProduct(TbProduct product);

    int updateProduct(List<String> pids,Integer pflag);

    TbProduct getProductById(String pid);

    int editProduct(TbProduct product);

    int total(String cname,String pname);

    List<ProductCustom> productList(Integer page,String cname,String pname);

    ProductCustom findProductById(String pid);
}
