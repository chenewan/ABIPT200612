package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIORDERACTWT;

public interface ZCNIORDERACTWTMapper {
    int deleteByPrimaryKey(Integer wtid);

    int insert(ZCNIORDERACTWT record);

    int insertSelective(ZCNIORDERACTWT record);

    ZCNIORDERACTWT selectByPrimaryKey(Integer wtid);

    int updateByPrimaryKeySelective(ZCNIORDERACTWT record);

    int updateByPrimaryKey(ZCNIORDERACTWT record);
}