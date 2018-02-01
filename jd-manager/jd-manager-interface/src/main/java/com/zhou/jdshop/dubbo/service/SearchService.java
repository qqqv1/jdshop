package com.zhou.jdshop.dubbo.service;

import com.zhou.jdshop.dto.TbSearchProductResult;
import com.zhou.jdshop.dto.TbSearchTbProductCustom;
import com.zhou.jdshop.pojo.vo.TbProductCustom;

import java.util.List;

public interface SearchService {
    List<TbSearchTbProductCustom> search(String keyword, Integer page, int i);
}
