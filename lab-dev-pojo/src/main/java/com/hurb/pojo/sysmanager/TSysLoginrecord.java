package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_loginrecord")
public class TSysLoginrecord {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 用户uid
     */
    @Column(name = "userUid")
    private Integer useruid;

    /**
     * 登录时间
     */
    @Column(name = "loginTime")
    private Date logintime;

    /**
     * 退出时间
     */
    @Column(name = "loginOutTime")
    private Date loginouttime;

    /**
     * 请求方法
     */
    @Column(name = "requestMethod")
    private String requestmethod;

    /**
     * session
     */
    @Column(name = "sessionId")
    private String sessionid;

    /**
     * 登录IP
     */
    @Column(name = "loginIp")
    private String loginip;

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
     * 获取用户uid
     *
     * @return userUid - 用户uid
     */
    public Integer getUseruid() {
        return useruid;
    }

    /**
     * 设置用户uid
     *
     * @param useruid 用户uid
     */
    public void setUseruid(Integer useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取登录时间
     *
     * @return loginTime - 登录时间
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * 设置登录时间
     *
     * @param logintime 登录时间
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * 获取退出时间
     *
     * @return loginOutTime - 退出时间
     */
    public Date getLoginouttime() {
        return loginouttime;
    }

    /**
     * 设置退出时间
     *
     * @param loginouttime 退出时间
     */
    public void setLoginouttime(Date loginouttime) {
        this.loginouttime = loginouttime;
    }

    /**
     * 获取请求方法
     *
     * @return requestMethod - 请求方法
     */
    public String getRequestmethod() {
        return requestmethod;
    }

    /**
     * 设置请求方法
     *
     * @param requestmethod 请求方法
     */
    public void setRequestmethod(String requestmethod) {
        this.requestmethod = requestmethod;
    }

    /**
     * 获取session
     *
     * @return sessionId - session
     */
    public String getSessionid() {
        return sessionid;
    }

    /**
     * 设置session
     *
     * @param sessionid session
     */
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    /**
     * 获取登录IP
     *
     * @return loginIp - 登录IP
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * 设置登录IP
     *
     * @param loginip 登录IP
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }
}