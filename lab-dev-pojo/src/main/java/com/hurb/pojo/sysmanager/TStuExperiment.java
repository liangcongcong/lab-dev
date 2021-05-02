package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_stu_experiment")
public class TStuExperiment {
    /**
     * 编号
     */
    @Id
    private Long id;

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
     * 实验状态
     */
    @Column(name = "experimentStaus")
    private String experimentstaus;

    /**
     * 实验成绩状态
     */
    @Column(name = "experimentScore")
    private String experimentscore;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
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
     * 获取实验状态
     *
     * @return experimentStaus - 实验状态
     */
    public String getExperimentstaus() {
        return experimentstaus;
    }

    /**
     * 设置实验状态
     *
     * @param experimentstaus 实验状态
     */
    public void setExperimentstaus(String experimentstaus) {
        this.experimentstaus = experimentstaus;
    }

    /**
     * 获取实验成绩状态
     *
     * @return experimentScore - 实验成绩状态
     */
    public String getExperimentscore() {
        return experimentscore;
    }

    /**
     * 设置实验成绩状态
     *
     * @param experimentscore 实验成绩状态
     */
    public void setExperimentscore(String experimentscore) {
        this.experimentscore = experimentscore;
    }
}