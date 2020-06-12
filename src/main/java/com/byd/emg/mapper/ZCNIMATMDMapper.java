package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIMATMD;

public interface ZCNIMATMDMapper {
    int deleteByPrimaryKey(Integer mdid);

    int insert(ZCNIMATMD record);

    int insertSelective(ZCNIMATMD record);

    ZCNIMATMD selectByPrimaryKey(Integer mdid);

    int updateByPrimaryKeySelective(ZCNIMATMD record);

    int updateByPrimaryKey(ZCNIMATMD record);
}