package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teach_time")
public class TTeachTime {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 课程编码
     */
    @Column(name = "courseCode")
    private String coursecode;

    /**
     * 学期id
     */
    @Column(name = "semesterId")
    private Integer semesterid;

    /**
     * 周次
     */
    @Column(name = "weekNumber")
    private Integer weeknumber;

    /**
     * 单双周状态（0不分单双、1单周、2双周）
     */
    @Column(name = "weekStatus")
    private Integer weekstatus;

    /**
     * 上课时间id
     */
    @Column(name = "classTimeId")
    private Integer classtimeid;

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
     * 获取课程编码
     *
     * @return courseCode - 课程编码
     */
    public String getCoursecode() {
        return coursecode;
    }

    /**
     * 设置课程编码
     *
     * @param coursecode 课程编码
     */
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    /**
     * 获取学期id
     *
     * @return semesterId - 学期id
     */
    public Integer getSemesterid() {
        return semesterid;
    }

    /**
     * 设置学期id
     *
     * @param semesterid 学期id
     */
    public void setSemesterid(Integer semesterid) {
        this.semesterid = semesterid;
    }

    /**
     * 获取周次
     *
     * @return weekNumber - 周次
     */
    public Integer getWeeknumber() {
        return weeknumber;
    }

    /**
     * 设置周次
     *
     * @param weeknumber 周次
     */
    public void setWeeknumber(Integer weeknumber) {
        this.weeknumber = weeknumber;
    }

    /**
     * 获取单双周状态（0不分单双、1单周、2双周）
     *
     * @return weekStatus - 单双周状态（0不分单双、1单周、2双周）
     */
    public Integer getWeekstatus() {
        return weekstatus;
    }

    /**
     * 设置单双周状态（0不分单双、1单周、2双周）
     *
     * @param weekstatus 单双周状态（0不分单双、1单周、2双周）
     */
    public void setWeekstatus(Integer weekstatus) {
        this.weekstatus = weekstatus;
    }

    /**
     * 获取上课时间id
     *
     * @return classTimeId - 上课时间id
     */
    public Integer getClasstimeid() {
        return classtimeid;
    }

    /**
     * 设置上课时间id
     *
     * @param classtimeid 上课时间id
     */
    public void setClasstimeid(Integer classtimeid) {
        this.classtimeid = classtimeid;
    }
}