package com.neuedu.mapper;

import com.neuedu.pojo.Good_type;

public interface Good_typeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Good_type record);

    int insertSelective(Good_type record);

    Good_type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Good_type record);

    int updateByPrimaryKey(Good_type record);
}