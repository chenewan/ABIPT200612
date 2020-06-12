package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIORDEROPR;

public interface ZCNIORDEROPRMapper {
    int deleteByPrimaryKey(Integer oprid);

    int insert(ZCNIORDEROPR record);

    int insertSelective(ZCNIORDEROPR record);

    ZCNIORDEROPR selectByPrimaryKey(Integer oprid);

    int updateByPrimaryKeySelective(ZCNIORDEROPR record);

    int updateByPrimaryKey(ZCNIORDEROPR record);
}