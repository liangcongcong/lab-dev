package com.hurb.controller.sysmanager;

import com.alibaba.fastjson.JSONArray;
import com.hurb.mapper.sysmanager.TSysRoleMapper;
import com.hurb.pojo.*;
import com.hurb.pojo.sysmanager.TSysuser;
import com.hurb.pojo.sysmanager.TUserroleview;
import com.hurb.service.sysmanager.TSysUserRoleViewService;
import com.hurb.service.sysmanager.TSysUserService;
import com.hurb.utils.EmailUtils;
import com.hurb.utils.MobileEmailUtils;
import com.hurb.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api(value = "系统用户管理", tags = {"系统用户管理相关的api接口"})
@RestController
@RequestMapping("SysUser")
public class TSysUserController {
    @Autowired
    private TSysUserService sysUserService;

    @Autowired
    private EmailUtils emailUtils;

    @Autowired
    private TSysUserRoleViewService tSysUserRoleViewService;

    @Autowired
    private TSysRoleMapper tSysRoleMapper;

    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping("/login")
    public Object loginTSysUser(@RequestBody  TSysuser sysUser) {
        String username = sysUser.getUsername();
        String password = sysUser.getPassword();
        TSysuser user = sysUserService.queryUserForLogin(username,password);
        if(user != null){
            return ResultUtil.success(user);
        } else {
            return ResultUtil.loginError();
        }
    }
    @ApiOperation(value = "用户登出", notes = "用户登出", httpMethod = "POST")
    @PostMapping("/logout")
    public Object logout() {
        return ResultUtil.success();
    }

    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息", httpMethod = "GET")
    @GetMapping ("/getUserList")
    public Object queryAllTSysUser() {
        return ResultUtil.success(sysUserService.queryAllUser());
    }

    @ApiOperation(value = "根据用户uid查询用户详细信息", notes = "根据用户uid查询用户详细信息", httpMethod = "POST")
    @GetMapping("/getByUid")
    public Object getTSysUser(String uid) {
        Map<String, Object> data = new HashMap<String, Object>();
        Map map = new HashMap();
        TSysuser user =  sysUserService.getSysUserInfoByUid(uid);
        List<TUserroleview> tSysUserRoleViews = tSysUserRoleViewService.getSysUserRoleViewByUid(uid);
        String[] roles = new String[tSysUserRoleViews.size()];
        for(int i =0;i<tSysUserRoleViews.size();i++){
            roles[i]= tSysUserRoleViews.get(i).getName();
        }
        map.put("introduction",user);
        map.put("name", user.getUsername());
        map.put("roles", roles);
        map.put("avatar", user.getPicture());
        return ResultUtil.success(map);
    }

    @ApiOperation(value = "保存用户信息", notes = "保存用户信息", httpMethod = "POST")
    @PostMapping("/save")
    public Object saveTSysUser(TSysuser user) {
        sysUserService.saveSysUser(user);
        return ResultUtil.success();
    }

    @ApiOperation(value = "更新保存用户信息", notes = "更新保存用户信息", httpMethod = "POST")
    @PostMapping("/update")
    public Object updateTSysUser(TSysuser user) {
        sysUserService.updateSysUser(user);
        return ResultUtil.success();
    }

    @ApiOperation(value = "根据uid删除用户信息", notes = "根据uid删除用户信息", httpMethod = "POST")
    @PostMapping("/deleteByUid")
    public Object deleteTSysUser(String uid) {
        sysUserService.deleteSysUser(uid);
        return ResultUtil.success();
    }

    @ApiOperation(value = "发送邮箱验证码", notes = "发送邮箱验证码", httpMethod = "POST")
    @PostMapping("/mail")
    @ResponseBody
    public Object sendMailCode(String email,HttpSession session) {
        boolean checkEmailIsOk = MobileEmailUtils.checkEmailIsOk(email);
        if(!checkEmailIsOk){
            return ResultUtil.result(200,"邮箱格式错误！");
        }
        boolean res = emailUtils.sendMail(email, session);
        if(!res){
            return  ResultUtil.result(200,"发送失败！");
        }
        return ResultUtil.success();
    }

    @ApiOperation(value = "验证注册信息并且保存用户数据", notes = "验证注册信息并且保存用户数据", httpMethod = "POST")
    @PostMapping("/register")
    public Object register(@RequestBody String str,HttpSession session) throws JSONException {

        //获取session中的验证信息
        String code = (String) session.getAttribute("code");
        JSONObject jsonObject = JSONObject.parseObject(str);
        String user = jsonObject.getString("user");
        String formCode = jsonObject.get("formCode").toString();
        //将json数据转换为java对象/实体类
        TSysuser tSysUser = JSON.parseObject(user, TSysuser.class);
        // 1.失败之后重新注册
        if (!code.equals(formCode)) {
            return ResultUtil.result(201,"验证码不一致");
        }
        // 2. 查询用户名是否存在
        boolean isExist = sysUserService.queryUsernameIsExist(tSysUser.getUsername());
        if (isExist) {
            return ResultUtil.result(201,"用户名已存在");
        }
        sysUserService.createUser(tSysUser);
        return ResultUtil.success(tSysUser);
    }

    @ApiOperation(value = "根据uid修改账户状态", notes = "根据uid更改账户状态", httpMethod = "POST")
    @PostMapping("/updateStatusByUid")
    public Object updateStatusByUid(@RequestParam(value = "uid") String uid ,@RequestParam(value = "status") int status) {
        TSysuser tSysUser = sysUserService.getSysUserInfoByUid(uid);
        tSysUser.setStatus(status);
        sysUserService.updateSysUser(tSysUser);
        return ResultUtil.success();
    }

    @ApiOperation(value = "根据uid批量修改账户状态", notes = "根据uid更改账户状态", httpMethod = "POST")
    @PostMapping("/allUpdateStatusByUid")
    public Object allUpdateStatusByUid(@RequestBody JSONObject jsonObject) {
        String[] uidList=jsonObject.getJSONArray("uidList").toArray(new String[]{});
        int status = Integer.parseInt(String.valueOf(jsonObject.get("status")));
        for(int i=0;i<uidList.length;i++){
            TSysuser tSysUser = sysUserService.getSysUserInfoByUid(uidList[i]);
            tSysUser.setStatus(status);
            sysUserService.updateSysUser(tSysUser);
        }
        return ResultUtil.success();
    }

    @GetMapping(value = "/pagination")
    @ApiOperation(value = "用户数据分页")
    public Object paging(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (page == null || size == null) {
            page = 1;
            size = 10;
        }
        int startIndex = (page-1)*size;
        List<TSysuser> pageObj = sysUserService.page(startIndex, size);
        return ResultUtil.success(pageObj);
    }



}
