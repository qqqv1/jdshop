package com.zhou.jdshop.service.impl;

import com.zhou.jdshop.dao.SearchProductDao;
import com.zhou.jdshop.dto.ProductOption;
import com.zhou.jdshop.dto.TbSearchProductResult;
import com.zhou.jdshop.service.SearchService;
import org.apache.solr.client.solrj.SolrQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SearchProductDao searchProductDao;

  /*  @Override
//    public TbSearchProductResult search(String keyword, Integer pageNumber, int pageSize) {
    public List<TbProductCustom> search(String keyword, Integer pageNumber, int pageSize) {
        TbSearchProductResult result = null;
        try {
            //创建solr查询对象
            SolrQuery query = new SolrQuery();
            //1 设置查询的内容
            query.setQuery(keyword);
            //2 设置分页条件
            if (pageNumber <= 0) pageNumber = 1;
            query.setStart((pageNumber - 1) * pageSize);
            query.setRows(pageSize);
            //3 设置搜索域
            query.set("df","item_keywords");
            //4 设置高亮显示
            query.setHighlight(true);
            query.addHighlightField("product_pname");
            query.setHighlightSimplePre("<em style='color:red;'>");
            query.setHighlightSimplePost("</em>");
            //通过查询条件执行DAO查询方法
            //recordCount,list
            result = searchProductDao.search(query);
            //计算总页数
            *//*long recordCount = result.getRecordCount();
            int totalPages = ((int)recordCount+pageSize-1)/pageSize;
            result.setTotalPages(totalPages);*//*
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }*/

    @Override
//    public TbSearchProductResult search(String keyword, Integer pageNumber, int pageSize) {
    public TbSearchProductResult search(ProductOption productOption) {
        TbSearchProductResult result=new TbSearchProductResult();
        try {
            String keyword=productOption.getPname();
            String cname=productOption.getCname();
            String hname=productOption.getHname();
            String bname=productOption.getBname();
            int pageNumber=productOption.getPage();
            int pageSize=productOption.getPageSize();
            //创建solr查询对象
            SolrQuery query = new SolrQuery();
            //1 设置查询的内容
            query.setQuery(keyword);
            query.setFilterQueries(cname,hname,bname);
            //2 设置分页条件
            if (pageNumber <= 0) pageNumber = 1;
            query.setStart((pageNumber - 1) * pageSize);
            query.setRows(pageSize);
            //3 设置搜索域
            query.set("df","item_keywords");
            //4 设置高亮显示
            query.setHighlight(true);
            query.addHighlightField("product_pname");
            query.setHighlightSimplePre("<em style='color:red;'>");
            query.setHighlightSimplePost("</em>");
            //通过查询条件执行DAO查询方法
            //recordCount,list
            result = searchProductDao.search(query);
            //计算总页数
            long recordCount = result.getRecordCount();
            int totalPages = ((int)recordCount+pageSize-1)/pageSize;
            result.setTotalPages(totalPages);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }
}
