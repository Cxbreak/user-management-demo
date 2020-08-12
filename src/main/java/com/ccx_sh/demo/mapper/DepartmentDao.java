package com.ccx_sh.demo.mapper;

import com.ccx_sh.demo.domain.Department;

public interface DepartmentDao {
    int deleteByPrimaryKey(Long configId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long configId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}