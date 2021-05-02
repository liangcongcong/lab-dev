package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_equipmentloadapplication")
public class TSysEquipmentloadapplication {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 借出用户uid
     */
    @Column(name = "borrowerUid")
    private String borroweruid;

    /**
     * 审核人uid
     */
    @Column(name = "reviewerUid")
    private String revieweruid;

    /**
     * 操作用户uid
     */
    @Column(name = "operatorUid")
    private String operatoruid;

    /**
     * 实验室id
     */
    @Column(name = "labId")
    private Integer labid;

    /**
     * 设备类型
     */
    @Column(name = "equipmentType")
    private String equipmenttype;

    /**
     * 仪器设备id
     */
    @Column(name = "equipmentId")
    private Integer equipmentid;

    /**
     * 借出时间
     */
    @Column(name = "borrowTime")
    private Date borrowtime;

    /**
     * 归还时间
     */
    @Column(name = "backTime")
    private Date backtime;

    /**
     * 借出状态(审核、领取、归还等)
     */
    @Column(name = "borrowStatus")
    private String borrowstatus;

    /**
     * 借出原因
     */
    @Column(name = "borrowReason")
    private String borrowreason;

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
     * 获取借出用户uid
     *
     * @return borrowerUid - 借出用户uid
     */
    public String getBorroweruid() {
        return borroweruid;
    }

    /**
     * 设置借出用户uid
     *
     * @param borroweruid 借出用户uid
     */
    public void setBorroweruid(String borroweruid) {
        this.borroweruid = borroweruid;
    }

    /**
     * 获取审核人uid
     *
     * @return reviewerUid - 审核人uid
     */
    public String getRevieweruid() {
        return revieweruid;
    }

    /**
     * 设置审核人uid
     *
     * @param revieweruid 审核人uid
     */
    public void setRevieweruid(String revieweruid) {
        this.revieweruid = revieweruid;
    }

    /**
     * 获取操作用户uid
     *
     * @return operatorUid - 操作用户uid
     */
    public String getOperatoruid() {
        return operatoruid;
    }

    /**
     * 设置操作用户uid
     *
     * @param operatoruid 操作用户uid
     */
    public void setOperatoruid(String operatoruid) {
        this.operatoruid = operatoruid;
    }

    /**
     * 获取实验室id
     *
     * @return labId - 实验室id
     */
    public Integer getLabid() {
        return labid;
    }

    /**
     * 设置实验室id
     *
     * @param labid 实验室id
     */
    public void setLabid(Integer labid) {
        this.labid = labid;
    }

    /**
     * 获取设备类型
     *
     * @return equipmentType - 设备类型
     */
    public String getEquipmenttype() {
        return equipmenttype;
    }

    /**
     * 设置设备类型
     *
     * @param equipmenttype 设备类型
     */
    public void setEquipmenttype(String equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    /**
     * 获取仪器设备id
     *
     * @return equipmentId - 仪器设备id
     */
    public Integer getEquipmentid() {
        return equipmentid;
    }

    /**
     * 设置仪器设备id
     *
     * @param equipmentid 仪器设备id
     */
    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    /**
     * 获取借出时间
     *
     * @return borrowTime - 借出时间
     */
    public Date getBorrowtime() {
        return borrowtime;
    }

    /**
     * 设置借出时间
     *
     * @param borrowtime 借出时间
     */
    public void setBorrowtime(Date borrowtime) {
        this.borrowtime = borrowtime;
    }

    /**
     * 获取归还时间
     *
     * @return backTime - 归还时间
     */
    public Date getBacktime() {
        return backtime;
    }

    /**
     * 设置归还时间
     *
     * @param backtime 归还时间
     */
    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    /**
     * 获取借出状态(审核、领取、归还等)
     *
     * @return borrowStatus - 借出状态(审核、领取、归还等)
     */
    public String getBorrowstatus() {
        return borrowstatus;
    }

    /**
     * 设置借出状态(审核、领取、归还等)
     *
     * @param borrowstatus 借出状态(审核、领取、归还等)
     */
    public void setBorrowstatus(String borrowstatus) {
        this.borrowstatus = borrowstatus;
    }

    /**
     * 获取借出原因
     *
     * @return borrowReason - 借出原因
     */
    public String getBorrowreason() {
        return borrowreason;
    }

    /**
     * 设置借出原因
     *
     * @param borrowreason 借出原因
     */
    public void setBorrowreason(String borrowreason) {
        this.borrowreason = borrowreason;
    }
}