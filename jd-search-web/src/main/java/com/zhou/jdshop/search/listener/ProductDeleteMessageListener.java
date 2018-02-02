package com.zhou.jdshop.search.listener;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.Objects;

public class ProductDeleteMessageListener implements MessageListener {

    @Autowired
    private SolrServer solrServer;

    @Override
    public void onMessage(Message message) {
        try {
            //从消息中取商品id
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            String[] split = text.split("\\?");
            if(Objects.equals(split[0], "deleteProduct")) {
                //等待事务提交
                //Thread.sleep(1000);
                for (String pid :split[1].split(",")) {
                    solrServer.deleteById(pid);
                }
                //提交
                solrServer.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
