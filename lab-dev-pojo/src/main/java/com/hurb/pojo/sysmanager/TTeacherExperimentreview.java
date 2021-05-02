package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_experimentreview")
public class TTeacherExperimentreview {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 实验id
     */
    @Column(name = "experimentId")
    private Integer experimentid;

    /**
     * 学生uid
     */
    @Column(name = "stuUid")
    private String stuuid;

    /**
     * 教师uid
     */
    @Column(name = "teacherUid")
    private String teacheruid;

    /**
     * 实验成绩
     */
    @Column(name = "experimentGrade")
    private Integer experimentgrade;

    /**
     * 报告成绩
     */
    @Column(name = "reportGrade")
    private Integer reportgrade;

    /**
     * 总成绩
     */
    @Column(name = "totalGrade")
    private Integer totalgrade;

    /**
     * 批改状态（1完成、0未批改）
     */
    @Column(name = "reviewStatus")
    private Integer reviewstatus;

    /**
     * 评语
     */
    private String comments;

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
     * 获取实验id
     *
     * @return experimentId - 实验id
     */
    public Integer getExperimentid() {
        return experimentid;
    }

    /**
     * 设置实验id
     *
     * @param experimentid 实验id
     */
    public void setExperimentid(Integer experimentid) {
        this.experimentid = experimentid;
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

    /**
     * 获取教师uid
     *
     * @return teacherUid - 教师uid
     */
    public String getTeacheruid() {
        return teacheruid;
    }

    /**
     * 设置教师uid
     *
     * @param teacheruid 教师uid
     */
    public void setTeacheruid(String teacheruid) {
        this.teacheruid = teacheruid;
    }

    /**
     * 获取实验成绩
     *
     * @return experimentGrade - 实验成绩
     */
    public Integer getExperimentgrade() {
        return experimentgrade;
    }

    /**
     * 设置实验成绩
     *
     * @param experimentgrade 实验成绩
     */
    public void setExperimentgrade(Integer experimentgrade) {
        this.experimentgrade = experimentgrade;
    }

    /**
     * 获取报告成绩
     *
     * @return reportGrade - 报告成绩
     */
    public Integer getReportgrade() {
        return reportgrade;
    }

    /**
     * 设置报告成绩
     *
     * @param reportgrade 报告成绩
     */
    public void setReportgrade(Integer reportgrade) {
        this.reportgrade = reportgrade;
    }

    /**
     * 获取总成绩
     *
     * @return totalGrade - 总成绩
     */
    public Integer getTotalgrade() {
        return totalgrade;
    }

    /**
     * 设置总成绩
     *
     * @param totalgrade 总成绩
     */
    public void setTotalgrade(Integer totalgrade) {
        this.totalgrade = totalgrade;
    }

    /**
     * 获取批改状态（1完成、0未批改）
     *
     * @return reviewStatus - 批改状态（1完成、0未批改）
     */
    public Integer getReviewstatus() {
        return reviewstatus;
    }

    /**
     * 设置批改状态（1完成、0未批改）
     *
     * @param reviewstatus 批改状态（1完成、0未批改）
     */
    public void setReviewstatus(Integer reviewstatus) {
        this.reviewstatus = reviewstatus;
    }

    /**
     * 获取评语
     *
     * @return comments - 评语
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置评语
     *
     * @param comments 评语
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}