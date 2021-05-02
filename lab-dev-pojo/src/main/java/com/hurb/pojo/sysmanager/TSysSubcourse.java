package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_subcourse")
public class TSysSubcourse {
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
     * 子课程编码
     */
    @Column(name = "subCourseCode")
    private String subcoursecode;

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
     * 获取子课程编码
     *
     * @return subCourseCode - 子课程编码
     */
    public String getSubcoursecode() {
        return subcoursecode;
    }

    /**
     * 设置子课程编码
     *
     * @param subcoursecode 子课程编码
     */
    public void setSubcoursecode(String subcoursecode) {
        this.subcoursecode = subcoursecode;
    }
}