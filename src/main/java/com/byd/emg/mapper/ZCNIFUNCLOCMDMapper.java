package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIFUNCLOCMD;

public interface ZCNIFUNCLOCMDMapper {
    int deleteByPrimaryKey(Integer mdid);

    int insert(ZCNIFUNCLOCMD record);

    int insertSelective(ZCNIFUNCLOCMD record);

    ZCNIFUNCLOCMD selectByPrimaryKey(Integer mdid);

    int updateByPrimaryKeySelective(ZCNIFUNCLOCMD record);

    int updateByPrimaryKey(ZCNIFUNCLOCMD record);
}