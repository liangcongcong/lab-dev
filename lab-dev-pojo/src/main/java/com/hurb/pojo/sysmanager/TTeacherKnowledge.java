package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_knowledge")
public class TTeacherKnowledge {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 知识点名称
     */
    @Column(name = "knowledgeName")
    private String knowledgename;

    /**
     * 父知识点id
     */
    @Column(name = "parentId")
    private Integer parentid;

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
     * 获取知识点名称
     *
     * @return knowledgeName - 知识点名称
     */
    public String getKnowledgename() {
        return knowledgename;
    }

    /**
     * 设置知识点名称
     *
     * @param knowledgename 知识点名称
     */
    public void setKnowledgename(String knowledgename) {
        this.knowledgename = knowledgename;
    }

    /**
     * 获取父知识点id
     *
     * @return parentId - 父知识点id
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父知识点id
     *
     * @param parentid 父知识点id
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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