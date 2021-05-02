package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_area")
public class TSysArea {
    /**
     * 县id 唯一
     */
    @Id
    private Integer id;

    /**
     * 县编码 唯一
     */
    @Column(name = "areaCode")
    private String areacode;

    /**
     * 县名称
     */
    @Column(name = "areaName")
    private String areaname;

    /**
     * 短名称
     */
    @Column(name = "shortName")
    private String shortname;

    /**
     * 市级编码
     */
    @Column(name = "cityCode")
    private String citycode;

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
     * 获取县id 唯一
     *
     * @return id - 县id 唯一
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置县id 唯一
     *
     * @param id 县id 唯一
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取县编码 唯一
     *
     * @return areaCode - 县编码 唯一
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * 设置县编码 唯一
     *
     * @param areacode 县编码 唯一
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    /**
     * 获取县名称
     *
     * @return areaName - 县名称
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * 设置县名称
     *
     * @param areaname 县名称
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
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
     * 获取市级编码
     *
     * @return cityCode - 市级编码
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 设置市级编码
     *
     * @param citycode 市级编码
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
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