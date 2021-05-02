package com.hurb.service.impl.sysmanager;

//import com.hurb.mapper.*;
//import com.hurb.pojo.TSysTeacher;
//import com.hurb.pojo.TSysTeacherInfoview;
//import com.hurb.pojo.TSysUser;
import com.hurb.service.sysmanager.TSysTeacherInfoviewService;
import com.hurb.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TSysTeacherInfoviewServiceImpl implements TSysTeacherInfoviewService {
//    @Autowired
//    public TSysTeacherInfoviewMapper tSysTeacherInfoviewMapper;
//
//    @Autowired
//    public TSysRoleMapper tSysRoleMapper;
//
//    @Autowired
//    public TSysTeacherMapper tSysTeacherMapper;
//
//    @Autowired
//    public TSysSpecialtyMapper tSysSpecialtyMapper ;
//
//    @Autowired
//    public TSysSchoolMapper tSysSchoolMapper;
//
//    @Autowired
//    public TSysUserMapper tSysUserMapper;
//
//    @Autowired
//    private Sid sid;
//
//    /**
//     * 根据教工号查询
//     * @param teaNum
//     * @return
//     */
//    @Override
//    public TSysTeacherInfoview getSysTeacherInfoviewByTeaNum(String teaNum) {
//        return tSysTeacherInfoviewMapper.getByTeaNum(teaNum);
//    }
//
//    /**
//     * 新增教师
//     * @param tSysTeacherInfoview
//     */
//    @Override
//    public void saveSysTeacherInfoview(TSysTeacherInfoview tSysTeacherInfoview) {
//        //先创建用户，获取userId
//        String userId = sid.nextShort();
//        TSysUser user = new TSysUser();
//        user.setUid(userId);
//        user.setUsername(tSysTeacherInfoview.getRealname());
//        user.setPassword("111111");
//        user.setRealname(tSysTeacherInfoview.getRealname());
//        user.setStatus(0);
//        try {
//            user.setSalt(MD5Utils.getMD5Str(tSysTeacherInfoview.getPassword()));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        tSysUserMapper.insert(user);
//        //获取schoolId，specialtyId，创建teacher
////        Integer schoolId = tSysTeacherInfoview.getSchoolid();
////        Integer specialtyId = tSysTeacherInfoview.getSpecialid();
//        TSysTeacher tSysTeacher = new TSysTeacher();
//        tSysTeacher.setUserUid(userId);
//        tSysTeacher.setTeaNum(tSysTeacherInfoview.getTeaNum());
//        tSysTeacher.setSex(tSysTeacherInfoview.getSex());
//        tSysTeacher.setAdminClass(tSysTeacherInfoview.getAdminClass());
//        tSysTeacher.setFlag(tSysTeacherInfoview.getStatus());
//        tSysTeacher.setCourseOffered(tSysTeacherInfoview.getCourseOffered());
//        tSysTeacher.setTitle(tSysTeacherInfoview.getTitle());
//        tSysTeacher.setGraduateInstitu(tSysTeacherInfoview.getGraduateInstitu());
//        tSysTeacherMapper.insert(tSysTeacher);
//    }
//
//    @Override
//    public void updateSysTeacher(TSysTeacher tSysTeacher) {
//        tSysTeacherMapper.updateByPrimaryKey(tSysTeacher);
//    }
//
//    @Override
//    public void deleteSysTeacher(String userId) {
//        tSysUserMapper.deleteByPrimaryKey(userId);
//        tSysTeacherMapper.deleteByPrimaryKey(userId);
//    }
//
//    @Override
//    public void insertList(List<TSysTeacherInfoview> tSysTeacherInfoviews) {
//        for(int i=0;i<tSysTeacherInfoviews.size();i++){
//            this.saveSysTeacherInfoview(tSysTeacherInfoviews.get(i));
//        }
//    }
//
//    @Override
//    public List<TSysTeacherInfoview> queryAllSysTeacherInfoview() {
//        return tSysTeacherInfoviewMapper.selectAll();
//    }
//
//    @Override
//    public List<TSysTeacherInfoview> page(int startIndex, int pageSize) {
//        return tSysTeacherInfoviewMapper.page(startIndex,pageSize);
//    }
}
