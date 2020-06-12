package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIFUNCLOCBOM;

public interface ZCNIFUNCLOCBOMMapper {
    int deleteByPrimaryKey(Integer bomid);

    int insert(ZCNIFUNCLOCBOM record);

    int insertSelective(ZCNIFUNCLOCBOM record);

    ZCNIFUNCLOCBOM selectByPrimaryKey(Integer bomid);

    int updateByPrimaryKeySelective(ZCNIFUNCLOCBOM record);

    int updateByPrimaryKey(ZCNIFUNCLOCBOM record);
}