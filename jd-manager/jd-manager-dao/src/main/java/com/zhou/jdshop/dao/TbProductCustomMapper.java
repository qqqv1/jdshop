package com.zhou.jdshop.dao;

import com.zhou.jdshop.pojo.vo.TbProductCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbProductCustomMapper {

    List<TbProductCustom> listProducts();

    List<TbProductCustom> productList(@Param("offset") Integer offset, @Param("cname") String cname, @Param("pname") String pname);

    int total(@Param("cname") String cname,@Param("pname") String pname);

    TbProductCustom selectProductById(Long pid);
}
