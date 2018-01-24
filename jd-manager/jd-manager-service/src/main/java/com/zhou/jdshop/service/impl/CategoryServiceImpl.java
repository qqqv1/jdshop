package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbProductCatMapper;
import com.zhou.jdshop.pojo.po.TbProductCat;
import com.zhou.jdshop.pojo.po.TbProductCatExample;
import com.zhou.jdshop.service.CategoryService;
import com.zhou.jdshop.util.IDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbProductCatMapper categoryDao;

    /**
     * 查询全部分类
     * @return 状态不为删除的分类集
     */
    @Override
    public List<TbProductCat> listCats() {
        List<TbProductCat> list = null;
        try {
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
            criteria.andCflagNotEqualTo(1);
            list = categoryDao.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 查询一级分类
     * @return
     */
    @Override
    public List<TbProductCat> listCats1() {
        List<TbProductCat> list = null;
        try {
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
            criteria.andCflagNotEqualTo(1);
            criteria.andParentIdEqualTo(0L);
            list = categoryDao.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 查询二级分类
     * @return
     */
    @Override
    public List<TbProductCat> listCats2() {
        List<TbProductCat> list = null;
        try {
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
            criteria.andCflagNotEqualTo(1);
            criteria.andParentIdNotEqualTo(0L);
            criteria.andIsParentEqualTo(1);
            list = categoryDao.selectByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 查询三级分类
     * @return
     */
    @Override
    public List<TbProductCat> listCats3() {
        List<TbProductCat> list = null;
        try {
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
            criteria.andCflagNotEqualTo(1);
            criteria.andIsParentNotEqualTo(1);
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
    public TbProductCat getCategoryById(Long cid) {
        TbProductCat category=new TbProductCat();
        try {
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
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
    public int saveCategory(TbProductCat category) {
        int i = 0;
        try {
            Long cid = IDUtils.getItemId();
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
     * 新增一级分类
     * @param category 要插入的分类
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int saveCat1(TbProductCat category) {
        int i = 0;
        try {
            Long cid = IDUtils.getItemId();
            category.setCid(cid);
            category.setCflag(0);
            category.setParentId(0L);
            category.setIsParent(1);
            category.setCreated(new Date());
            i = categoryDao.insert(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 新增二级分类
     * @param category 要插入的分类
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int saveCat2(TbProductCat category) {
        int i = 0;
        try {
            Long cid = IDUtils.getItemId();
            category.setCid(cid);
            category.setCflag(0);
            category.setIsParent(1);
            category.setCreated(new Date());
            i = categoryDao.insert(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 新增三级分类
     * @param category 要插入的分类
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int saveCat3(TbProductCat category) {
        int i = 0;
        try {
            Long cid = IDUtils.getItemId();
            category.setCid(cid);
            category.setCflag(0);
            category.setIsParent(0);
            category.setCreated(new Date());
            i = categoryDao.insert(category);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 修改一、二分类
     * @param category 要更新的分类信息
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int editCategory(TbProductCat category) {
        int i = 0;
        try {
            category.setIsParent(1);
            category.setUpdated(new Date());
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
            criteria.andCidEqualTo(category.getCid());
            i = categoryDao.updateByExampleSelective(category,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 修改三级分类
     * @param category 要更新的分类信息
     * @return 若成功则返回值大于0
     */
    @Transactional
    @Override
    public int editCat(TbProductCat category) {
        int i = 0;
        try {
            category.setIsParent(0);
            category.setUpdated(new Date());
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
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
    public int deleteCategory(List<Long> cids) {
        int i = 0;
        try {
            TbProductCat category =new TbProductCat();
            category.setCflag(1);
            TbProductCatExample example=new TbProductCatExample();
            TbProductCatExample.Criteria criteria = example.createCriteria();
            criteria.andCidIn(cids);
            i = categoryDao.updateByExampleSelective(category,example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }
}
