package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.TbProductCustom;

import java.util.List;

public interface ProductService {
//    List<TbProduct> listProducts();

    List<TbProductCustom> listProducts();

    int saveProduct(TbProduct product);

    int updateProduct(List<Long> pids,Integer pflag);

    TbProduct getProductById(Long pid);

    int editProduct(TbProduct product);

    int total(String cname,String pname);

    List<TbProductCustom> productList(Integer page, String cname, String pname);

    TbProductCustom findProductById(Long pid);
}
