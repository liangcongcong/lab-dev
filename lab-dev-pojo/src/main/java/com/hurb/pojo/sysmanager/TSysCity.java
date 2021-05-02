package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_city")
public class TSysCity {
    /**
     * 市编号
     */
    @Id
    private Integer id;

    /**
     * 市编号
     */
    @Column(name = "cityCode")
    private String citycode;

    /**
     * 市名称
     */
    @Column(name = "cityName")
    private String cityname;

    /**
     * 短名称
     */
    @Column(name = "shortName")
    private String shortname;

    /**
     * 省级编码
     */
    @Column(name = "provinceCode")
    private String provincecode;

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
     * 获取市编号
     *
     * @return id - 市编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置市编号
     *
     * @param id 市编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取市编号
     *
     * @return cityCode - 市编号
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 设置市编号
     *
     * @param citycode 市编号
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * 获取市名称
     *
     * @return cityName - 市名称
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 设置市名称
     *
     * @param cityname 市名称
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
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
     * 获取省级编码
     *
     * @return provinceCode - 省级编码
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * 设置省级编码
     *
     * @param provincecode 省级编码
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
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