package com.easybuy.dao;

import com.easybuy.entity.TShopCart;
import com.easybuy.entity.TShopCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TShopCartMapper {
    long countByExample(TShopCartExample example);

    int deleteByExample(TShopCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TShopCart record);

    int insertSelective(TShopCart record);

    List<TShopCart> selectByExample(TShopCartExample example);

    TShopCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TShopCart record, @Param("example") TShopCartExample example);

    int updateByExample(@Param("record") TShopCart record, @Param("example") TShopCartExample example);

    int updateByPrimaryKeySelective(TShopCart record);

    int updateByPrimaryKey(TShopCart record);
}