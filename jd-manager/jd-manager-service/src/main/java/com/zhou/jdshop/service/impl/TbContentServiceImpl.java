package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbContentCustomMapper;
import com.zhou.jdshop.dao.TbContentMapper;
import com.zhou.jdshop.jedis.JedisClient;
import com.zhou.jdshop.pojo.po.TbContent;
import com.zhou.jdshop.pojo.po.TbContentExample;
import com.zhou.jdshop.service.TbContentService;
import com.zhou.jdshop.util.JsonUtils;
import com.zhou.jdshop.util.StrKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbContentServiceImpl implements TbContentService {
    @Autowired
    private JedisClient jedisClient;
    @Autowired
    private TbContentMapper contentDao;
   /* @Autowired
    private TbContentCustomMapper tbContentCustomDao;*/
    @Override
    public List<TbContent> getContentListByCid(Long cid) {
        //1 在缓存服务器中进行查询
        try {
            String listJson = jedisClient.hget("CONTENT_LIST", Long.toString(cid));
            if (StrKit.notBlank(listJson)){
                List<TbContent> contentList = JsonUtils.jsonToList(listJson, TbContent.class);
                return contentList;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        //2 主业务：去mysql中查询
        TbContentExample example = new TbContentExample();
        TbContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(cid);
        List<TbContent> contentList = contentDao.selectByExample(example);
        System.out.println(contentList.size()+"Service");
        //3 将查询到的数据存放到缓存服务器中
        try {
            jedisClient.hset("CONTENT_LIST",Long.toString(cid),JsonUtils.objectToJson(contentList));
        }catch (Exception e) {
            e.printStackTrace();
        }
        return contentList;
    }
}
