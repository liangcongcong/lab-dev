package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_lab_checkinorout")
public class TLabCheckinorout {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 学号
     */
    @Column(name = "sNo")
    private String sno;

    /**
     * 签到时间
     */
    @Column(name = "labId")
    private Integer labid;

    /**
     * 签退时间
     */
    @Column(name = "checkInTime")
    private Date checkintime;

    /**
     * 签退时间
     */
    @Column(name = "checkOutTime")
    private Date checkouttime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取学号
     *
     * @return sNo - 学号
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置学号
     *
     * @param sno 学号
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * 获取签到时间
     *
     * @return labId - 签到时间
     */
    public Integer getLabid() {
        return labid;
    }

    /**
     * 设置签到时间
     *
     * @param labid 签到时间
     */
    public void setLabid(Integer labid) {
        this.labid = labid;
    }

    /**
     * 获取签退时间
     *
     * @return checkInTime - 签退时间
     */
    public Date getCheckintime() {
        return checkintime;
    }

    /**
     * 设置签退时间
     *
     * @param checkintime 签退时间
     */
    public void setCheckintime(Date checkintime) {
        this.checkintime = checkintime;
    }

    /**
     * 获取签退时间
     *
     * @return checkOutTime - 签退时间
     */
    public Date getCheckouttime() {
        return checkouttime;
    }

    /**
     * 设置签退时间
     *
     * @param checkouttime 签退时间
     */
    public void setCheckouttime(Date checkouttime) {
        this.checkouttime = checkouttime;
    }
}