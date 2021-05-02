package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_exercise")
public class TTeacherExercise {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 习题快照
     */
    @Column(name = "excerciseShort")
    private String excerciseshort;

    /**
     * 习题类型id
     */
    @Column(name = "questionTypeId")
    private Integer questiontypeid;

    /**
     * 建议分数
     */
    private Integer score;

    /**
     * 所属实验id
     */
    @Column(name = "experimentId")
    private Integer experimentid;

    /**
     * 所属知识点id
     */
    @Column(name = "knowledgeId")
    private Integer knowledgeid;

    /**
     * 所属课程编码
     */
    @Column(name = "courseCode")
    private String coursecode;

    /**
     * 认知类型
     */
    @Column(name = "knowledgeType")
    private String knowledgetype;

    /**
     * 题目内容
     */
    @Column(name = "exceriseContent")
    private String excerisecontent;

    /**
     * 习题难度
     */
    @Column(name = "isDifficult")
    private Integer isdifficult;

    /**
     * 注释
     */
    private String annntation;

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
     * 获取习题快照
     *
     * @return excerciseShort - 习题快照
     */
    public String getExcerciseshort() {
        return excerciseshort;
    }

    /**
     * 设置习题快照
     *
     * @param excerciseshort 习题快照
     */
    public void setExcerciseshort(String excerciseshort) {
        this.excerciseshort = excerciseshort;
    }

    /**
     * 获取习题类型id
     *
     * @return questionTypeId - 习题类型id
     */
    public Integer getQuestiontypeid() {
        return questiontypeid;
    }

    /**
     * 设置习题类型id
     *
     * @param questiontypeid 习题类型id
     */
    public void setQuestiontypeid(Integer questiontypeid) {
        this.questiontypeid = questiontypeid;
    }

    /**
     * 获取建议分数
     *
     * @return score - 建议分数
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置建议分数
     *
     * @param score 建议分数
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取所属实验id
     *
     * @return experimentId - 所属实验id
     */
    public Integer getExperimentid() {
        return experimentid;
    }

    /**
     * 设置所属实验id
     *
     * @param experimentid 所属实验id
     */
    public void setExperimentid(Integer experimentid) {
        this.experimentid = experimentid;
    }

    /**
     * 获取所属知识点id
     *
     * @return knowledgeId - 所属知识点id
     */
    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    /**
     * 设置所属知识点id
     *
     * @param knowledgeid 所属知识点id
     */
    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    /**
     * 获取所属课程编码
     *
     * @return courseCode - 所属课程编码
     */
    public String getCoursecode() {
        return coursecode;
    }

    /**
     * 设置所属课程编码
     *
     * @param coursecode 所属课程编码
     */
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    /**
     * 获取认知类型
     *
     * @return knowledgeType - 认知类型
     */
    public String getKnowledgetype() {
        return knowledgetype;
    }

    /**
     * 设置认知类型
     *
     * @param knowledgetype 认知类型
     */
    public void setKnowledgetype(String knowledgetype) {
        this.knowledgetype = knowledgetype;
    }

    /**
     * 获取题目内容
     *
     * @return exceriseContent - 题目内容
     */
    public String getExcerisecontent() {
        return excerisecontent;
    }

    /**
     * 设置题目内容
     *
     * @param excerisecontent 题目内容
     */
    public void setExcerisecontent(String excerisecontent) {
        this.excerisecontent = excerisecontent;
    }

    /**
     * 获取习题难度
     *
     * @return isDifficult - 习题难度
     */
    public Integer getIsdifficult() {
        return isdifficult;
    }

    /**
     * 设置习题难度
     *
     * @param isdifficult 习题难度
     */
    public void setIsdifficult(Integer isdifficult) {
        this.isdifficult = isdifficult;
    }

    /**
     * 获取注释
     *
     * @return annntation - 注释
     */
    public String getAnnntation() {
        return annntation;
    }

    /**
     * 设置注释
     *
     * @param annntation 注释
     */
    public void setAnnntation(String annntation) {
        this.annntation = annntation;
    }
}