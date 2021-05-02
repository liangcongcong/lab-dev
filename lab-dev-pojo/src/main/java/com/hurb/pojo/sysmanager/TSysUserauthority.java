package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_userauthority")
public class TSysUserauthority {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 角色id
     */
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 权限id
     */
    @Column(name = "authorityId")
    private Integer authorityid;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色id
     *
     * @return roleId - 角色id
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id
     *
     * @param roleid 角色id
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取权限id
     *
     * @return authorityId - 权限id
     */
    public Integer getAuthorityid() {
        return authorityid;
    }

    /**
     * 设置权限id
     *
     * @param authorityid 权限id
     */
    public void setAuthorityid(Integer authorityid) {
        this.authorityid = authorityid;
    }
}