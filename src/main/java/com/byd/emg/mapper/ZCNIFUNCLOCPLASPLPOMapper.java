package com.byd.emg.mapper;

import com.byd.emg.pojo.ZCNIFUNCLOCPLASPLPO;

public interface ZCNIFUNCLOCPLASPLPOMapper {
    int deleteByPrimaryKey(Integer plpoid);

    int insert(ZCNIFUNCLOCPLASPLPO record);

    int insertSelective(ZCNIFUNCLOCPLASPLPO record);

    ZCNIFUNCLOCPLASPLPO selectByPrimaryKey(Integer plpoid);

    int updateByPrimaryKeySelective(ZCNIFUNCLOCPLASPLPO record);

    int updateByPrimaryKey(ZCNIFUNCLOCPLASPLPO record);
}