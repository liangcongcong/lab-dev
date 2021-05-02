package com.hurb.service.impl.sysmanager;

import com.hurb.mapper.sysmanager.TSysSchoolMapper;
import com.hurb.pojo.sysmanager.TSysSchool;
import com.hurb.service.sysmanager.TSysSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TSysSchoolServiceImpl implements TSysSchoolService {
    @Autowired
    public TSysSchoolMapper tSysSchoolMapper;
    @Override
    public List<TSysSchool> queryAllSysSchool() {
        return tSysSchoolMapper.selectAll();
    }
}