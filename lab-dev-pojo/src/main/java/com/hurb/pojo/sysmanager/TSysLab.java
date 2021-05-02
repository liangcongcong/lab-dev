package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_sys_lab")
public class TSysLab {
    /**
     * id
     */
    private Integer id;

    @Column(name = "labCode")
    private String labcode;

    /**
     * 实验室名称
     */
    @Column(name = "labName")
    private String labname;

    /**
     * 负责人uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 地点
     */
    private String loaction;

    /**
     * 是否开放
     */
    @Column(name = "isOpen")
    private Integer isopen;

    /**
     * 实验室类型
     */
    @Column(name = "labType")
    private String labtype;

    /**
     * 取消预约时限
     */
    @Column(name = "cancelAppointmentTimeLimit")
    private Integer cancelappointmenttimelimit;

    /**
     * 实验室简介
     */
    private String description;

    /**
     * 行数
     */
    private Integer rows;

    /**
     * 列数
     */
    private Integer columns;

    /**
     * 工位数
     */
    private Integer stations;

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
     * @return labCode
     */
    public String getLabcode() {
        return labcode;
    }

    /**
     * @param labcode
     */
    public void setLabcode(String labcode) {
        this.labcode = labcode;
    }

    /**
     * 获取实验室名称
     *
     * @return labName - 实验室名称
     */
    public String getLabname() {
        return labname;
    }

    /**
     * 设置实验室名称
     *
     * @param labname 实验室名称
     */
    public void setLabname(String labname) {
        this.labname = labname;
    }

    /**
     * 获取负责人uid
     *
     * @return userUid - 负责人uid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置负责人uid
     *
     * @param useruid 负责人uid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取地点
     *
     * @return loaction - 地点
     */
    public String getLoaction() {
        return loaction;
    }

    /**
     * 设置地点
     *
     * @param loaction 地点
     */
    public void setLoaction(String loaction) {
        this.loaction = loaction;
    }

    /**
     * 获取是否开放
     *
     * @return isOpen - 是否开放
     */
    public Integer getIsopen() {
        return isopen;
    }

    /**
     * 设置是否开放
     *
     * @param isopen 是否开放
     */
    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    /**
     * 获取实验室类型
     *
     * @return labType - 实验室类型
     */
    public String getLabtype() {
        return labtype;
    }

    /**
     * 设置实验室类型
     *
     * @param labtype 实验室类型
     */
    public void setLabtype(String labtype) {
        this.labtype = labtype;
    }

    /**
     * 获取取消预约时限
     *
     * @return cancelAppointmentTimeLimit - 取消预约时限
     */
    public Integer getCancelappointmenttimelimit() {
        return cancelappointmenttimelimit;
    }

    /**
     * 设置取消预约时限
     *
     * @param cancelappointmenttimelimit 取消预约时限
     */
    public void setCancelappointmenttimelimit(Integer cancelappointmenttimelimit) {
        this.cancelappointmenttimelimit = cancelappointmenttimelimit;
    }

    /**
     * 获取实验室简介
     *
     * @return description - 实验室简介
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置实验室简介
     *
     * @param description 实验室简介
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取行数
     *
     * @return rows - 行数
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * 设置行数
     *
     * @param rows 行数
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 获取列数
     *
     * @return columns - 列数
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * 设置列数
     *
     * @param columns 列数
     */
    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    /**
     * 获取工位数
     *
     * @return stations - 工位数
     */
    public Integer getStations() {
        return stations;
    }

    /**
     * 设置工位数
     *
     * @param stations 工位数
     */
    public void setStations(Integer stations) {
        this.stations = stations;
    }
}