package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_advancedcourse")
public class TSysAdvancedcourse {
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
     * 先修课程编码
     */
    @Column(name = "advancedCourseCode")
    private String advancedcoursecode;

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
     * 获取先修课程编码
     *
     * @return advancedCourseCode - 先修课程编码
     */
    public String getAdvancedcoursecode() {
        return advancedcoursecode;
    }

    /**
     * 设置先修课程编码
     *
     * @param advancedcoursecode 先修课程编码
     */
    public void setAdvancedcoursecode(String advancedcoursecode) {
        this.advancedcoursecode = advancedcoursecode;
    }
}