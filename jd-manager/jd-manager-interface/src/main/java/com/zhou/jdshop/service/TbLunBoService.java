package com.zhou.jdshop.service;

import com.zhou.jdshop.pojo.po.TbLunBo;

import java.util.List;

public interface TbLunBoService {

    List<TbLunBo>  getContentListByCid(Long cid);
}
