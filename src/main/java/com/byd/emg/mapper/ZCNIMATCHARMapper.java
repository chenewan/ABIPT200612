package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIMATCHAR;

public interface ZCNIMATCHARMapper {
    int deleteByPrimaryKey(Integer charid);

    int insert(ZCNIMATCHAR record);

    int insertSelective(ZCNIMATCHAR record);

    ZCNIMATCHAR selectByPrimaryKey(Integer charid);

    int updateByPrimaryKeySelective(ZCNIMATCHAR record);

    int updateByPrimaryKey(ZCNIMATCHAR record);
}