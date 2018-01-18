package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.vo.ProductCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCustomMapper {

    List<ProductCustom> listProducts();

    List<ProductCustom> productList(@Param("offset") Integer offset,@Param("cname") String cname);

    int total(@Param("cname") String cname);
}
