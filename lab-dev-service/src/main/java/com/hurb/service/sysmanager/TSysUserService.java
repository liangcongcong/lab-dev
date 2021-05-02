package com.hurb.service.sysmanager;

import com.hurb.pojo.sysmanager.TSysuser;

import java.util.List;

public interface TSysUserService {
    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 新增用户
     */
    public TSysuser createUser(TSysuser sysUser);

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public TSysuser queryUserForLogin(String username, String password);

    public TSysuser getSysUserInfoByUid(String uid);

    public void saveSysUser(TSysuser user);

    public void updateSysUser(TSysuser user);

    public void deleteSysUser(String id);

    List<TSysuser> queryAllUser();

    List<TSysuser> page(int startIndex, int pageSize);
}
