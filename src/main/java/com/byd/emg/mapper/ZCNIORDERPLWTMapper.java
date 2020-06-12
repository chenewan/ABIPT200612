package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIORDERPLWT;

public interface ZCNIORDERPLWTMapper {
    int deleteByPrimaryKey(Integer plwtid);

    int insert(ZCNIORDERPLWT record);

    int insertSelective(ZCNIORDERPLWT record);

    ZCNIORDERPLWT selectByPrimaryKey(Integer plwtid);

    int updateByPrimaryKeySelective(ZCNIORDERPLWT record);

    int updateByPrimaryKey(ZCNIORDERPLWT record);
}