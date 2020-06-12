package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIFUNCLOCTAPL;

public interface ZCNIFUNCLOCTAPLMapper {
    int deleteByPrimaryKey(Integer taplid);

    int insert(ZCNIFUNCLOCTAPL record);

    int insertSelective(ZCNIFUNCLOCTAPL record);

    ZCNIFUNCLOCTAPL selectByPrimaryKey(Integer taplid);

    int updateByPrimaryKeySelective(ZCNIFUNCLOCTAPL record);

    int updateByPrimaryKey(ZCNIFUNCLOCTAPL record);
}