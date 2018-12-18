package com.xy.ssm.service.impl;

import com.xy.ssm.dao.SysUserMapper;
import com.xy.ssm.pojo.SysUser;
import com.xy.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xyLonely
 * @date 2018/12/18 9:37
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String username) {

        return sysUserMapper.selectByPrimaryKey(1l);
    }
}
