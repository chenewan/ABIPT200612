package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIFUNCLOCPLKO;

public interface ZCNIFUNCLOCPLKOMapper {
    int deleteByPrimaryKey(Integer plkoid);

    int insert(ZCNIFUNCLOCPLKO record);

    int insertSelective(ZCNIFUNCLOCPLKO record);

    ZCNIFUNCLOCPLKO selectByPrimaryKey(Integer plkoid);

    int updateByPrimaryKeySelective(ZCNIFUNCLOCPLKO record);

    int updateByPrimaryKey(ZCNIFUNCLOCPLKO record);
}