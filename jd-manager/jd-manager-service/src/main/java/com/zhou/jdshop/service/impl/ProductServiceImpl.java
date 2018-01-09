package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.ProductCustomMapper;
import com.zhou.jdshop.dao.ProductMapper;
import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.pojo.po.ProductExample;
import com.zhou.jdshop.pojo.vo.ProductCustom;
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

    @Autowired
    private ProductCustomMapper productCustomDao;

    /**
     * 查询全部产品
     * @return 状态不为删除的产品集
     */
//    @Override
//    public List<Product> listProducts() {
//        List<Product> list=new ArrayList<>();
//        try {
//            ProductExample example=new ProductExample();
//            ProductExample.Criteria criteria = example.createCriteria();
//            criteria.andPflagNotEqualTo(3);
//            list = productDao.selectByExample(example);
//        }catch (Exception e){
//            logger.error(e.getMessage(),e);
//            e.printStackTrace();
//        }
//        return list;
//    }
    @Override
    public List<ProductCustom> listProducts() {
        List<ProductCustom> list=new ArrayList<>();
        try {
            list = productCustomDao.listProducts();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据id查询单个产品
     * @param pid 选中产品的id
     * @return 对应id的产品
     */
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

    /**
     * 新增产品
     * @param product 要插入的产品
     * @return 若成功则返回值大于0
     */
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

    /**
     * 修改产品
     * @param product 要更新的产品信息
     * @return 若成功则返回值大于0
     */
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

    /**
     * 批量删除产品
     * @param pids 被选中产品的id集
     * @return 若逻辑删除成功则返回值大于0
     */
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
