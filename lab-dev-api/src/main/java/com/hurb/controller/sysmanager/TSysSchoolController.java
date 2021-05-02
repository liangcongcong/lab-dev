package com.hurb.controller.sysmanager;

import com.hurb.pojo.sysmanager.TSysSchool;
import com.hurb.service.sysmanager.TSysSchoolService;
import com.hurb.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "学校管理", tags = {"学校管理相关的api接口"})
@RestController
@RequestMapping("School")
public class TSysSchoolController {
    @Autowired
    public TSysSchoolService tSysSchoolService;

    @ApiOperation(value = "获取所有学校信息", notes = "获取所有学校信息", httpMethod = "GET")
    @GetMapping("/getSchoolList")
    public Object queryAllSysSchool(){
        List<TSysSchool> tSysSchools = tSysSchoolService.queryAllSysSchool();
        return ResultUtil.success(tSysSchools);
    }


}
