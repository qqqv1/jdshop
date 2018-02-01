package com.zhou.jdshop.web;

import com.zhou.jdshop.dubbo.service.FileService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;

@Controller
public class FileAction {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/file/upload",method = RequestMethod.GET)
    @ResponseBody
    public void config(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");

        String action = request.getParameter("action");
        if("config".equals(action)){
            PrintWriter out = response.getWriter();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("config.json");
            IOUtils.copy(inputStream,out,"UTF-8");
        }
    }

    @RequestMapping(value = "/file/upload",method = RequestMethod.POST)
    @ResponseBody
    //注意使用upfile，或者使用@RequestParam("upfile")
    public Map<String,Object> upload(@RequestParam("upfile") MultipartFile upfile){
        //这个方法的入参的变量名一定要是upfile，这个变量名称跟config.json当中的imageFieldName对应
        Map<String, Object> map = null;
        try {
            map = fileService.uploadImages(upfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}