package com.hurb.service.sysmanager;



import com.hurb.pojo.sysmanager.TSysUserrole;
import com.hurb.pojo.sysmanager.TUserroleview;

import java.util.List;

public interface TSysUserRoleViewService {
    public List<TUserroleview> getSysUserRoleViewByUid(String uid);

    public void saveTSysUserRole(TSysUserrole tSysUserRole);

    public void updateTSysUserRole(TSysUserrole tSysUserRole);

    public void deleteTSysUserRole(Long id);

    List< TUserroleview> queryAllSysSysUserRoleView();
}
