package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_lab_equipment")
public class TLabEquipment {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 实验室id
     */
    @Column(name = "labId")
    private Integer labid;

    /**
     * 工位id
     */
    @Column(name = "workStationId")
    private Integer workstationid;

    /**
     * 设备编号
     */
    @Column(name = "equipmentCode")
    private String equipmentcode;

    /**
     * 设备类别
     */
    @Column(name = "equipmentType")
    private String equipmenttype;

    /**
     * 设备名称
     */
    @Column(name = "equipmentName")
    private String equipmentname;

    /**
     * 购置日期
     */
    @Column(name = "buyDate")
    private Date buydate;

    /**
     * 型号
     */
    private String model;

    /**
     * 领用人uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 责任人uid
     */
    @Column(name = "responsiblerUid")
    private String responsibleruid;

    /**
     * 是否可用
     */
    @Column(name = "isUseable")
    private Integer isuseable;

    /**
     * 是否可被借出(1可，0不可)
     */
    @Column(name = "isBorrow")
    private Integer isborrow;

    /**
     * 备注
     */
    private String memo;

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
     * 获取工位id
     *
     * @return workStationId - 工位id
     */
    public Integer getWorkstationid() {
        return workstationid;
    }

    /**
     * 设置工位id
     *
     * @param workstationid 工位id
     */
    public void setWorkstationid(Integer workstationid) {
        this.workstationid = workstationid;
    }

    /**
     * 获取设备编号
     *
     * @return equipmentCode - 设备编号
     */
    public String getEquipmentcode() {
        return equipmentcode;
    }

    /**
     * 设置设备编号
     *
     * @param equipmentcode 设备编号
     */
    public void setEquipmentcode(String equipmentcode) {
        this.equipmentcode = equipmentcode;
    }

    /**
     * 获取设备类别
     *
     * @return equipmentType - 设备类别
     */
    public String getEquipmenttype() {
        return equipmenttype;
    }

    /**
     * 设置设备类别
     *
     * @param equipmenttype 设备类别
     */
    public void setEquipmenttype(String equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    /**
     * 获取设备名称
     *
     * @return equipmentName - 设备名称
     */
    public String getEquipmentname() {
        return equipmentname;
    }

    /**
     * 设置设备名称
     *
     * @param equipmentname 设备名称
     */
    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    /**
     * 获取购置日期
     *
     * @return buyDate - 购置日期
     */
    public Date getBuydate() {
        return buydate;
    }

    /**
     * 设置购置日期
     *
     * @param buydate 购置日期
     */
    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    /**
     * 获取型号
     *
     * @return model - 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     *
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取领用人uid
     *
     * @return userUid - 领用人uid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置领用人uid
     *
     * @param useruid 领用人uid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取责任人uid
     *
     * @return responsiblerUid - 责任人uid
     */
    public String getResponsibleruid() {
        return responsibleruid;
    }

    /**
     * 设置责任人uid
     *
     * @param responsibleruid 责任人uid
     */
    public void setResponsibleruid(String responsibleruid) {
        this.responsibleruid = responsibleruid;
    }

    /**
     * 获取是否可用
     *
     * @return isUseable - 是否可用
     */
    public Integer getIsuseable() {
        return isuseable;
    }

    /**
     * 设置是否可用
     *
     * @param isuseable 是否可用
     */
    public void setIsuseable(Integer isuseable) {
        this.isuseable = isuseable;
    }

    /**
     * 获取是否可被借出(1可，0不可)
     *
     * @return isBorrow - 是否可被借出(1可，0不可)
     */
    public Integer getIsborrow() {
        return isborrow;
    }

    /**
     * 设置是否可被借出(1可，0不可)
     *
     * @param isborrow 是否可被借出(1可，0不可)
     */
    public void setIsborrow(Integer isborrow) {
        this.isborrow = isborrow;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}