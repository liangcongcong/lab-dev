package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teach_planclass")
public class TTeachPlanclass {
    /**
     * 唯一编码
     */
    @Id
    private Long id;

    /**
     * 课程编码
     */
    @Column(name = "courseCode")
    private String coursecode;

    /**
     * 老师ID
     */
    @Column(name = "teacherId")
    private Long teacherid;

    /**
     * 开课时间
     */
    @Column(name = "teachTimeId")
    private Long teachtimeid;

    /**
     * 学生类别
     */
    @Column(name = "studentType")
    private String studenttype;

    /**
     * 校区
     */
    @Column(name = "schoolArea")
    private String schoolarea;

    /**
     * 上课地点
     */
    @Column(name = "labId")
    private Integer labid;

    /**
     * 最少选课人数
     */
    @Column(name = "minStuNum")
    private Integer minstunum;

    /**
     * 最少选课人数
     */
    @Column(name = "maxStuNum")
    private Integer maxstunum;

    /**
     * 开课状态
     */
    @Column(name = "classStartStatus")
    private Integer classstartstatus;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Long id) {
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
     * 获取老师ID
     *
     * @return teacherId - 老师ID
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
     * 获取开课时间
     *
     * @return teachTimeId - 开课时间
     */
    public Long getTeachtimeid() {
        return teachtimeid;
    }

    /**
     * 设置开课时间
     *
     * @param teachtimeid 开课时间
     */
    public void setTeachtimeid(Long teachtimeid) {
        this.teachtimeid = teachtimeid;
    }

    /**
     * 获取学生类别
     *
     * @return studentType - 学生类别
     */
    public String getStudenttype() {
        return studenttype;
    }

    /**
     * 设置学生类别
     *
     * @param studenttype 学生类别
     */
    public void setStudenttype(String studenttype) {
        this.studenttype = studenttype;
    }

    /**
     * 获取校区
     *
     * @return schoolArea - 校区
     */
    public String getSchoolarea() {
        return schoolarea;
    }

    /**
     * 设置校区
     *
     * @param schoolarea 校区
     */
    public void setSchoolarea(String schoolarea) {
        this.schoolarea = schoolarea;
    }

    /**
     * 获取上课地点
     *
     * @return labId - 上课地点
     */
    public Integer getLabid() {
        return labid;
    }

    /**
     * 设置上课地点
     *
     * @param labid 上课地点
     */
    public void setLabid(Integer labid) {
        this.labid = labid;
    }

    /**
     * 获取最少选课人数
     *
     * @return minStuNum - 最少选课人数
     */
    public Integer getMinstunum() {
        return minstunum;
    }

    /**
     * 设置最少选课人数
     *
     * @param minstunum 最少选课人数
     */
    public void setMinstunum(Integer minstunum) {
        this.minstunum = minstunum;
    }

    /**
     * 获取最少选课人数
     *
     * @return maxStuNum - 最少选课人数
     */
    public Integer getMaxstunum() {
        return maxstunum;
    }

    /**
     * 设置最少选课人数
     *
     * @param maxstunum 最少选课人数
     */
    public void setMaxstunum(Integer maxstunum) {
        this.maxstunum = maxstunum;
    }

    /**
     * 获取开课状态
     *
     * @return classStartStatus - 开课状态
     */
    public Integer getClassstartstatus() {
        return classstartstatus;
    }

    /**
     * 设置开课状态
     *
     * @param classstartstatus 开课状态
     */
    public void setClassstartstatus(Integer classstartstatus) {
        this.classstartstatus = classstartstatus;
    }
}