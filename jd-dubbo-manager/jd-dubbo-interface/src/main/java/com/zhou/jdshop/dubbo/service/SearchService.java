package com.zhou.jdshop.dubbo.service;

import com.zhou.jdshop.dto.TbSearchTbProductCustom;

import java.util.List;

public interface SearchService {
    List<TbSearchTbProductCustom> search(String keyword, Integer page, int i);
}
