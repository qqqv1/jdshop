package com.zhou.jdshop.dao;

import com.zhou.jdshop.dto.TbSearchProductResult;
import com.zhou.jdshop.dto.TbSearchTbProductCustom;
import com.zhou.jdshop.pojo.vo.TbProductCustom;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SearchProductDao {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SolrServer solrServer;
/*
    public TbSearchProductResult search(SolrQuery query) {
        TbSearchProductResult result = new TbSearchProductResult();
        try {
            //通过查询条件执行DAO查询方法
            //recordCount,list
            //获取查询响应
            QueryResponse queryResponse = solrServer.query(query);
            //获取查询结果集
            SolrDocumentList solrDocumentList = queryResponse.getResults();
            //获取总记录数
            long numFound = solrDocumentList.getNumFound();
            //获得了recordCount
            result.setRecordCount(numFound);

            //获取高亮的列表
            Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
            List<TbSearchTbProductCustom> searchProductCustomList = new ArrayList<TbSearchTbProductCustom>();
            //遍历solrDocumentList形成List<TbSearchItemCustom>
            //solrDocumentList---List<TbSearchItemCustom>
            for (SolrDocument document : solrDocumentList) {
                TbSearchTbProductCustom item = new TbSearchTbProductCustom();
                item.setId((String) document.get("id"));
                item.setCname((String) document.get("product_cname"));
                item.setPimage((String) document.get("product_pimage"));
                item.setPrice((long) document.get("product_price"));
                item.setPdesc((String) document.get("product_pdesc"));

                //获取高亮列表的值
                List<String> list = highlighting.get(document.get("id")).get("product_pname");
                String title = "";
                if (list != null && !list.isEmpty()) {
                    title = list.get(0);
                } else {
                    title = (String) document.get("product_pname");
                }
                item.setPname(title);
                //获得了list
                searchProductCustomList.add(item);
            }
            result.setItemList(searchProductCustomList);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;//recordCount,list
    }*/


    public List<TbSearchTbProductCustom> search(SolrQuery query) {
//        List<TbProductCustom> result = null;
        List<TbSearchTbProductCustom> searchProductCustomList = new ArrayList<TbSearchTbProductCustom>();
        try {
            //通过查询条件执行DAO查询方法
            //recordCount,list
            //获取查询响应
            QueryResponse queryResponse = solrServer.query(query);
            //获取查询结果集
            SolrDocumentList solrDocumentList = queryResponse.getResults();
            //获取总记录数
//            long numFound = solrDocumentList.getNumFound();
            //获得了recordCount
//            result.setRecordCount(numFound);

            //获取高亮的列表
            Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();

            //遍历solrDocumentList形成List<TbSearchItemCustom>
            //solrDocumentList---List<TbSearchItemCustom>
            for (SolrDocument document:solrDocumentList) {
                TbSearchTbProductCustom item = new TbSearchTbProductCustom();
                item.setId((String) document.get("id"));
                item.setCname((String) document.get("product_cname"));
                item.setPimage((String) document.get("product_pimage"));
                item.setPrice((long) document.get("product_price"));
                item.setPdesc((String) document.get("product_pdesc"));
                item.setPsold((int) document.get("product_psold"));
//                System.out.println(item.getPsold()+"dddddddddddddddddddddddd"+123);

                //获取高亮列表的值
                List<String> list = highlighting.get(document.get("id")).get("product_pname");
                String title = "";
                if (list != null && !list.isEmpty()) {
                    title = list.get(0);
                } else {
                    title = (String) document.get("product_pname");
                }
                item.setPname(title);
                //获得了list
                searchProductCustomList.add(item);
            }
//            result.setItemList(searchProductCustomList);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return searchProductCustomList;//recordCount,list
    }
}
