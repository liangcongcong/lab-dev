package com.hurb.mapper.sysmanager;


import com.hurb.my.mapper.MyMapper;
import com.hurb.pojo.sysmanager.TStudentinfoview;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TStudentinfoviewMapper extends MyMapper<TStudentinfoview> {
    @Select({"select * from t_studentInfoView where sNo=#{stu_num}"})
    TStudentinfoview getByStuNum(String stu_num);

    @Select({"select * from t_studentInfoView limit #{startIndex},#{pageSize}"})
    List<TStudentinfoview> page(int startIndex, int pageSize);
}