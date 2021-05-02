package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_testpapertrueanswer")
public class TSysTestpapertrueanswer {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 试卷id
     */
    @Column(name = "testPaperId")
    private Integer testpaperid;

    /**
     * 试题编号
     */
    @Column(name = "questionId")
    private Integer questionid;

    @Column(name = "trueAnswer")
    private String trueanswer;

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
     * 获取试卷id
     *
     * @return testPaperId - 试卷id
     */
    public Integer getTestpaperid() {
        return testpaperid;
    }

    /**
     * 设置试卷id
     *
     * @param testpaperid 试卷id
     */
    public void setTestpaperid(Integer testpaperid) {
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
     * @return trueAnswer
     */
    public String getTrueanswer() {
        return trueanswer;
    }

    /**
     * @param trueanswer
     */
    public void setTrueanswer(String trueanswer) {
        this.trueanswer = trueanswer;
    }
}