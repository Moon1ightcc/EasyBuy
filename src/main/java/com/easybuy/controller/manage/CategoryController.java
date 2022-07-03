package com.easybuy.controller.manage;


import com.easybuy.entity.TSmallCategory;
import com.easybuy.service.impl.CategoryServiceImpl;
import com.easybuy.service.impl.TProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class CategoryController {

    @Autowired
    private TProductServiceImpl productService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @RequestMapping("/smallCateList.do")
    public String querySmallList(Map<String,Object> model){
        model.put("cate",categoryService.queryAllSmallCate());
        return "smallCateList";
    }

    @RequestMapping("/deleteCateList.do")
    public String DeleteSmallList(Integer id,Map<String,Object> model){
        categoryService.deleteSmallCate(id);
        model.put("cate",categoryService.queryAllSmallCate());
        return "smallCateList";
    }

    @RequestMapping("/showInputSmallCate.do")
    public String showInputProductPage(Map<String,Object> model){
        productService.queryAllBigs();
        model.put("bigs",productService.queryAllBigs()); //查询大分类
        return "smallCateAdd";
    }

    @RequestMapping("/addSmallCate.do")
    public String AddSmallCate(Map<String,Object> model, TSmallCategory tSmallCategory){
        categoryService.addSmallCate(tSmallCategory);
        model.put("cate",categoryService.queryAllSmallCate());
        return "smallCateList";
    }

    @RequestMapping("/showEditSmallCate.do")
    public String showEditProduct(Integer id,Map<String,Object> model){
        TSmallCategory smallCategory = categoryService.querySmallCateById(id);
        model.put("bigs",productService.queryAllBigs()); //查询大分类
        model.put("smallcate",smallCategory);
        return "smallCateEdit";
    }

    @RequestMapping("/updateSmallCate.do")
    public String UpdateSmallCate(Map<String,Object> model, TSmallCategory tSmallCategory){
        categoryService.updateSmallCate(tSmallCategory);
        model.put("cate",categoryService.queryAllSmallCate());
        return "smallCateList";
    }
}
