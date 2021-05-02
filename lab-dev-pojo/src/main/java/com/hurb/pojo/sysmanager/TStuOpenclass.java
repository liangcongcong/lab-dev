package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_stu_openclass")
public class TStuOpenclass {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 开课id
     */
    @Column(name = "openclassId")
    private Integer openclassid;

    /**
     * 学生uid
     */
    @Column(name = "stuUid")
    private String stuuid;

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
     * 获取开课id
     *
     * @return openclassId - 开课id
     */
    public Integer getOpenclassid() {
        return openclassid;
    }

    /**
     * 设置开课id
     *
     * @param openclassid 开课id
     */
    public void setOpenclassid(Integer openclassid) {
        this.openclassid = openclassid;
    }

    /**
     * 获取学生uid
     *
     * @return stuUid - 学生uid
     */
    public String getStuuid() {
        return stuuid;
    }

    /**
     * 设置学生uid
     *
     * @param stuuid 学生uid
     */
    public void setStuuid(String stuuid) {
        this.stuuid = stuuid;
    }
}