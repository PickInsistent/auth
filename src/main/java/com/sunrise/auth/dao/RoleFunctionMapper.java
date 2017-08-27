package com.sunrise.auth.dao;

import com.sunrise.auth.entity.RoleFunction;

public interface RoleFunctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    RoleFunction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);
}