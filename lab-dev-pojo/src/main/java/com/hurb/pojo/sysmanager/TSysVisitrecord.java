package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_visitrecord")
public class TSysVisitrecord {
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
     * 访问时间
     */
    @Column(name = "visitTime")
    private Date visittime;

    /**
     * 访问地址
     */
    @Column(name = "visitUrl")
    private String visiturl;

    /**
     * 请求方法
     */
    @Column(name = "requestMethod")
    private String requestmethod;

    /**
     * sessionId
     */
    @Column(name = "sessionId")
    private String sessionid;

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
     * 获取访问时间
     *
     * @return visitTime - 访问时间
     */
    public Date getVisittime() {
        return visittime;
    }

    /**
     * 设置访问时间
     *
     * @param visittime 访问时间
     */
    public void setVisittime(Date visittime) {
        this.visittime = visittime;
    }

    /**
     * 获取访问地址
     *
     * @return visitUrl - 访问地址
     */
    public String getVisiturl() {
        return visiturl;
    }

    /**
     * 设置访问地址
     *
     * @param visiturl 访问地址
     */
    public void setVisiturl(String visiturl) {
        this.visiturl = visiturl;
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
     * 获取sessionId
     *
     * @return sessionId - sessionId
     */
    public String getSessionid() {
        return sessionid;
    }

    /**
     * 设置sessionId
     *
     * @param sessionid sessionId
     */
    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }
}