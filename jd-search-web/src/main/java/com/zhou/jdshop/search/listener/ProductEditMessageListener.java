package com.zhou.jdshop.search.listener;

import com.zhou.jdshop.dao.TbProductCustomMapper;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.SolrParams;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.Objects;

public class ProductEditMessageListener implements MessageListener {

    @Autowired
    private TbProductCustomMapper productCustomDao;
    @Autowired
    private SolrServer solrServer;

    @Override
    public void onMessage(Message message) {

        try {
            //从消息中取商品id
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            String[] split = text.split("\\?");
            if(Objects.equals(split[0], "editProduct")) {
                Long pid = new Long(split[1]);
                //等待事务提交
                //Thread.sleep(1000);
                //根据商品id查询商品信息
                TbProductCustom product = productCustomDao.searchProductById(pid);
                solrServer.deleteById(split[1]);
                //创建一个文档对象
                SolrInputDocument document = new SolrInputDocument();
                //向文档对象中添加域
                document.addField("id", product.getId());
                document.addField("product_pname", product.getPname());
                document.addField("product_cname", product.getCname());
                document.addField("product_price", product.getPrice());
                document.addField("product_pimage", product.getPimage());
                document.addField("product_pdesc", product.getPdesc());
                document.addField("product_psold", product.getPsold());
                document.addField("product_bname",product.getBname());
                document.addField("product_hname",product.getHname());
                //把文档写入索引库
                solrServer.add(document);
                //提交
                solrServer.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
