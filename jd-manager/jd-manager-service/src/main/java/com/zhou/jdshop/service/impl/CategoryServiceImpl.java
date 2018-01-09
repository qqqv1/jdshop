package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.CategoryMapper;
import com.zhou.jdshop.pojo.po.Category;
import com.zhou.jdshop.pojo.po.CategoryExample;
import com.zhou.jdshop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CategoryMapper categoryDao;

    /**
     * 查询全部分类
     * @return 状态不为删除的分类集
     */
    @Override
    public List<Category> listCats() {
        List<Category> list = null;
        try {
            CategoryExample example=new CategoryExample();
            CategoryExample.Criteria criteria = example.createCriteria();
            criteria.andCflagNotEqualTo(1);
            list = categoryDao.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据id查询单个分类
     * @param cid 选中分类的id
     * @return 对应id的分类
     */
    @Override
    public Category getCategoryById(String cid) {
        Category category=new Category();
        try {
            CategoryExample example=new CategoryExample();
            CategoryExample.Criteria criteria = example.createCriteria();
            criteria.andCidEqualTo(cid);
            criteria.andCflagNotEqualTo(1);
            category = categoryDao.selectByExample(example).get(0);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return category;
    }

    /**
     * 新增分类
     * @param category 要插入的分类
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int saveCategory(Category category) {
        int i = 0;
        try {
            String cid = UUID.randomUUID().toString().replaceAll("-","");
            category.setCid(cid);
            category.setCflag(0);
            i = categoryDao.insert(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 新增分类
     * @param category 要更新的分类信息
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int editCategory(Category category) {
        int i = 0;
        try {
            CategoryExample example=new CategoryExample();
            CategoryExample.Criteria criteria = example.createCriteria();
            criteria.andCidEqualTo(category.getCid());
            i = categoryDao.updateByExampleSelective(category,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 批量删除分类
     * @param cids 被选中分类的id集
     * @return 若逻辑删除成功则返回值大于0
     */
    @Override
    public int deleteCategory(List<String> cids) {
        int i = 0;
        try {
            Category category =new Category();
            category.setCflag(1);
            CategoryExample example=new CategoryExample();
            CategoryExample.Criteria criteria = example.createCriteria();
            criteria.andCidIn(cids);
            i = categoryDao.updateByExampleSelective(category,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
