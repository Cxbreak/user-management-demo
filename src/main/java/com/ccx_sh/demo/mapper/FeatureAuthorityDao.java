package com.ccx_sh.demo.mapper;

import com.ccx_sh.demo.domain.FeatureAuthority;

public interface FeatureAuthorityDao {
    int deleteByPrimaryKey(Long configId);

    int insert(FeatureAuthority record);

    int insertSelective(FeatureAuthority record);

    FeatureAuthority selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(FeatureAuthority record);

    int updateByPrimaryKey(FeatureAuthority record);
}