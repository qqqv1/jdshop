package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.ProductMapper;
import com.zhou.jdshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productDao;


}
