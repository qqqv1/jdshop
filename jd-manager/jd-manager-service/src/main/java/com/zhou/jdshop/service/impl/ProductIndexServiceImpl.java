package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.TbProductCustomMapper;
<<<<<<< HEAD
import com.zhou.jdshop.service.ProductIndexService;
=======
import com.zhou.jdshop.pojo.vo.TbProductCustom;
>>>>>>> 8bdc5e9255f8d133d862e72234035e2e896168e3
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
        List<TbProductCustom> searchList =tbProductCustomDao.getSearchProducts();
        //2 创建索引库
        //.遍历集合
        for(TbProductCustom productCustom : searchList){
            //创建docement
            SolrInputDocument document = new SolrInputDocument();
            //转TbSearchTbProductCustom---》SolrInputDocument
            document.addField("id",productCustom.getId());
            document.addField("product_pname",productCustom.getPname());
            document.addField("product_pdesc",productCustom.getPdesc());
            document.addField("product_price",productCustom.getPrice());
            document.addField("product_pimage",productCustom.getPimage());
            document.addField("product_cname",productCustom.getCname());
            document.addField("product_psold",productCustom.getPsold());
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
