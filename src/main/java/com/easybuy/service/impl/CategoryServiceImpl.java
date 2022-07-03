package com.easybuy.service.impl;

import com.easybuy.dao.TBigCategoryMapper;
import com.easybuy.dao.TSmallCategoryMapper;
import com.easybuy.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl {

    @Autowired
    TSmallCategoryMapper smallDao;

    @Transactional(readOnly = true)
    public List<TSmallCategory> queryAllSmallCate(){
        return smallDao.querySmallCate();
    }

    @Transactional
    public int deleteSmallCate(Integer id){
        return smallDao.deleteByPrimaryKey(id);
    }

    @Transactional
    public int addSmallCate(TSmallCategory tSmallCategory){
        return smallDao.insertSelective(tSmallCategory);
    }

    @Transactional(readOnly = true)
    public TSmallCategory querySmallCateById(Integer id){
        return smallDao.querySmallCatetById(id);
    }

    @Transactional
    public int updateSmallCate(TSmallCategory tSmallCategory){
        return smallDao.updateByPrimaryKeySelective(tSmallCategory);
    }

}
