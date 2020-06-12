package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIMATGM;

public interface ZCNIMATGMMapper {
    int deleteByPrimaryKey(Integer gmid);

    int insert(ZCNIMATGM record);

    int insertSelective(ZCNIMATGM record);

    ZCNIMATGM selectByPrimaryKey(Integer gmid);

    int updateByPrimaryKeySelective(ZCNIMATGM record);

    int updateByPrimaryKey(ZCNIMATGM record);
}