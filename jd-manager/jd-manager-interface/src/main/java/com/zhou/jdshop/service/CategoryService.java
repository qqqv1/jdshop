package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.Category;
import java.util.List;

public interface CategoryService {
    List<Category> listCats();

    Category getCategoryById(String cid);

    int saveCategory(Category category);

    int editCategory(Category category);

    int deleteCategory(List<String> cids);
}
