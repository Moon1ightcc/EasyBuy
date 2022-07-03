package com.easybuy.controller.manage;

import com.easybuy.entity.TCustomer;;
import com.easybuy.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class CustomerController {

    @Value(" http://localhost:82/images/")
    private String pichost;

    @Autowired
    private CustomerServiceImpl customerService;

    @RequestMapping("/customerList.do")
    public String  CustomerList(Map<String,Object> model){
        model.put("cust",customerService.queryCustomers());
        return "customerList";
    }

    @RequestMapping("/showCustomerEdit.do")
    public String showEditCustomer(Integer id, Map<String,Object> model){
        TCustomer tCustomer = customerService.queryCustomerById(id);
        System.out.println(tCustomer);
        model.put("custe",tCustomer);
        return "customerEdit";
    }

    @RequestMapping("/EditCustomer.do")
    public String EditCustomer(TCustomer tCustomer, Map<String,Object> model, MultipartFile tupian){
        if(tupian.getSize()!=0) {
            String name = UUID.randomUUID().toString();//随机的一唯一 uuid
            String oldName = tupian.getOriginalFilename();//上传的文件的文件名
            int pos = oldName.lastIndexOf(".");//得到文件名后缀的位置
            String fileName = name + oldName.substring(pos);//最终我们存储的文件名
            System.out.println("FILENAME："+fileName);
            tCustomer.setPicture(pichost + fileName);
            try {
                tupian.transferTo(new File("d:/upload/images/" + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tCustomer.setPicture(pichost+fileName);
        }
        customerService.updataCustomer(tCustomer);
        System.out.println(tCustomer);
        model.put("cust",customerService.queryCustomers());
        return "customerList";
    }

    @RequestMapping("/showInputCustomer.do")
    public String showInputCustomerPage(){
        return "customerAdd";
    }

    @RequestMapping("/AddCustomer.do")
    public String AddCustomer(TCustomer tCustomer, Map<String,Object> model, MultipartFile tupian){
        if(tupian.getSize()!=0) {
            String name = UUID.randomUUID().toString();//随机的一唯一 uuid
            String oldName = tupian.getOriginalFilename();//上传的文件的文件名
            int pos = oldName.lastIndexOf(".");//得到文件名后缀的位置
            String fileName = name + oldName.substring(pos);//最终我们存储的文件名
            System.out.println("FILENAME："+fileName);
            tCustomer.setPicture(pichost + fileName);
            try {
                tupian.transferTo(new File("d:/upload/images/" + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tCustomer.setPicture(pichost+fileName);
        }
        customerService.insertCustomer(tCustomer);
        System.out.println(tCustomer);
        model.put("cust",customerService.queryCustomers());
        return "customerList";
    }

    @RequestMapping("/deleteCustomer.do")
    public String DeleteCustoemr(Integer id, Map<String,Object> model){
        customerService.deletCustomer(id);
        model.put("cust",customerService.queryCustomers());
        return "customerList";
    }
}
