package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIORDERCOMP;

public interface ZCNIORDERCOMPMapper {
    int deleteByPrimaryKey(Integer compid);

    int insert(ZCNIORDERCOMP record);

    int insertSelective(ZCNIORDERCOMP record);

    ZCNIORDERCOMP selectByPrimaryKey(Integer compid);

    int updateByPrimaryKeySelective(ZCNIORDERCOMP record);

    int updateByPrimaryKey(ZCNIORDERCOMP record);
}