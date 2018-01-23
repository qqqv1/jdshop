package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbProductCat;

import java.util.List;

public interface CategoryService {
    List<TbProductCat> listCats();

    TbProductCat getCategoryById(String cid);

    int saveCategory(TbProductCat category);

    int editCategory(TbProductCat category);

    int deleteCategory(List<String> cids);
}
