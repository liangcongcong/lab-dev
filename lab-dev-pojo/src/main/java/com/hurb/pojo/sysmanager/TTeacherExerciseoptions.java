package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_exerciseoptions")
public class TTeacherExerciseoptions {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 习题id
     */
    @Column(name = "exceriseId")
    private Integer exceriseid;

    /**
     * 选项名称
     */
    @Column(name = "optionName")
    private String optionname;

    /**
     * 选项内容
     */
    @Column(name = "optionContent")
    private String optioncontent;

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
     * 获取习题id
     *
     * @return exceriseId - 习题id
     */
    public Integer getExceriseid() {
        return exceriseid;
    }

    /**
     * 设置习题id
     *
     * @param exceriseid 习题id
     */
    public void setExceriseid(Integer exceriseid) {
        this.exceriseid = exceriseid;
    }

    /**
     * 获取选项名称
     *
     * @return optionName - 选项名称
     */
    public String getOptionname() {
        return optionname;
    }

    /**
     * 设置选项名称
     *
     * @param optionname 选项名称
     */
    public void setOptionname(String optionname) {
        this.optionname = optionname;
    }

    /**
     * 获取选项内容
     *
     * @return optionContent - 选项内容
     */
    public String getOptioncontent() {
        return optioncontent;
    }

    /**
     * 设置选项内容
     *
     * @param optioncontent 选项内容
     */
    public void setOptioncontent(String optioncontent) {
        this.optioncontent = optioncontent;
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