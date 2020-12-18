package com.zking.ssm.llq.mapper;

import com.zking.ssm.llq.model.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}