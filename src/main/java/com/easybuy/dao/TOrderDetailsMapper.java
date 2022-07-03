package com.easybuy.dao;

import com.easybuy.entity.TOrderDetails;
import com.easybuy.entity.TOrderDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TOrderDetailsMapper {
    long countByExample(TOrderDetailsExample example);

    int deleteByExample(TOrderDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TOrderDetails record);

    int insertSelective(TOrderDetails record);

    List<TOrderDetails> selectByExample(TOrderDetailsExample example);

    TOrderDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TOrderDetails record, @Param("example") TOrderDetailsExample example);

    int updateByExample(@Param("record") TOrderDetails record, @Param("example") TOrderDetailsExample example);

    int updateByPrimaryKeySelective(TOrderDetails record);

    int updateByPrimaryKey(TOrderDetails record);
}