package com.hurb.controller.sysmanager;

//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.hurb.pojo.TSysTeacher;
//import com.hurb.pojo.TSysTeacherInfoview;
//import com.hurb.pojo.TSysUser;
//import com.hurb.service.sysmanager.TSysTeacherInfoviewService;
//import com.hurb.service.sysmanager.TSysUserService;
//import com.hurb.utils.ResultUtil;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Arrays;
//import java.util.List;
//
//
//@Api(value = "教师管理", tags = {"教师管理相关的api接口"})
//@RestController
//@RequestMapping("Teacher")
public class TSysTeacherController {
//    @Autowired
//    private TSysTeacherInfoviewService  tSysTeacherInfoviewService;
//
//    @Autowired
//    private TSysUserService tSysUserService;
//    @ApiOperation(value = "获取所有教师信息", notes = "获取所有教师信息", httpMethod = "GET")
//    @GetMapping("/getTeacherList")
//    public  Object queryAllSysTeacherInfoview() {
//        List<TSysTeacherInfoview> tSysTeacherInfoviewList= tSysTeacherInfoviewService.queryAllSysTeacherInfoview();
//        return ResultUtil.success(tSysTeacherInfoviewList);
//    }
//
//
//    @ApiOperation(value = "根据教工号获取教师信息", notes = "根据教工号获取教师信息", httpMethod = "GET")
//    @GetMapping("/getTeacherByTeaNum")
//    public  Object getTeacherByTeaNum(@RequestParam(value = "teaNum") String teaNum) {
//        TSysTeacherInfoview data= tSysTeacherInfoviewService.getSysTeacherInfoviewByTeaNum(teaNum);
//        return ResultUtil.success(data);
//    }
//
//    @ApiOperation(value = "新增教师", notes = "新增教师", httpMethod = "POST")
//    @PostMapping ("/addTeacher")
//    public Object addTeacher(@RequestBody TSysTeacherInfoview tSysTeacherInfoview) {
//        String teaNum  = tSysTeacherInfoview.getTeaNum();
//        TSysTeacherInfoview tSysTeacher = tSysTeacherInfoviewService.getSysTeacherInfoviewByTeaNum(teaNum);
//        if(tSysTeacher!=null){
//            return ResultUtil.result(201,"教师已存在");
//        }
//        tSysTeacherInfoviewService.saveSysTeacherInfoview(tSysTeacherInfoview);
//        return ResultUtil.success();
//    }
//    @ApiOperation(value = "删除教师", notes = "删除教师", httpMethod = "DELETE")
//    @DeleteMapping  ("/delete")
//    public Object deleteTeacher(String uid) {
//        tSysTeacherInfoviewService.deleteSysTeacher(uid);
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "批量删除教师", notes = "批量删除教师", httpMethod = "POST")
//    @PostMapping ("/allDelete")
//    public Object allDeleteTeacher(@RequestBody String[] uidList) {
//        for (int i=0;i<uidList.length;i++){
//            tSysTeacherInfoviewService.deleteSysTeacher(uidList[i]);
//        }
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "修改教师信息", notes = "删除教师信息", httpMethod = "POST")
//    @PostMapping ("/update")
//    public Object updateSysTeacher(@RequestBody TSysTeacher tSysTeacher) {
//        tSysTeacherInfoviewService.updateSysTeacher(tSysTeacher);
//        return ResultUtil.success();
//    }
//
//
//    @GetMapping(value = "/pagination")
//    @ApiOperation(value = "教师数据分页")
//    public Object paging(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
//        if (page == null || size == null) {
//            page = 1;
//            size = 10;
//        }
//        int startIndex = (page-1)*size;
//        List<TSysTeacherInfoview> pageObj = tSysTeacherInfoviewService.page(startIndex, size);
//        return ResultUtil.success(pageObj);
//    }
}
