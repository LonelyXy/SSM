package com.xy.ssm.dao;

import com.xy.ssm.pojo.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}