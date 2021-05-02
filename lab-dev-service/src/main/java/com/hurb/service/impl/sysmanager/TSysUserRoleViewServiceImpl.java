package com.hurb.service.impl.sysmanager;


import com.hurb.mapper.sysmanager.TSysUserroleMapper;
import com.hurb.mapper.sysmanager.TUserroleviewMapper;
import com.hurb.pojo.sysmanager.TSysUserrole;
import com.hurb.pojo.sysmanager.TUserroleview;
import com.hurb.service.sysmanager.TSysUserRoleViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TSysUserRoleViewServiceImpl implements TSysUserRoleViewService {
    @Autowired
    public TUserroleviewMapper tSysUserRoleViewMapper;

    @Autowired
    public TSysUserroleMapper tSysUserRoleMapper;

    @Override
    public List<TUserroleview> getSysUserRoleViewByUid(String uid) {
        return tSysUserRoleViewMapper.getByUId(uid);
    }

    @Override
    public void saveTSysUserRole(TSysUserrole tSysUserRole) {
        tSysUserRoleMapper.insert(tSysUserRole);
    }

    @Override
    public void updateTSysUserRole(TSysUserrole tSysUserRole) {
        tSysUserRoleMapper.updateByPrimaryKey(tSysUserRole);
    }

    @Override
    public void deleteTSysUserRole(Long id) {
        tSysUserRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TUserroleview> queryAllSysSysUserRoleView() {
        return tSysUserRoleViewMapper.selectAll();
    }
}
