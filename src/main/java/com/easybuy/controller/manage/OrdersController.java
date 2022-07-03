package com.easybuy.controller.manage;

import com.easybuy.entity.TOrders;
import com.easybuy.entity.TOrdersMore;
import com.easybuy.service.impl.OrdersServiceImpl;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class OrdersController {

    @Autowired
    OrdersServiceImpl ordersService;

//    @RequestMapping("/queryOrders.do")
//    public String OrdersList(Map<String,Object> model){
//        model.put("order",ordersService.queryOrders());
//        return "orderList";
//    }

    @RequestMapping("/queryOrders.do")
    public String OrdersList(Map<String,Object> model){
        model.put("order",ordersService.queryOrders());
        return "ordersList";
    }

    @RequestMapping("/showOrdersEdit.do")
    public String showOrdersEdit(Integer id, Map<String,Object> model){
        TOrdersMore tOrdersMore = ordersService.queryOrdersById(id);
        System.out.println(tOrdersMore);
        model.put("orders",tOrdersMore);
        return "ordersEdit";
    }

    @RequestMapping("/OrderEdit.do")
    public String updateOrders(Map<String,Object> model, TOrders tOrders){
        ordersService.updataOrders(tOrders);
        model.put("order",ordersService.queryOrders());
        return "ordersList";
    }

    @RequestMapping("/deleteOrder.do")
    public String DeletOrders(Map<String,Object> model,Integer id){
        ordersService.deleteOrders(id);
        model.put("order",ordersService.queryOrders());
        return "ordersList";
    }
}
