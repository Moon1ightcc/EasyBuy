package com.easybuy.dao;

import com.easybuy.entity.TProduct;
import com.easybuy.entity.TProductExample;
import com.easybuy.entity.TProductMore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TProductMapper {
    long countByExample(TProductExample example);

    int deleteByExample(TProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    List<TProduct> selectByExample(TProductExample example);

    TProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByExample(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKey(TProduct record);

     List<TProductMore> queryProducts();

    TProductMore queryProductById(Long id);

    void addProduct(TProductMore record);

    List<TProductMore> queryCateId();

}