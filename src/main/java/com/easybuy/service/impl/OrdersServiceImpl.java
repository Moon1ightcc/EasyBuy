package com.easybuy.service.impl;


import com.easybuy.dao.TCustomerMapper;
import com.easybuy.dao.TOrdersMapper;
import com.easybuy.entity.TCustomer;
import com.easybuy.entity.TOrders;
import com.easybuy.entity.TOrdersMore;
import com.easybuy.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdersServiceImpl {

    @Autowired
    TOrdersMapper ordersDao;
    @Autowired
    TCustomerMapper customerMapper;

    @Transactional(readOnly = true)
    public List<TOrdersMore> queryOrders(){
        return ordersDao.queryTOrders();
    }

/*    @Transactional(readOnly = true)
    public List<TOrders> queryOrders2(){
        List<TOrders> tOrders = ordersDao.selectByExample(null);
        for (TOrders tOrder : tOrders) {
            TCustomer tCustomer = customerMapper.selectByPrimaryKey(tOrder.getCustmerId());
            tOrder.setUserName(tCustomer.getUserName());
        }
        return tOrders;
    }*/

    @Transactional(readOnly = true)
    public TOrdersMore queryOrdersById(Integer id){
        return ordersDao.queryTOdersById(id);
    }

    @Transactional
    public int updataOrders(TOrders tOrders){
        return  ordersDao.updateByPrimaryKeySelective(tOrders);
    }

    @Transactional
    public int deleteOrders(Integer id){
        return ordersDao.deleteByPrimaryKey(id);
    }


}
