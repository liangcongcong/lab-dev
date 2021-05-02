package com.hurb.mapper.sysmanager;


import com.hurb.my.mapper.MyMapper;
import com.hurb.pojo.sysmanager.TUserroleview;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TUserroleviewMapper extends MyMapper<TUserroleview> {
    @Select({"select * from t_userRoleView where userUid=#{uid}"})
    List<TUserroleview> getByUId(String uid);
}