package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIMATSTOCK;

public interface ZCNIMATSTOCKMapper {
    int deleteByPrimaryKey(Integer stockid);

    int insert(ZCNIMATSTOCK record);

    int insertSelective(ZCNIMATSTOCK record);

    ZCNIMATSTOCK selectByPrimaryKey(Integer stockid);

    int updateByPrimaryKeySelective(ZCNIMATSTOCK record);

    int updateByPrimaryKey(ZCNIMATSTOCK record);
}