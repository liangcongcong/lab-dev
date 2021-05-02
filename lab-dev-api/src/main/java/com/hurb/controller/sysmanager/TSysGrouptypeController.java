package com.hurb.controller.sysmanager;

//import com.hurb.pojo.TSysGrouplist;
//import com.hurb.pojo.TSysGrouptype;
//import com.hurb.service.sysmanager.TSysGroupTypeService;
//import com.hurb.utils.ResultUtil;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Api(value = "类型管理", tags = {"类型管理相关的api接口"})
//@RestController
//@RequestMapping("Type")
public class TSysGrouptypeController {
//
//    @Autowired
//    public TSysGroupTypeService tSysGroupTypeService;
//
//    @ApiOperation(value = "获取所有类型信息", notes = "获取所有类型信息", httpMethod = "GET")
//    @GetMapping("/getGroupTypeList")
//    public Object queryAllSysGrouptypelist(){
//        List<TSysGrouptype> tSysGrouptypes = tSysGroupTypeService.queryAllSysGrouptype();
//        return ResultUtil.success(tSysGrouptypes);
//    }
//
//    @GetMapping(value = "/pagination")
//    @ApiOperation(value = "分组数据分页")
//    public Object paging(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
//        if (page == null || size == null) {
//            page = 1;
//            size = 10;
//        }
//        int startIndex = (page-1)*size;
//        List<TSysGrouptype> pageObj = tSysGroupTypeService.page(startIndex, size);
//        return ResultUtil.success(pageObj);
//    }
//
//    @ApiOperation(value = "新增类型", notes = "新增类型", httpMethod = "POST")
//    @PostMapping("/addGroupType")
//    public Object addTypelist(@RequestBody TSysGrouptype tSysGrouptype) {
//        tSysGrouptype.setId(null);
//        String Name = tSysGrouptype.getGrouptypename();
//        TSysGrouptype tSysGrouptype1 = tSysGroupTypeService.getSysGroupTypeByName(Name);
//        if(tSysGrouptype1!=null){
//            return ResultUtil.result(201,"分组已存在");
//        }
//        tSysGroupTypeService.saveSysTypelist(tSysGrouptype);
//        return ResultUtil.success();
//
//    }
//
//    @ApiOperation(value = "修改类型信息", notes = "删除类型信息", httpMethod = "POST")
//    @PostMapping ("/updateGroupType")
//    public Object updateStudent(@RequestBody TSysGrouptype tSysGrouptype) {
//        tSysGroupTypeService.updateSysType(tSysGrouptype);
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "删除类型", notes = "删除类型", httpMethod = "DELETE")
//    @DeleteMapping  ("/deleteGroupType")
//    public Object deleteGroup(Integer id) {
//        tSysGroupTypeService.deleteSysType(id);
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "根据名称获取类型信息", notes = "根据名称获取类型信息", httpMethod = "GET")
//    @GetMapping("/getGroupTypeByName")
//    public  Object getSysGrouplistByName(@RequestParam(value = "name") String name) {
//        TSysGrouptype data = tSysGroupTypeService.getSysGroupTypeByName(name);
//        return ResultUtil.success(data);
//    }

}
