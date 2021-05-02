package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_strategy")
public class TTeacherStrategy {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 策略名称
     */
    @Column(name = "strategyName")
    private String strategyname;

    /**
     * 所属课程编码
     */
    @Column(name = "courseCode")
    private String coursecode;

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
     * 获取策略名称
     *
     * @return strategyName - 策略名称
     */
    public String getStrategyname() {
        return strategyname;
    }

    /**
     * 设置策略名称
     *
     * @param strategyname 策略名称
     */
    public void setStrategyname(String strategyname) {
        this.strategyname = strategyname;
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
}