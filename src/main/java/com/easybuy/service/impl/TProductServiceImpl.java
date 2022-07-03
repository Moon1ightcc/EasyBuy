package com.easybuy.service.impl;

import com.easybuy.dao.TBigCategoryMapper;
import com.easybuy.dao.TProductMapper;
import com.easybuy.dao.TSmallCategoryMapper;
import com.easybuy.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TProductServiceImpl  {

    @Autowired
     TProductMapper productDao;

    @Autowired
     TBigCategoryMapper bigCatDao;

    @Autowired
     TSmallCategoryMapper smallDao;

    @Transactional(readOnly = true)
    public List<TBigCategory> queryAllBigs(){
       return bigCatDao.selectByExample(new TBigCategoryExample());
    }

    @Transactional(readOnly = true)
    public List<TSmallCategory> querySmallByBigId(Integer bigId){
         TSmallCategoryExample te = new TSmallCategoryExample();
         te.createCriteria().andParentIdEqualTo(bigId);//父id
         return smallDao.selectByExample(te);
    }

    @Transactional(readOnly = true)
    public List<TProductMore> queryProduct(){
        return productDao.queryProducts();
    }

    @Transactional(readOnly = true)
    public TProductMore queryProductById(Long id){
        return productDao.queryProductById(id);
    }

    @Transactional
    public int updataProduct(TProduct tProduct){
         return  productDao.updateByPrimaryKeySelective(tProduct);
    }

    @Transactional
    public int addProduct(TProduct tProduct){
        return  productDao.insertSelective(tProduct);
    }

    @Transactional
    public int deleteProduct(Integer id){
        return productDao.deleteByPrimaryKey(id);
    }

}
