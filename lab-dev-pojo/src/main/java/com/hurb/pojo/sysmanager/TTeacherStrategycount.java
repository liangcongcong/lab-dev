package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_strategycount")
public class TTeacherStrategycount {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 知识点id
     */
    @Column(name = "knowledgeId")
    private Integer knowledgeid;

    /**
     * 习题难度
     */
    @Column(name = "exerciseDifficulty")
    private Integer exercisedifficulty;

    /**
     * 习题类型
     */
    @Column(name = "exerciseType")
    private String exercisetype;

    /**
     * 参考题数
     */
    @Column(name = "referenceQuestionCount")
    private Integer referencequestioncount;

    /**
     * 抽题数量
     */
    private Integer count;

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
     * 获取知识点id
     *
     * @return knowledgeId - 知识点id
     */
    public Integer getKnowledgeid() {
        return knowledgeid;
    }

    /**
     * 设置知识点id
     *
     * @param knowledgeid 知识点id
     */
    public void setKnowledgeid(Integer knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    /**
     * 获取习题难度
     *
     * @return exerciseDifficulty - 习题难度
     */
    public Integer getExercisedifficulty() {
        return exercisedifficulty;
    }

    /**
     * 设置习题难度
     *
     * @param exercisedifficulty 习题难度
     */
    public void setExercisedifficulty(Integer exercisedifficulty) {
        this.exercisedifficulty = exercisedifficulty;
    }

    /**
     * 获取习题类型
     *
     * @return exerciseType - 习题类型
     */
    public String getExercisetype() {
        return exercisetype;
    }

    /**
     * 设置习题类型
     *
     * @param exercisetype 习题类型
     */
    public void setExercisetype(String exercisetype) {
        this.exercisetype = exercisetype;
    }

    /**
     * 获取参考题数
     *
     * @return referenceQuestionCount - 参考题数
     */
    public Integer getReferencequestioncount() {
        return referencequestioncount;
    }

    /**
     * 设置参考题数
     *
     * @param referencequestioncount 参考题数
     */
    public void setReferencequestioncount(Integer referencequestioncount) {
        this.referencequestioncount = referencequestioncount;
    }

    /**
     * 获取抽题数量
     *
     * @return count - 抽题数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置抽题数量
     *
     * @param count 抽题数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}