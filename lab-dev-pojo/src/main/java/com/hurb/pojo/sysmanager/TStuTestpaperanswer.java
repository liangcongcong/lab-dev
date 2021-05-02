package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_stu_testpaperanswer")
public class TStuTestpaperanswer {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 学生uid
     */
    @Column(name = "stuUid")
    private String stuuid;

    /**
     * 考试试卷ID
     */
    @Column(name = "testPaperId")
    private Long testpaperid;

    /**
     * 试题编号
     */
    @Column(name = "questionId")
    private Integer questionid;

    /**
     * 学生答案
     */
    @Column(name = "stuAnswer")
    private String stuanswer;

    /**
     * 学生题目得分值
     */
    private Integer score;

    /**
     * 教师判分
     */
    private Integer commence;

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
     * 获取考试试卷ID
     *
     * @return testPaperId - 考试试卷ID
     */
    public Long getTestpaperid() {
        return testpaperid;
    }

    /**
     * 设置考试试卷ID
     *
     * @param testpaperid 考试试卷ID
     */
    public void setTestpaperid(Long testpaperid) {
        this.testpaperid = testpaperid;
    }

    /**
     * 获取试题编号
     *
     * @return questionId - 试题编号
     */
    public Integer getQuestionid() {
        return questionid;
    }

    /**
     * 设置试题编号
     *
     * @param questionid 试题编号
     */
    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    /**
     * 获取学生答案
     *
     * @return stuAnswer - 学生答案
     */
    public String getStuanswer() {
        return stuanswer;
    }

    /**
     * 设置学生答案
     *
     * @param stuanswer 学生答案
     */
    public void setStuanswer(String stuanswer) {
        this.stuanswer = stuanswer;
    }

    /**
     * 获取学生题目得分值
     *
     * @return score - 学生题目得分值
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置学生题目得分值
     *
     * @param score 学生题目得分值
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取教师判分
     *
     * @return commence - 教师判分
     */
    public Integer getCommence() {
        return commence;
    }

    /**
     * 设置教师判分
     *
     * @param commence 教师判分
     */
    public void setCommence(Integer commence) {
        this.commence = commence;
    }
}