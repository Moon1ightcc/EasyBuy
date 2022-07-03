package com.easybuy.service.impl;

import com.easybuy.dao.TCustomerMapper;
import com.easybuy.entity.TCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl {
    @Autowired
     TCustomerMapper customerDao;

    @Transactional(readOnly = true)
    public List<TCustomer> queryCustomers(){
        return customerDao.queryCustomer();
    }

    @Transactional(readOnly = true)
    public TCustomer queryCustomerById(Integer id){
        return customerDao.queryTCustomerById(id);
    }

    @Transactional
    public int updataCustomer(TCustomer tCustomer){
        return  customerDao.updateByPrimaryKeySelective(tCustomer);
    }

    @Transactional
    public int insertCustomer(TCustomer tCustomer){
        return customerDao.insertSelective(tCustomer);
    }

    @Transactional
    public int deletCustomer(Integer id){
        return customerDao.deleteByPrimaryKey(id);
    }
}
