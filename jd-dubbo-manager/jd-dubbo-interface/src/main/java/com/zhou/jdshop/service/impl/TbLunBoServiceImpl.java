package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbLunBoMapper;
import com.zhou.jdshop.dubbo.service.TbLunBoService;
import com.zhou.jdshop.jedis.JedisClient;
import com.zhou.jdshop.pojo.po.TbLunBo;
import com.zhou.jdshop.util.JsonUtils;
import com.zhou.jdshop.util.StrKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TbLunBoServiceImpl implements TbLunBoService {
    @Autowired
    private JedisClient jedisClient;
    @Autowired
    private TbLunBoMapper tbLunBoDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<TbLunBo> getContentListByCid(Long cid) {


        //1.从缓存中取出数据
        try {
            String listJson = jedisClient.hget("CONTENT_LIST", Long.toString(cid));
            if(StrKit.notBlank(listJson)){
                List<TbLunBo> tbLunBolist = JsonUtils.jsonToList(listJson, TbLunBo.class);
                return   tbLunBolist;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //2.主业务，查询
      /*  TbContentExample example = new TbContentExample();
        TbContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(cid);
        List<TbContent> contentList = contentDao.selectByExample(example);*/

        //3.将查询出来的数据放在缓存中
        try{
//            jedisClient.hset("CONTENT_LIST",Long.toString(cid),JsonUtils.objectToJson(contentList));
        }catch (Exception e){
            e.printStackTrace();
        }
//        return contentList;
        return null;
    }
}
