package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_userroleview")
public class TUserroleview {
    /**
     * 角色编号 外键sys_role (id)
     */
    @Column(name = "roleId")
    private Long roleid;

    /**
     * 用户编号 外键sys_user (id)
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 用户账户 登录唯一
     */
    private String username;

    /**
     * 用户名登录密码
     */
    private String password;

    /**
     * 获取角色编号 外键sys_role (id)
     *
     * @return roleId - 角色编号 外键sys_role (id)
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * 设置角色编号 外键sys_role (id)
     *
     * @param roleid 角色编号 外键sys_role (id)
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取用户编号 外键sys_user (id)
     *
     * @return userUid - 用户编号 外键sys_user (id)
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置用户编号 外键sys_user (id)
     *
     * @param useruid 用户编号 外键sys_user (id)
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户账户 登录唯一
     *
     * @return username - 用户账户 登录唯一
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户账户 登录唯一
     *
     * @param username 用户账户 登录唯一
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户名登录密码
     *
     * @return password - 用户名登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户名登录密码
     *
     * @param password 用户名登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}