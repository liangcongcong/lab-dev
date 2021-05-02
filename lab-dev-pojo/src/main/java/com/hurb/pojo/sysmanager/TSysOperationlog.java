package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_operationlog")
public class TSysOperationlog {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 操作者uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 操作类型
     */
    @Column(name = "operateType")
    private String operatetype;

    /**
     * 操作目标id（对应系统模块表）
     */
    @Column(name = "operationTargetId")
    private Integer operationtargetid;

    /**
     * 会话id
     */
    @Column(name = "sessionId")
    private Integer sessionid;

    /**
     * 操作者ip
     */
    @Column(name = "operatorIp")
    private String operatorip;

    /**
     * 操作时间
     */
    @Column(name = "operateTime")
    private Date operatetime;

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
     * 获取操作者uid
     *
     * @return userUid - 操作者uid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置操作者uid
     *
     * @param useruid 操作者uid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取操作类型
     *
     * @return operateType - 操作类型
     */
    public String getOperatetype() {
        return operatetype;
    }

    /**
     * 设置操作类型
     *
     * @param operatetype 操作类型
     */
    public void setOperatetype(String operatetype) {
        this.operatetype = operatetype;
    }

    /**
     * 获取操作目标id（对应系统模块表）
     *
     * @return operationTargetId - 操作目标id（对应系统模块表）
     */
    public Integer getOperationtargetid() {
        return operationtargetid;
    }

    /**
     * 设置操作目标id（对应系统模块表）
     *
     * @param operationtargetid 操作目标id（对应系统模块表）
     */
    public void setOperationtargetid(Integer operationtargetid) {
        this.operationtargetid = operationtargetid;
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
     * 获取操作者ip
     *
     * @return operatorIp - 操作者ip
     */
    public String getOperatorip() {
        return operatorip;
    }

    /**
     * 设置操作者ip
     *
     * @param operatorip 操作者ip
     */
    public void setOperatorip(String operatorip) {
        this.operatorip = operatorip;
    }

    /**
     * 获取操作时间
     *
     * @return operateTime - 操作时间
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * 设置操作时间
     *
     * @param operatetime 操作时间
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }
}