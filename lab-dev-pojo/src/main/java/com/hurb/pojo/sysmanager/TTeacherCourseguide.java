package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_teacher_courseguide")
public class TTeacherCourseguide {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 课程导读名称
     */
    @Column(name = "courseGuideName")
    private String courseguidename;

    /**
     * 是否可被引用（0不可，1可）
     */
    @Column(name = "isBeQuoted")
    private Integer isbequoted;

    /**
     * 课程导读内容
     */
    @Column(name = "courseGuideContent")
    private String courseguidecontent;

    /**
     * 原创者uid
     */
    @Column(name = "teacherUid")
    private String teacheruid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

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
     * 获取课程导读名称
     *
     * @return courseGuideName - 课程导读名称
     */
    public String getCourseguidename() {
        return courseguidename;
    }

    /**
     * 设置课程导读名称
     *
     * @param courseguidename 课程导读名称
     */
    public void setCourseguidename(String courseguidename) {
        this.courseguidename = courseguidename;
    }

    /**
     * 获取是否可被引用（0不可，1可）
     *
     * @return isBeQuoted - 是否可被引用（0不可，1可）
     */
    public Integer getIsbequoted() {
        return isbequoted;
    }

    /**
     * 设置是否可被引用（0不可，1可）
     *
     * @param isbequoted 是否可被引用（0不可，1可）
     */
    public void setIsbequoted(Integer isbequoted) {
        this.isbequoted = isbequoted;
    }

    /**
     * 获取课程导读内容
     *
     * @return courseGuideContent - 课程导读内容
     */
    public String getCourseguidecontent() {
        return courseguidecontent;
    }

    /**
     * 设置课程导读内容
     *
     * @param courseguidecontent 课程导读内容
     */
    public void setCourseguidecontent(String courseguidecontent) {
        this.courseguidecontent = courseguidecontent;
    }

    /**
     * 获取原创者uid
     *
     * @return teacherUid - 原创者uid
     */
    public String getTeacheruid() {
        return teacheruid;
    }

    /**
     * 设置原创者uid
     *
     * @param teacheruid 原创者uid
     */
    public void setTeacheruid(String teacheruid) {
        this.teacheruid = teacheruid;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}