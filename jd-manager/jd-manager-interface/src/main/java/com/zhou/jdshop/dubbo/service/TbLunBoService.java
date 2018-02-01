package com.zhou.jdshop.dubbo.service;

import com.zhou.jdshop.pojo.po.TbLunBo;

import java.util.List;

public interface TbLunBoService {

    List<TbLunBo>  getContentListByCid(Long cid);
}
