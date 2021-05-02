package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_orderexperimentapplication")
public class TSysOrderexperimentapplication {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 实验id
     */
    @Column(name = "experimentId")
    private Integer experimentid;

    /**
     * 用户uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 上课时间
     */
    @Column(name = "takeClassDate")
    private Date takeclassdate;

    /**
     * 实验人数
     */
    @Column(name = "personNumber")
    private Integer personnumber;

    /**
     * 申请状态
     */
    @Column(name = "applicationStatus")
    private String applicationstatus;

    /**
     * 特殊要求
     */
    @Column(name = "specialRequirements")
    private String specialrequirements;

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
     * 获取实验id
     *
     * @return experimentId - 实验id
     */
    public Integer getExperimentid() {
        return experimentid;
    }

    /**
     * 设置实验id
     *
     * @param experimentid 实验id
     */
    public void setExperimentid(Integer experimentid) {
        this.experimentid = experimentid;
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
     * 获取上课时间
     *
     * @return takeClassDate - 上课时间
     */
    public Date getTakeclassdate() {
        return takeclassdate;
    }

    /**
     * 设置上课时间
     *
     * @param takeclassdate 上课时间
     */
    public void setTakeclassdate(Date takeclassdate) {
        this.takeclassdate = takeclassdate;
    }

    /**
     * 获取实验人数
     *
     * @return personNumber - 实验人数
     */
    public Integer getPersonnumber() {
        return personnumber;
    }

    /**
     * 设置实验人数
     *
     * @param personnumber 实验人数
     */
    public void setPersonnumber(Integer personnumber) {
        this.personnumber = personnumber;
    }

    /**
     * 获取申请状态
     *
     * @return applicationStatus - 申请状态
     */
    public String getApplicationstatus() {
        return applicationstatus;
    }

    /**
     * 设置申请状态
     *
     * @param applicationstatus 申请状态
     */
    public void setApplicationstatus(String applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

    /**
     * 获取特殊要求
     *
     * @return specialRequirements - 特殊要求
     */
    public String getSpecialrequirements() {
        return specialrequirements;
    }

    /**
     * 设置特殊要求
     *
     * @param specialrequirements 特殊要求
     */
    public void setSpecialrequirements(String specialrequirements) {
        this.specialrequirements = specialrequirements;
    }
}