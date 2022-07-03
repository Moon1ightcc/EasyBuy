package com.easybuy.service.impl;

import com.easybuy.entity.TBigCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/applicationContext.xml"})
class TProductServiceImplTest {
    @Resource
    private TProductServiceImpl tProductService;
    @Test
    void queryAllBigs() {
        List<TBigCategory> tBigCategories = tProductService.queryAllBigs();
            tBigCategories.forEach(tBigCategory -> System.out.println(tBigCategory));
    }

    @Test
    void querySmallByBigId() {
    }

    @Test
    void queryProduct() {
    }

    @Test
    void queryProductById() {
    }
}