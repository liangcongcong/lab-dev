package com.hurb.service.sysmanager;


import com.hurb.pojo.sysmanager.TStudentinfoview;
import com.hurb.pojo.sysmanager.TSysstudent;

import java.util.List;

public interface TSysStudentInfoviewService {
    public TStudentinfoview getSysStudentInfoviewByStuNum(String stu_num);

    public void saveSysStudentInfoview(TStudentinfoview tSysStudentInfoview);

    public void updateSysStudent(TSysstudent tSysStudent);

    public void deleteSysStudent(String uid);

    public void insertList(List<TStudentinfoview> tSysStudentInfoviews);

    List<TStudentinfoview> queryAllSysStudentInfoview();

    List<TStudentinfoview> page(int startIndex, int pageSize);
}
