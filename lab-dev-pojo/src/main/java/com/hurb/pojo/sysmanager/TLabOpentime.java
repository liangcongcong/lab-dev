package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_lab_opentime")
public class TLabOpentime {
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

    @Column(name = "startTime")
    private Date starttime;

    @Column(name = "endTime")
    private Date endtime;

    /**
     * 第几节开始
     */
    @Column(name = "startClass")
    private Integer startclass;

    /**
     * 第几节结束
     */
    @Column(name = "endClass")
    private Integer endclass;

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
     * @return startTime
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return endTime
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取第几节开始
     *
     * @return startClass - 第几节开始
     */
    public Integer getStartclass() {
        return startclass;
    }

    /**
     * 设置第几节开始
     *
     * @param startclass 第几节开始
     */
    public void setStartclass(Integer startclass) {
        this.startclass = startclass;
    }

    /**
     * 获取第几节结束
     *
     * @return endClass - 第几节结束
     */
    public Integer getEndclass() {
        return endclass;
    }

    /**
     * 设置第几节结束
     *
     * @param endclass 第几节结束
     */
    public void setEndclass(Integer endclass) {
        this.endclass = endclass;
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