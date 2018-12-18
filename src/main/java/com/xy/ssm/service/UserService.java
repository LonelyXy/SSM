package com.xy.ssm.service;

import com.xy.ssm.pojo.SysUser;

/**
 * @author xyLonely
 * @date 2018/12/18 9:37
 */
public interface UserService {

    public SysUser login(String username);
}
