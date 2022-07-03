package com.easybuy.service.impl;

import com.easybuy.dao.TCustomerMapper;
import com.easybuy.dao.TUsersMapper;
import com.easybuy.entity.TCustomer;
import com.easybuy.entity.TUsers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
class TuserServiceImplTest {

    @Resource
    private TuserServiceImpl tuserService;
    @Resource
    private TUsersMapper tUsersMapper;

    @Resource
    private TCustomerMapper tCustomerMapper;


    @Test
    void doLogin() {
        TUsers admin = tuserService.doLogin("admin", "123456");
        System.out.println(admin);
    }
    @Test
    void doLogin2() {
        TUsers admin = tUsersMapper.login("admin", "123456");
        System.out.println(admin);
    }
    @Test
    void registerUser() {
        List<TCustomer> tCustomers = tCustomerMapper.queryCustomer();
        for (TCustomer tCustomer : tCustomers) {
            System.out.println(tCustomer);
        }
    }
}