package com.ccx_sh.demo.mapper;

import com.ccx_sh.demo.domain.CompanyEntity;

public interface CompanyEntityMapper {
    int deleteByPrimaryKey(Long companyId);

    int insert(CompanyEntity record);

    int insertSelective(CompanyEntity record);

    CompanyEntity selectByPrimaryKey(Long companyId);

    int updateByPrimaryKeySelective(CompanyEntity record);

    int updateByPrimaryKey(CompanyEntity record);
}