package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_sessionrecord")
public class TSysSessionrecord {
    /**
     * id
     */
    @Id
    private Integer id;

    @Column(name = "sessionID")
    private String sessionid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 过期时间
     */
    @Column(name = "expireTime")
    private Date expiretime;

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
     * @return sessionID
     */
    public String getSessionid() {
        return sessionid;
    }

    /**
     * @param sessionid
     */
    public void setSessionid(String sessionid) {
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

    /**
     * 获取过期时间
     *
     * @return expireTime - 过期时间
     */
    public Date getExpiretime() {
        return expiretime;
    }

    /**
     * 设置过期时间
     *
     * @param expiretime 过期时间
     */
    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }
}