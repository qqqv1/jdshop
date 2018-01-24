package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbProductCustomMapper;
import com.zhou.jdshop.dto.TbSearchTbProductCustom;
import com.zhou.jdshop.service.ProductIndexService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ProductIndexServiceImpl implements ProductIndexService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbProductCustomMapper tbProductCustomDao;
    @Autowired
    public SolrServer solrServer;

    @Override
    public boolean importAll() {
        //1.采集数据
        List<TbSearchTbProductCustom> searchList =tbProductCustomDao.getSearchProducts();
        //2 创建索引库
        //.遍历集合
        for(TbSearchTbProductCustom productCustom : searchList){
            //创建docement
            SolrInputDocument document = new SolrInputDocument();
            //转TbSearchTbProductCustom---》SolrInputDocument
            document.addField("pid",productCustom.getPid());
            document.addField("pname",productCustom.getPname());
            document.addField("pdesc",productCustom.getPdesc());
            document.addField("shop_price",productCustom.getPrice());
            document.addField("pimage",productCustom.getPimage());
            document.addField("cname",productCustom.getCname());
            //拿到装配好的document存放到索引库中
            try {
                solrServer.add(document);
            } catch (SolrServerException e) {
                logger.error(e.getMessage(),e);
                return false;
            } catch (IOException e) {
                logger.error(e.getMessage(),e);
                return false;
            }
        }
        //solrServer提交
        try {
            solrServer.commit();
        } catch (SolrServerException e) {
            logger.error(e.getMessage(),e);
            return false;
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
            return false;
        }

        return true;
    }
}
