package com.zhou.jdshop.web;

import com.zhou.jdshop.dto.MessageResult;
import com.zhou.jdshop.service.ProductIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ProductIndexAction {
//    @Autowired
@Resource
    private ProductIndexService productIndexService;

    @ResponseBody
    @RequestMapping(value = "/product/index",method = RequestMethod.POST)
    public MessageResult itemIndex(){
        //1 调用业务层方法导入到索引库
        boolean bl = productIndexService.importAll();
        MessageResult messageResult = new MessageResult();
        messageResult.setSuccess(false);
        //2 封装DTO对象
        if(bl){
            messageResult.setSuccess(true);
            messageResult.setMessage("恭喜！导入成功！");
        }
        return messageResult;
    }
}
