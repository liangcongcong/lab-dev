package com.hurb.controller.sysmanager;

//import com.hurb.pojo.TSysDepartment;
//import com.hurb.pojo.TSysGrouplist;
//import com.hurb.service.sysmanager.TSysGrouplistService;
//import com.hurb.utils.ResultUtil;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Api(value = "分组管理", tags = {"分组管理相关的api接口"})
//@RestController
//@RequestMapping("Group")
public class TSysGrouplistController {
//
//    @Autowired
//    private TSysGrouplistService tSysGrouplistService;
//
//    @ApiOperation(value = "获取所有分组信息", notes = "获取所有分组信息", httpMethod = "GET")
//    @GetMapping("/getGroupList")
//    public Object queryAllSysGrouplist() {
//        List<TSysGrouplist> tSysGrouplist= tSysGrouplistService.queryAllSysGrouplist();
//        return ResultUtil.success(tSysGrouplist);
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
//        List<TSysGrouplist> pageObj = tSysGrouplistService.page(startIndex, size);
//        return ResultUtil.success(pageObj);
//    }
//
//    @ApiOperation(value = "根据名称获取分组信息", notes = "根据名称获取分组信息", httpMethod = "GET")
//    @GetMapping("/getGroupByName")
//    public  Object getSysGrouplistByName(String name) {
//        TSysGrouplist data = tSysGrouplistService.getSysGrouplistByName(name);
//        return ResultUtil.success(data);
//    }
//
//    @ApiOperation(value = "新增分组", notes = "新增分组", httpMethod = "POST")
//    @PostMapping("/addGroup")
//    public Object addGrouplist(@RequestBody TSysGrouplist tSysGrouplist) {
//        String Name = tSysGrouplist.getName();
//        TSysGrouplist tSysGrouplist1 = tSysGrouplistService.getSysGrouplistByName(Name);
//        if(tSysGrouplist1!=null){
//            return ResultUtil.result(201,"分组已存在");
//        }
//        tSysGrouplistService.saveSysGrouplist(tSysGrouplist);
//        return ResultUtil.success();
//
//    }
//
//    @ApiOperation(value = "修改分组信息", notes = "删除分组信息", httpMethod = "POST")
//    @PostMapping ("/updateGroup")
//    public Object updateStudent(@RequestBody TSysDepartment tSysDepartment) {
//        tSysGrouplistService.updateSysGroup(tSysDepartment);
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "删除分组", notes = "删除分组", httpMethod = "DELETE")
//    @DeleteMapping  ("/deleteGroup")
//    public Object deleteGroup(Integer id) {
//        tSysGrouplistService.deleteSysGroup(id);
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "批量删除分组", notes = "批量删除分组", httpMethod = "POST")
//    @PostMapping ("/allDeleteGroup")
//    public Object allDeleteGroup(@RequestBody Integer[] idList) {
//        for (int i=0;i<idList.length;i++){
//            tSysGrouplistService.deleteSysGroup(idList[i]);
//        }
//        return ResultUtil.success();
//    }
//
//    @ApiOperation(value = "根据类型获取分组信息", notes = "根据类型获取分组信息", httpMethod = "GET")
//    @GetMapping("/getGroupByType")
//    public  Object getSysGrouplistByType(int typeId) {
//        List<TSysGrouplist> data = tSysGrouplistService.getSysGrouplistByType(typeId);
//        return ResultUtil.success(data);
//    }

}
