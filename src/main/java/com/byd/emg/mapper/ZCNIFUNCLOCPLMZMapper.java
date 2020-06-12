package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIFUNCLOCPLMZ;

public interface ZCNIFUNCLOCPLMZMapper {
    int deleteByPrimaryKey(Integer plmzid);

    int insert(ZCNIFUNCLOCPLMZ record);

    int insertSelective(ZCNIFUNCLOCPLMZ record);

    ZCNIFUNCLOCPLMZ selectByPrimaryKey(Integer plmzid);

    int updateByPrimaryKeySelective(ZCNIFUNCLOCPLMZ record);

    int updateByPrimaryKey(ZCNIFUNCLOCPLMZ record);
}