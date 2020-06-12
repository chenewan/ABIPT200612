package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.LastvpoMapper;
import com.byd.emg.service.JavaToTableService;
import com.byd.emg.service.ORDERtoDBService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class ORDERtoDBServiceImpl implements ORDERtoDBService {
//    @Autowired
//    private LastvpoMapper lastvpoMapper;
//
//
//    @Override
//    public int insertVpoNO(String vpono) {
//        DbContextHolder.setDbType(DBTypeEnum.db1);
//        return     lastvpoMapper.insertToSQL(vpono);
//    }


}
