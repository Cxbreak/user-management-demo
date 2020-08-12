package com.ccx_sh.demo.mapper;

import com.ccx_sh.demo.domain.FeatureRole;

public interface FeatureRoleDao {
    int deleteByPrimaryKey(Long configId);

    int insert(FeatureRole record);

    int insertSelective(FeatureRole record);

    FeatureRole selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(FeatureRole record);

    int updateByPrimaryKey(FeatureRole record);
}