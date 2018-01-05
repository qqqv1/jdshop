package com.zhou.jdshop.web;

import com.zhou.jdshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductAction {

    @Autowired
    private ProductService productService;


}
