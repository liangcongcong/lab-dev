package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_semesterconfig")
public class TSysSemesterconfig {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 1上学期、2下学期
     */
    private Integer semester;

    /**
     * 开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 学年
     */
    @Column(name = "studyYear")
    private String studyyear;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取1上学期、2下学期
     *
     * @return semester - 1上学期、2下学期
     */
    public Integer getSemester() {
        return semester;
    }

    /**
     * 设置1上学期、2下学期
     *
     * @param semester 1上学期、2下学期
     */
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    /**
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取学年
     *
     * @return studyYear - 学年
     */
    public String getStudyyear() {
        return studyyear;
    }

    /**
     * 设置学年
     *
     * @param studyyear 学年
     */
    public void setStudyyear(String studyyear) {
        this.studyyear = studyyear;
    }
}