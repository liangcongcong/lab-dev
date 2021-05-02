package com.hurb.controller.sysmanager;


import com.hurb.pojo.sysmanager.TSysSpecialty;
import com.hurb.service.sysmanager.TSysSpecialtyService;
import com.hurb.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Api(value = "专业管理", tags = {"专业管理相关的api接口"})
@RestController
@RequestMapping("Specialty")
public class TSysSpecialtyController {
    @Autowired
    public TSysSpecialtyService tSysSpecialtyService;

    @ApiOperation(value = "获取所有专业信息", notes = "获取所有专业信息", httpMethod = "GET")
    @GetMapping("/getSpecialtyList")
    public Object queryAllSysSpecialty(){
        List<TSysSpecialty> tSysSpecialties = tSysSpecialtyService.queryAllSysSpecialty();
        return ResultUtil.success(tSysSpecialties);
    }
}
