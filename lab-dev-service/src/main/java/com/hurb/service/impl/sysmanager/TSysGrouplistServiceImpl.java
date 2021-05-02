package com.hurb.service.impl.sysmanager;

//import com.hurb.mapper.*;
//import com.hurb.pojo.TSysDepartment;
//import com.hurb.pojo.TSysGrouplist;
//import com.hurb.pojo.TSysUser;
import com.hurb.service.sysmanager.TSysGrouplistService;
import com.hurb.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TSysGrouplistServiceImpl implements TSysGrouplistService {

//    @Autowired
//    private Sid sid;
//
//    @Autowired
//    public TSysGrouplistMapper tSysGrouplistMapper;
//
//    @Autowired
//    public TSysDepartmentMapper tSysDepartmentMapper ;
//
//    @Override
//    public List<TSysGrouplist> queryAllSysGrouplist() {
//        return tSysGrouplistMapper.selectAll();
//    }
//
//    @Override
//    public List<TSysGrouplist> page(int startIndex, int pageSize) {
//        return tSysGrouplistMapper.page(startIndex,pageSize);
//    }
//
//    @Override
//    public TSysGrouplist getSysGrouplistByName(String acodemyName) {
//        return tSysGrouplistMapper.getByGroupName(acodemyName);
//    }
//
//    @Override
//    public void saveSysGrouplist(TSysGrouplist tSysGrouplist) {
//        //先创建用户，获取
//        Integer school_id = tSysGrouplist.getTypeid();
//        TSysDepartment tSysDepartment = new TSysDepartment();
//        tSysDepartment.setId(tSysGrouplist.getId());
//        tSysDepartment.setName(tSysGrouplist.getName());
//        tSysDepartment.setTypeid(school_id);
//        tSysDepartmentMapper.insert(tSysDepartment);
//    }
//
//    @Override
//    public void updateSysGroup(TSysDepartment tSysDepartment) {
//        tSysDepartmentMapper.updateByPrimaryKey(tSysDepartment);
//    }
//
//    @Override
//    public void deleteSysGroup(Integer id) {
//        tSysDepartmentMapper.deleteByPrimaryKey(id);
//    }
//
//    @Override
//    public List<TSysGrouplist> getSysGrouplistByType(int typeId) {
//        return tSysGrouplistMapper.getByTypeName(typeId);
//    }

}
