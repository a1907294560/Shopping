package com.neuedu.mapper;

import com.neuedu.pojo.Shopping_car;

public interface Shopping_carMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shopping_car record);

    int insertSelective(Shopping_car record);

    Shopping_car selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shopping_car record);

    int updateByPrimaryKey(Shopping_car record);
}