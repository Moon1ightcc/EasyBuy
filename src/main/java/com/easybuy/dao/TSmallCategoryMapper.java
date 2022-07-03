package com.easybuy.dao;

import com.easybuy.entity.TProductMore;
import com.easybuy.entity.TSmallCategory;
import com.easybuy.entity.TSmallCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSmallCategoryMapper {
    long countByExample(TSmallCategoryExample example);

    int deleteByExample(TSmallCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSmallCategory record);

    int insertSelective(TSmallCategory record);

    List<TSmallCategory> selectByExample(TSmallCategoryExample example);

    TSmallCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSmallCategory record, @Param("example") TSmallCategoryExample example);

    int updateByExample(@Param("record") TSmallCategory record, @Param("example") TSmallCategoryExample example);

    int updateByPrimaryKeySelective(TSmallCategory record);

    int updateByPrimaryKey(TSmallCategory record);

     List<TSmallCategory> querySmallCate();

     TSmallCategory querySmallCatetById(Integer id);

     TSmallCategory selectSmallCate(Integer id);
}