package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_authority")
public class TSysAuthority {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_Id")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户权限等级
     */
    @Column(name = "user_authority_level")
    private Integer userAuthorityLevel;

    /**
     * 说明
     */
    private String demo;

    /**
     * 获取用户ID
     *
     * @return user_Id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户权限等级
     *
     * @return user_authority_level - 用户权限等级
     */
    public Integer getUserAuthorityLevel() {
        return userAuthorityLevel;
    }

    /**
     * 设置用户权限等级
     *
     * @param userAuthorityLevel 用户权限等级
     */
    public void setUserAuthorityLevel(Integer userAuthorityLevel) {
        this.userAuthorityLevel = userAuthorityLevel;
    }

    /**
     * 获取说明
     *
     * @return demo - 说明
     */
    public String getDemo() {
        return demo;
    }

    /**
     * 设置说明
     *
     * @param demo 说明
     */
    public void setDemo(String demo) {
        this.demo = demo;
    }
}