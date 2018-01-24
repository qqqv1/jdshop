package com.zhou.jdshop.service;

//import com.zhou.jdshop.pojo.po.Category;
import com.zhou.jdshop.pojo.po.TbProductCat;

import java.util.List;

public interface CategoryService {
    List<TbProductCat> listCats();

    TbProductCat getCategoryById(Long cid);

    int saveCategory(TbProductCat category);

    int editCategory(TbProductCat category);

    int deleteCategory(List<Long> cids);

    List<TbProductCat> listCats1();

    List<TbProductCat> listCats2();

    List<TbProductCat> listCats3();

    int editCat(TbProductCat category);

    int saveCat1(TbProductCat category);

    int saveCat2(TbProductCat category);

    int saveCat3(TbProductCat category);
}
