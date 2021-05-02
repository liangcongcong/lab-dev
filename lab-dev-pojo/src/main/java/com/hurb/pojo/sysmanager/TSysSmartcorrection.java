package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_smartcorrection")
public class TSysSmartcorrection {
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
     * 题目序号
     */
    @Column(name = "questionId")
    private Integer questionid;

    /**
     * 得分点
     */
    @Column(name = "getScorePoint")
    private String getscorepoint;

    /**
     * 得分
     */
    private Integer score;

    /**
     * 状态（0错误，1正确）
     */
    private Integer status;

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
     * 获取题目序号
     *
     * @return questionId - 题目序号
     */
    public Integer getQuestionid() {
        return questionid;
    }

    /**
     * 设置题目序号
     *
     * @param questionid 题目序号
     */
    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    /**
     * 获取得分点
     *
     * @return getScorePoint - 得分点
     */
    public String getGetscorepoint() {
        return getscorepoint;
    }

    /**
     * 设置得分点
     *
     * @param getscorepoint 得分点
     */
    public void setGetscorepoint(String getscorepoint) {
        this.getscorepoint = getscorepoint;
    }

    /**
     * 获取得分
     *
     * @return score - 得分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置得分
     *
     * @param score 得分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取状态（0错误，1正确）
     *
     * @return status - 状态（0错误，1正确）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0错误，1正确）
     *
     * @param status 状态（0错误，1正确）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}