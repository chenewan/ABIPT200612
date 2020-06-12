package com.byd.emg.mapper;

import com.byd.emg.pojo.Usermanager;
import org.apache.ibatis.annotations.Param;

public interface UsermanagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usermanager record);

    int insertSelective(Usermanager record);

    Usermanager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usermanager record);

    int updateByPrimaryKey(Usermanager record);

    int updateLoginTimes(@Param("username") String username,@Param("password") String password);

}