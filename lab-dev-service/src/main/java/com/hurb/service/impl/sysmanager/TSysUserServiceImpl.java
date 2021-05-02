package com.hurb.service.impl.sysmanager;

import com.hurb.enums.Sex;
import com.hurb.mapper.sysmanager.TSysuserMapper;
import com.hurb.pojo.Users;
import com.hurb.pojo.sysmanager.TSysuser;
import com.hurb.service.sysmanager.TSysUserService;
import com.hurb.utils.DateUtil;
import com.hurb.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TSysUserServiceImpl implements TSysUserService {

    @Autowired
    public TSysuserMapper sysUserMapper;
    @Autowired
    private Sid sid;

    private static final String USER_FACE = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andEqualTo("username", username);
        TSysuser result = sysUserMapper.selectOneByExample(userExample);
        return result == null ? false : true;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public TSysuser createUser(TSysuser sysUser) {
        String userId = sid.nextShort();
        TSysuser user = new TSysuser();
        user.setUid(userId);
        user.setUsername(sysUser.getUsername());
        user.setPassword(sysUser.getPassword());
        user.setEmail(sysUser.getEmail());
        try {
            user.setSalt(MD5Utils.getMD5Str(sysUser.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 默认用户昵称同用户名
        user.setNickname(sysUser.getUsername());
        // 默认头像
        user.setPicture(USER_FACE);
        // 默认生日
        user.setBirthday(DateUtil.stringToDate("1900-01-01"));
        // 默认性别为 保密
        user.setSex(Sex.secret.value);
        // 默认状态0
        user.setStatus(0);
        sysUserMapper.insert(user);

        return user;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public TSysuser queryUserForLogin(String username, String password) {
        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);
        userCriteria.andEqualTo("password", password);

        TSysuser result = sysUserMapper.selectOneByExample(userExample);
        return result;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public TSysuser getSysUserInfoByUid(String uid) {
        return sysUserMapper.getByUid(uid);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveSysUser(TSysuser user) {
        sysUserMapper.insert(user);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateSysUser(TSysuser user) {
        sysUserMapper.updateByPrimaryKey(user);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteSysUser(String uid) {
        sysUserMapper.deleteByPrimaryKey(uid);
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<TSysuser> queryAllUser() {
        return sysUserMapper.selectAll();
    }

    @Override
    public List<TSysuser> page(int startIndex, int pageSize) {
        return sysUserMapper.page(startIndex,pageSize);
    }
}
