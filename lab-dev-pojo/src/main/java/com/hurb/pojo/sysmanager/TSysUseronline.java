package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_useronline")
public class TSysUseronline {
    @Id
    private Integer id;

    /**
     * 用户uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 登录id
     */
    @Column(name = "loginId")
    private Integer loginid;

    /**
     * 访问id
     */
    @Column(name = "visitId")
    private Integer visitid;

    /**
     * 会话id
     */
    @Column(name = "sessionId")
    private Integer sessionid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户uid
     *
     * @return userUid - 用户uid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置用户uid
     *
     * @param useruid 用户uid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取登录id
     *
     * @return loginId - 登录id
     */
    public Integer getLoginid() {
        return loginid;
    }

    /**
     * 设置登录id
     *
     * @param loginid 登录id
     */
    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    /**
     * 获取访问id
     *
     * @return visitId - 访问id
     */
    public Integer getVisitid() {
        return visitid;
    }

    /**
     * 设置访问id
     *
     * @param visitid 访问id
     */
    public void setVisitid(Integer visitid) {
        this.visitid = visitid;
    }

    /**
     * 获取会话id
     *
     * @return sessionId - 会话id
     */
    public Integer getSessionid() {
        return sessionid;
    }

    /**
     * 设置会话id
     *
     * @param sessionid 会话id
     */
    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}