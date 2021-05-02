package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_userrole")
public class TSysUserrole {
    /**
     * 唯一编码
     */
    @Id
    private Long id;

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
     * 优先级 默认99
     */
    private Integer priority;

    /**
     * 部门id 1. 用户所属学院等
     */
    @Column(name = "departmentId")
    private String departmentid;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * 获取优先级 默认99
     *
     * @return priority - 优先级 默认99
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置优先级 默认99
     *
     * @param priority 优先级 默认99
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取部门id 1. 用户所属学院等
     *
     * @return departmentId - 部门id 1. 用户所属学院等
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置部门id 1. 用户所属学院等
     *
     * @param departmentid 部门id 1. 用户所属学院等
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }
}