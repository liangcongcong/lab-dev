package com.hurb.service.impl.sysmanager;

import com.hurb.mapper.sysmanager.TSysSpecialtyMapper;
import com.hurb.pojo.sysmanager.TSysSpecialty;
import com.hurb.service.sysmanager.TSysSpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TSysSpecialtyServiceImpl implements TSysSpecialtyService {
    @Autowired
    public TSysSpecialtyMapper tSysSpecialtyMapper;
    @Override
    public List<TSysSpecialty> queryAllSysSpecialty() {
        return tSysSpecialtyMapper.selectAll();
    }
}
