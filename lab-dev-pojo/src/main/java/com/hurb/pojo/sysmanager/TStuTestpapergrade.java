package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_stu_testpapergrade")
public class TStuTestpapergrade {
    /**
     * id
     */
    @Id
    private Integer id;

    @Column(name = "testPaperId")
    private Long testpaperid;

    @Column(name = "stuUid")
    private String stuuid;

    private Integer grade;

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
     * @return testPaperId
     */
    public Long getTestpaperid() {
        return testpaperid;
    }

    /**
     * @param testpaperid
     */
    public void setTestpaperid(Long testpaperid) {
        this.testpaperid = testpaperid;
    }

    /**
     * @return stuUid
     */
    public String getStuuid() {
        return stuuid;
    }

    /**
     * @param stuuid
     */
    public void setStuuid(String stuuid) {
        this.stuuid = stuuid;
    }

    /**
     * @return grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}