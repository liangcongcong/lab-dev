package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sysstudent")
public class TSysstudent {
    /**
     * uuid
     */
    @Id
    @Column(name = "userUid")
    private String useruid;

    /**
     * 学号 唯一
     */
    @Column(name = "sNo")
    private String sno;

    /**
     * 年级
     */
    private Integer grade;

    /**
     * 学校编号
     */
    @Column(name = "schoolId")
    private Integer schoolid;

    /**
     * 专业id
     */
    @Column(name = "specialId")
    private Integer specialid;

    /**
     * 入学年月
     */
    private String registerdate;

    /**
     * 获取uuid
     *
     * @return userUid - uuid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置uuid
     *
     * @param useruid uuid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取学号 唯一
     *
     * @return sNo - 学号 唯一
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置学号 唯一
     *
     * @param sno 学号 唯一
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * 获取年级
     *
     * @return grade - 年级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 获取学校编号
     *
     * @return schoolId - 学校编号
     */
    public Integer getSchoolid() {
        return schoolid;
    }

    /**
     * 设置学校编号
     *
     * @param schoolid 学校编号
     */
    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取专业id
     *
     * @return specialId - 专业id
     */
    public Integer getSpecialid() {
        return specialid;
    }

    /**
     * 设置专业id
     *
     * @param specialid 专业id
     */
    public void setSpecialid(Integer specialid) {
        this.specialid = specialid;
    }

    /**
     * 获取入学年月
     *
     * @return registerdate - 入学年月
     */
    public String getRegisterdate() {
        return registerdate;
    }

    /**
     * 设置入学年月
     *
     * @param registerdate 入学年月
     */
    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }
}