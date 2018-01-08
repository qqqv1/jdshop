package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.ProductMapper;
import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.pojo.po.ProductExample;
import com.zhou.jdshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductMapper productDao;


    @Override
    public List<Product> listProducts() {
        List<Product> list=new ArrayList<>();
        try {
            ProductExample example=new ProductExample();
            ProductExample.Criteria criteria = example.createCriteria();
            criteria.andPflagNotEqualTo(3);
            list = productDao.selectByExample(example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Product getProductById(String pid) {
        Product product=new Product();
        try {
            ProductExample example=new ProductExample();
            ProductExample.Criteria criteria = example.createCriteria();
            criteria.andPidEqualTo(pid);
            criteria.andPflagNotEqualTo(3);
            product = productDao.selectByExample(example).get(0);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return product;
    }

    @Transactional
    @Override
    public int saveProduct(Product product) {
        int i = 0;
        try {
            String pid = UUID.randomUUID().toString().replaceAll("-","");
            product.setPid(pid);
            product.setPflag(1);
            product.setPdate(new Date());
            i = productDao.insert(product);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Transactional
    @Override
    public int editProduct(Product product) {
        int i = 0;
        try {
            ProductExample example=new ProductExample();
            ProductExample.Criteria criteria = example.createCriteria();
            criteria.andPidEqualTo(product.getPid());
            i = productDao.updateByExampleSelective(product,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int deleteProduct(List<String> pids) {
        int i = 0;
        try {
            Product product =new Product();
            product.setPflag(3);
            ProductExample example=new ProductExample();
            ProductExample.Criteria criteria = example.createCriteria();
            criteria.andPidIn(pids);
            i = productDao.updateByExampleSelective(product,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
