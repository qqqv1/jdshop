package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.ProductMapper;
import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());;

    @Autowired
    private ProductMapper productDao;


    @Override
    public List<Product> listProducts() {
        List<Product> list=null;
        try {
            list = productDao.selectByExample(null);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }
}