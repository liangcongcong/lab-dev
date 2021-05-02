package com.hurb.pojo.sysmanager;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_course")
public class TSysCourse {
    @Id
    private Long id;

    private String courseid;

    private String name;

    private Long subjectid;

    private Integer gradeid;

    private Integer term;

    private String memo;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return courseid
     */
    public String getCourseid() {
        return courseid;
    }

    /**
     * @param courseid
     */
    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return subjectid
     */
    public Long getSubjectid() {
        return subjectid;
    }

    /**
     * @param subjectid
     */
    public void setSubjectid(Long subjectid) {
        this.subjectid = subjectid;
    }

    /**
     * @return gradeid
     */
    public Integer getGradeid() {
        return gradeid;
    }

    /**
     * @param gradeid
     */
    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    /**
     * @return term
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * @param term
     */
    public void setTerm(Integer term) {
        this.term = term;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}