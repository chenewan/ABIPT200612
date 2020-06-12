package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIORDERMD;

public interface ZCNIORDERMDMapper {
    int deleteByPrimaryKey(Integer mdid);

    int insert(ZCNIORDERMD record);

    int insertSelective(ZCNIORDERMD record);

    ZCNIORDERMD selectByPrimaryKey(Integer mdid);

    int updateByPrimaryKeySelective(ZCNIORDERMD record);

    int updateByPrimaryKey(ZCNIORDERMD record);
}