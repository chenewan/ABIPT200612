package com.byd.emg.service.impl;

import com.byd.emg.common.DBTypeEnum;
import com.byd.emg.common.DbContextHolder;
import com.byd.emg.mapper.LastvpoMapper;
import com.byd.emg.mapper.UsermanagerMapper;
import com.byd.emg.pojo.Lastvpo;
import com.byd.emg.service.JavaToTableService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class JavaToTableServiceImpl implements JavaToTableService {
    @Autowired
    private LastvpoMapper lastvpoMapper;
    @Autowired
    private UsermanagerMapper usermanagerMapper;
//    @Override
//    public int insertVpo(String vpoNO) {
//        Lastvpo lastvpo=new Lastvpo();
//        lastvpo.setVpono(vpoNO);
//
//        return lastvpoMapper.insertSelective(lastvpo);
//    }

    @Override
    public int insertVpoNO(String vpono) {
        DbContextHolder.setDbType(DBTypeEnum.db1);
        return     lastvpoMapper.insertToSQL(vpono);
    }

    @Override
    public void loginTimesAdd(String username, String password) {

        DbContextHolder.setDbType(DBTypeEnum.db1);
        usermanagerMapper.updateLoginTimes(username,password);
    }


}
