package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbProductCustomMapper;
import com.zhou.jdshop.dao.TbProductMapper;
import com.zhou.jdshop.pojo.po.Product;
import com.zhou.jdshop.pojo.po.ProductExample;
import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.po.TbProductExample;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import com.zhou.jdshop.service.ProductService;
import com.zhou.jdshop.util.IDUtils;
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
    private TbProductMapper productDao;

    @Autowired
    private TbProductCustomMapper productCustomDao;

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
    public List<TbProductCustom> listProducts() {
        List<TbProductCustom> list=new ArrayList<>();
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
    public TbProduct getProductById(Long pid) {
        TbProduct product=new TbProduct();
        try {
            TbProductExample example=new TbProductExample();
            TbProductExample.Criteria criteria = example.createCriteria();
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
    public int saveProduct(TbProduct product) {
        int i = 0;
        try {
            Long pid = IDUtils.getItemId();
            product.setPid(pid);
            product.setPflag(1);
            product.setCreated(new Date());
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
    public int editProduct(TbProduct product) {
        int i = 0;
        try {
            TbProductExample example=new TbProductExample();
            TbProductExample.Criteria criteria = example.createCriteria();
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
    public int updateProduct(List<Long> pids,Integer pflag) {
        int i = 0;
        try {
            TbProduct product =new TbProduct();
            product.setPflag(pflag);
            TbProductExample example=new TbProductExample();
            TbProductExample.Criteria criteria = example.createCriteria();
            criteria.andPidIn(pids);
            i = productDao.updateByExampleSelective(product,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int total(String cname,String pname) {
        int total=0;
        try {
            total=productCustomDao.total(cname,pname);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return total;
    }

    @Override
    public List<TbProductCustom> productList(Integer page, String cname, String pname) {
        List<TbProductCustom> list=new ArrayList<>();
        try {
            int offset=(page-1)*12;
            list=productCustomDao.productList(offset,cname,pname);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public TbProductCustom findProductById(Long pid) {
        TbProductCustom productCustom =new TbProductCustom();
        try{
            productCustom = productCustomDao.selectProductById(pid);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return productCustom;
    }
}
