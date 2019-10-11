package com.neuedu.mapper;

import com.neuedu.pojo.Order_goods_detail;

public interface Order_goods_detailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order_goods_detail record);

    int insertSelective(Order_goods_detail record);

    Order_goods_detail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order_goods_detail record);

    int updateByPrimaryKey(Order_goods_detail record);
}