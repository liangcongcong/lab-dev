package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_stu_theroytest")
public class TStuTheroytest {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 试卷id
     */
    @Column(name = "testPaperId")
    private Integer testpaperid;

    /**
     * 学生uid
     */
    @Column(name = "studentUid")
    private String studentuid;

    /**
     * 试卷状态（已完成、未完成等）
     */
    @Column(name = "testPaperStatus")
    private String testpaperstatus;

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
     * 获取试卷id
     *
     * @return testPaperId - 试卷id
     */
    public Integer getTestpaperid() {
        return testpaperid;
    }

    /**
     * 设置试卷id
     *
     * @param testpaperid 试卷id
     */
    public void setTestpaperid(Integer testpaperid) {
        this.testpaperid = testpaperid;
    }

    /**
     * 获取学生uid
     *
     * @return studentUid - 学生uid
     */
    public String getStudentuid() {
        return studentuid;
    }

    /**
     * 设置学生uid
     *
     * @param studentuid 学生uid
     */
    public void setStudentuid(String studentuid) {
        this.studentuid = studentuid;
    }

    /**
     * 获取试卷状态（已完成、未完成等）
     *
     * @return testPaperStatus - 试卷状态（已完成、未完成等）
     */
    public String getTestpaperstatus() {
        return testpaperstatus;
    }

    /**
     * 设置试卷状态（已完成、未完成等）
     *
     * @param testpaperstatus 试卷状态（已完成、未完成等）
     */
    public void setTestpaperstatus(String testpaperstatus) {
        this.testpaperstatus = testpaperstatus;
    }
}