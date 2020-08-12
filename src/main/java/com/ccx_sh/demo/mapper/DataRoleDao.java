package com.ccx_sh.demo.mapper;

import com.ccx_sh.demo.domain.DataRole;

public interface DataRoleDao {
    int deleteByPrimaryKey(Long configId);

    int insert(DataRole record);

    int insertSelective(DataRole record);

    DataRole selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(DataRole record);

    int updateByPrimaryKey(DataRole record);
}