package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_province")
public class TSysProvince {
    /**
     * 省id
     */
    @Id
    private Integer id;

    /**
     * 省编码
     */
    @Column(name = "provinceCode")
    private String provincecode;

    /**
     * 省名称
     */
    @Column(name = "provinceName")
    private String provincename;

    /**
     * 短名称
     */
    @Column(name = "shortName")
    private String shortname;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度 外键sys_module (id),默认为0，根模块
     */
    private String latitude;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 创建时间
     */
    @Column(name = "gmtCreate")
    private Date gmtcreate;

    /**
     * 修改时间
     */
    @Column(name = "gmtModified")
    private Date gmtmodified;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态
     */
    @Column(name = "dataState")
    private Integer datastate;

    /**
     * 获取省id
     *
     * @return id - 省id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置省id
     *
     * @param id 省id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取省编码
     *
     * @return provinceCode - 省编码
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * 设置省编码
     *
     * @param provincecode 省编码
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * 获取省名称
     *
     * @return provinceName - 省名称
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * 设置省名称
     *
     * @param provincename 省名称
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    /**
     * 获取短名称
     *
     * @return shortName - 短名称
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * 设置短名称
     *
     * @param shortname 短名称
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度 外键sys_module (id),默认为0，根模块
     *
     * @return latitude - 纬度 外键sys_module (id),默认为0，根模块
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度 外键sys_module (id),默认为0，根模块
     *
     * @param latitude 纬度 外键sys_module (id),默认为0，根模块
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取序号
     *
     * @return sort - 序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置序号
     *
     * @param sort 序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取创建时间
     *
     * @return gmtCreate - 创建时间
     */
    public Date getGmtcreate() {
        return gmtcreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtcreate 创建时间
     */
    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmtModified - 修改时间
     */
    public Date getGmtmodified() {
        return gmtmodified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtmodified 修改时间
     */
    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取状态
     *
     * @return dataState - 状态
     */
    public Integer getDatastate() {
        return datastate;
    }

    /**
     * 设置状态
     *
     * @param datastate 状态
     */
    public void setDatastate(Integer datastate) {
        this.datastate = datastate;
    }
}