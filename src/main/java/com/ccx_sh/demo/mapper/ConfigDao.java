package com.ccx_sh.demo.mapper;

import com.ccx_sh.demo.domain.Config;

public interface ConfigDao {
    int deleteByPrimaryKey(Long configId);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}