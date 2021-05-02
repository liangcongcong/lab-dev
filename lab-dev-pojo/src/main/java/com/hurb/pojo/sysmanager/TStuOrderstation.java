package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_stu_orderstation")
public class TStuOrderstation {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 老师ID
     */
    @Id
    @Column(name = "teacherID")
    private Long teacherid;

    /**
     * 老师名称
     */
    private String teacher;

    /**
     * 工位地点
     */
    @Column(name = "station_location")
    private String stationLocation;

    /**
     * 开放时间
     */
    @Column(name = "open_time")
    private Date openTime;

    /**
     * url
     */
    private String url;

    /**
     * 资源描述
     */
    private String description;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取老师ID
     *
     * @return teacherID - 老师ID
     */
    public Long getTeacherid() {
        return teacherid;
    }

    /**
     * 设置老师ID
     *
     * @param teacherid 老师ID
     */
    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    /**
     * 获取老师名称
     *
     * @return teacher - 老师名称
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * 设置老师名称
     *
     * @param teacher 老师名称
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 获取工位地点
     *
     * @return station_location - 工位地点
     */
    public String getStationLocation() {
        return stationLocation;
    }

    /**
     * 设置工位地点
     *
     * @param stationLocation 工位地点
     */
    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    /**
     * 获取开放时间
     *
     * @return open_time - 开放时间
     */
    public Date getOpenTime() {
        return openTime;
    }

    /**
     * 设置开放时间
     *
     * @param openTime 开放时间
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取资源描述
     *
     * @return description - 资源描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置资源描述
     *
     * @param description 资源描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}