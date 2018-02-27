package com.zhou.jdshop.service;

import com.zhou.jdshop.dto.ProductOption;
import com.zhou.jdshop.dto.TbSearchProductResult;

public interface SearchService {
    TbSearchProductResult search(ProductOption productOption);
}
