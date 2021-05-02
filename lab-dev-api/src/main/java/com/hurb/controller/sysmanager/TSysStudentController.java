package com.hurb.controller.sysmanager;

import com.hurb.pojo.sysmanager.TStudentinfoview;
import com.hurb.pojo.sysmanager.TSysstudent;
import com.hurb.service.sysmanager.TSysStudentInfoviewService;
import com.hurb.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(value = "学生管理", tags = {"学生管理相关的api接口"})
@RestController
@RequestMapping("Student")
public class TSysStudentController {
    @Autowired
    private TSysStudentInfoviewService  tSysStudentInfoviewService;

    @ApiOperation(value = "获取所有学生信息", notes = "获取所有学生信息", httpMethod = "GET")
    @GetMapping("/getStudentList")
    public  Object queryAllSysStudentInfoview() {
        List<TStudentinfoview> tSysStudentInfoviewList= tSysStudentInfoviewService.queryAllSysStudentInfoview();
        return ResultUtil.success(tSysStudentInfoviewList);
    }


    @ApiOperation(value = "根据学号获取学生信息", notes = "根据学号获取学生信息", httpMethod = "GET")
    @GetMapping("/getStudentByStuNum")
    public  Object getStudentByStuNum(@RequestParam(value = "stuNum") String stuNum) {
        TStudentinfoview data= tSysStudentInfoviewService.getSysStudentInfoviewByStuNum(stuNum);
        return ResultUtil.success(data);
    }

    @ApiOperation(value = "新增学生", notes = "新增学生", httpMethod = "POST")
    @PostMapping ("/addStudent")
    public Object addStudent(@RequestBody TStudentinfoview tSysStudentInfoview) {
        String stu_num = tSysStudentInfoview.getSno();
        TStudentinfoview tSysStudent = tSysStudentInfoviewService.getSysStudentInfoviewByStuNum(stu_num);
        if(tSysStudent!=null){
            return ResultUtil.result(201,"学生已存在");
        }
        tSysStudentInfoviewService.saveSysStudentInfoview(tSysStudentInfoview);
        return ResultUtil.success();
    }
    @ApiOperation(value = "删除学生", notes = "删除学生", httpMethod = "DELETE")
    @DeleteMapping  ("/delete")
    public Object deleteStudent(String uid) {
        tSysStudentInfoviewService.deleteSysStudent(uid);
        return ResultUtil.success();
    }

    @ApiOperation(value = "批量删除学生", notes = "批量删除学生", httpMethod = "POST")
    @PostMapping ("/allDelete")
    public Object allDeleteStudent(@RequestBody String[] uidList) {
        for (int i=0;i<uidList.length;i++){
            tSysStudentInfoviewService.deleteSysStudent(uidList[i]);
        }
        return ResultUtil.success();
    }

    @ApiOperation(value = "修改学生信息", notes = "删除学生信息", httpMethod = "POST")
    @PostMapping ("/update")
    public Object updateStudent(@RequestBody TSysstudent tSysStudent) {
        tSysStudentInfoviewService.updateSysStudent(tSysStudent);
        return ResultUtil.success();
    }


    @GetMapping(value = "/pagination")
    @ApiOperation(value = "学生数据分页")
    public Object paging(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (page == null || size == null) {
            page = 1;
            size = 10;
        }
        int startIndex = (page-1)*size;
        List<TStudentinfoview> pageObj = tSysStudentInfoviewService.page(startIndex, size);
        return ResultUtil.success(pageObj);
    }
}
