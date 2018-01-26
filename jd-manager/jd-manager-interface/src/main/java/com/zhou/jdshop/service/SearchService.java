package com.zhou.jdshop.service;

import com.zhou.jdshop.dto.TbSearchProductResult;

public interface SearchService {
    TbSearchProductResult search(String keyword, Integer page, int i);
}
