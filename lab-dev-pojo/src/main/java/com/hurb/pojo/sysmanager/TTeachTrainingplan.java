package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_teach_trainingplan")
public class TTeachTrainingplan {
    /**
     * 设备ID
     */
    @Id
    private Long id;

    /**
     * 专业id
     */
    @Id
    @Column(name = "specialId")
    private Long specialid;

    /**
     * 培养方案名称
     */
    private String name;

    /**
     * 版本
     */
    private String version;

    /**
     * 学分
     */
    private Integer credit;

    /**
     * 生效时间
     */
    @Column(name = "effectiveDatetime")
    private Date effectivedatetime;

    /**
     * 课程编码
     */
    @Column(name = "courseCode")
    private String coursecode;

    /**
     * 获取设备ID
     *
     * @return id - 设备ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置设备ID
     *
     * @param id 设备ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取专业id
     *
     * @return specialId - 专业id
     */
    public Long getSpecialid() {
        return specialid;
    }

    /**
     * 设置专业id
     *
     * @param specialid 专业id
     */
    public void setSpecialid(Long specialid) {
        this.specialid = specialid;
    }

    /**
     * 获取培养方案名称
     *
     * @return name - 培养方案名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置培养方案名称
     *
     * @param name 培养方案名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取学分
     *
     * @return credit - 学分
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * 设置学分
     *
     * @param credit 学分
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * 获取生效时间
     *
     * @return effectiveDatetime - 生效时间
     */
    public Date getEffectivedatetime() {
        return effectivedatetime;
    }

    /**
     * 设置生效时间
     *
     * @param effectivedatetime 生效时间
     */
    public void setEffectivedatetime(Date effectivedatetime) {
        this.effectivedatetime = effectivedatetime;
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
}