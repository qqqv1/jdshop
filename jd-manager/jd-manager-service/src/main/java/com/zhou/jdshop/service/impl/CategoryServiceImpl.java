package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.CategoryMapper;
import com.zhou.jdshop.pojo.po.Category;
import com.zhou.jdshop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CategoryMapper categoryDao;

    @Override
    public List<Category> listCats() {
        List<Category> list = null;
        try {
            list = categoryDao.selectByExample(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
