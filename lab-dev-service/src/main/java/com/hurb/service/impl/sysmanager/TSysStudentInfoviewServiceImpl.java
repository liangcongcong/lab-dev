package com.hurb.service.impl.sysmanager;


import com.hurb.mapper.sysmanager.*;
import com.hurb.pojo.sysmanager.TStudentinfoview;
import com.hurb.pojo.sysmanager.TSysstudent;
import com.hurb.pojo.sysmanager.TSysuser;
import com.hurb.service.sysmanager.TSysStudentInfoviewService;
import com.hurb.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TSysStudentInfoviewServiceImpl implements TSysStudentInfoviewService {
    @Autowired
    public TStudentinfoviewMapper tSysStudentInfoviewMapper;

    @Autowired
    public TSysRoleMapper tSysRoleMapper;

    @Autowired
    public TSysstudentMapper tSysStudentMapper;

    @Autowired
    public TSysSpecialtyMapper tSysSpecialtyMapper ;

    @Autowired
    public TSysSchoolMapper tSysSchoolMapper;

    @Autowired
    public TSysuserMapper tSysUserMapper;

    @Autowired
    private Sid sid;

    /**
     * 根据学号查询
     * @param stu_num
     * @return
     */
    @Override
    public TStudentinfoview getSysStudentInfoviewByStuNum(String stu_num) {
        return tSysStudentInfoviewMapper.getByStuNum(stu_num);
    }

    /**
     * 新增学生
     * @param tSysStudentInfoview
     */
    @Override
    public void saveSysStudentInfoview(TStudentinfoview tSysStudentInfoview) {
        //先创建用户，获取userId
        String userId = sid.nextShort();
        TSysuser user = new TSysuser();
        user.setUid(userId);
        user.setUsername(tSysStudentInfoview.getRealname());
        user.setPassword("111111");
        user.setRealname(tSysStudentInfoview.getRealname());
        user.setStatus(0);
        try {
            user.setSalt(MD5Utils.getMD5Str(tSysStudentInfoview.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        tSysUserMapper.insert(user);
        //获取schoolId，specialtyId，创建student
        Integer schoolId = tSysStudentInfoview.getSchoolid();
        Integer specialtyId = tSysStudentInfoview.getSpecialid();
        TSysstudent tSysStudent = new TSysstudent();
        tSysStudent.setUseruid(userId);
        tSysStudent.setGrade(tSysStudentInfoview.getNjgrade());
        tSysStudent.setSno(tSysStudentInfoview.getSno());
        tSysStudent.setSchoolid(schoolId);
        tSysStudent.setSpecialid(specialtyId);
        tSysStudent.setRegisterdate(tSysStudentInfoview.getRegisterdate());
        tSysStudentMapper.insert(tSysStudent);
    }

    @Override
    public void updateSysStudent(TSysstudent tSysStudent) {
        tSysStudentMapper.updateByPrimaryKey(tSysStudent);
    }

    @Override
    public void deleteSysStudent(String userId) {
        tSysUserMapper.deleteByUid(userId);
        tSysStudentMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void insertList(List<TStudentinfoview> tSysStudentInfoviews) {
        for(int i=0;i<tSysStudentInfoviews.size();i++){
            this.saveSysStudentInfoview(tSysStudentInfoviews.get(i));
        }
    }

    @Override
    public List<TStudentinfoview> queryAllSysStudentInfoview() {
        return tSysStudentInfoviewMapper.selectAll();
    }

    @Override
    public List<TStudentinfoview> page(int startIndex, int pageSize) {
        return tSysStudentInfoviewMapper.page(startIndex,pageSize);
    }
}
