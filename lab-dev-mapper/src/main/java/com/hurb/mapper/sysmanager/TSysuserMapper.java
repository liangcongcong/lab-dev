package com.hurb.mapper.sysmanager;


import com.hurb.my.mapper.MyMapper;
import com.hurb.pojo.sysmanager.TSysuser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TSysuserMapper extends MyMapper<TSysuser> {
    @Select({"select * from t_sysuser where uid=#{uid}"})
    TSysuser getByUid(String uid);
    @Delete({"delete from t_sysuser where uid=#{uid}"})
    int deleteByUid(String uid);
    @Select({"select * from t_sysuser limit #{startIndex},#{pageSize}"})
    List<TSysuser> page(int startIndex, int pageSize);
}