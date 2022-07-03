package com.easybuy.controller.manage;

import com.easybuy.entity.*;
import com.easybuy.service.impl.TProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class ProductController {
    @Autowired
    private TProductServiceImpl productService;

    @Value(" http://localhost:82/images/")
    private String pichost;

    @RequestMapping("/showInputProduct.do")
    public String showInputProductPage(Map<String,Object> model){
        productService.queryAllBigs();
        model.put("bigs",productService.queryAllBigs()); //查询大分类
        return "productAdd";
    }

    @RequestMapping("/getSmalls.do")
    public String getsmall(Integer bigId, Model model){
        model.addAttribute("smalls",productService.querySmallByBigId(bigId)); //查出小分类
        return "smalls";
    }

    @RequestMapping("/AddProduct.do")
    public String AddProduct(TProduct tProduct, Map<String,Object> model,MultipartFile tupian){
        System.out.println(tProduct);
        if(tupian.getSize()!=0) {
            String name = UUID.randomUUID().toString();//随机的一唯一 uuid
            String oldName = tupian.getOriginalFilename();//上传的文件的文件名
            int pos = oldName.lastIndexOf(".");//得到文件名后缀的位置
            String fileName = name + oldName.substring(pos);//最终我们存储的文件名
            System.out.println("FILENAME："+fileName);
            tProduct.setPicUrl(pichost + fileName);
            try {
                tupian.transferTo(new File("d:/upload/images/" + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tProduct.setPicUrl(pichost+fileName);
        }
        productService.addProduct(tProduct);
        model.put("pros",productService.queryProduct());
        return "productList";
    }

     @RequestMapping("/productList.do")
     public String productList(Map<String,Object> model){
         model.put("pros",productService.queryProduct());
         return "productList";
    }

    @RequestMapping("/showEditProduct.do")
    public String showEditProduct(Long id,Map<String,Object> model){
        TProductMore pro = productService.queryProductById(id);
        model.put("bigs",productService.queryAllBigs());  //查出大分类 页面下拉框显示用
        model.put("product",pro);
        model.put("smalls",productService.querySmallByBigId(pro.getBigCatId())); //查出小分类
        return "productEdit";
    }

    @RequestMapping("/EditProduct.do")
    public String EditProduct(TProduct tProduct,Map<String,Object> model,MultipartFile tupian){
        if(tupian.getSize()!=0) {
            String name = UUID.randomUUID().toString();//随机的一唯一 uuid
            String oldName = tupian.getOriginalFilename();//上传的文件的文件名
            int pos = oldName.lastIndexOf(".");//得到文件名后缀的位置
            String fileName = name + oldName.substring(pos);//最终我们存储的文件名
            System.out.println("FILENAME："+fileName);
            tProduct.setPicUrl(pichost + fileName);
            try {
                tupian.transferTo(new File("d:/upload/images/" + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tProduct.setPicUrl(pichost+fileName);
        }
        productService.updataProduct(tProduct);
        model.put("pros",productService.queryProduct());
        return "productList";
    }

    @RequestMapping("/DeleteProduct.do")
    public String DeleteProduct(Integer id,Map<String,Object> model){
        productService.deleteProduct(id);
        model.put("pros",productService.queryProduct());
        return "productList";
    }
}
