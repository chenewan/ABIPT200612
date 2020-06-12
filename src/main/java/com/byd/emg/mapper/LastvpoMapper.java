package com.byd.emg.mapper;

import com.byd.emg.pojo.Lastvpo;
import org.apache.ibatis.annotations.Param;

public interface LastvpoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lastvpo record);

    int insertSelective(Lastvpo record);

    int insertToSQL(@Param("vpono") String vpono);

    Lastvpo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lastvpo record);

    int updateByPrimaryKey(Lastvpo record);
}