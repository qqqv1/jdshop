package com.zhou.jdshop.dao;

import com.zhou.jdshop.dto.ProductOption;
import com.zhou.jdshop.dto.TbSearchTbProductCustom;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProductCustomMapper {

    List<TbProductCustom> listProducts();

    List<TbProductCustom> productList(ProductOption productOption);

    int total(ProductOption productOption);

    TbProductCustom selectProductById(Long pid);

    //查找商品索引
    List<TbSearchTbProductCustom> getSearchProducts();
    //
}
