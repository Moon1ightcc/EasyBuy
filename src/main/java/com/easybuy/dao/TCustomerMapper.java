package com.easybuy.dao;

import com.easybuy.entity.TCustomer;
import com.easybuy.entity.TCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCustomerMapper {
    long countByExample(TCustomerExample example);

    int deleteByExample(TCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    List<TCustomer> selectByExample(TCustomerExample example);

    TCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByExample(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);

    List<TCustomer> queryCustomer();

    TCustomer queryTCustomerById(Integer id);

    int inertCustomerDynamic(TCustomer tCustomer);
}