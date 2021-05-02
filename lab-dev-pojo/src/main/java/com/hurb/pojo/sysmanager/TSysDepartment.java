package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_department")
public class TSysDepartment {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 所属学校id
     */
    @Column(name = "schoolId")
    private Integer schoolid;

    /**
     * 父部门id（默认0为学院）
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属学校id
     *
     * @return schoolId - 所属学校id
     */
    public Integer getSchoolid() {
        return schoolid;
    }

    /**
     * 设置所属学校id
     *
     * @param schoolid 所属学校id
     */
    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取父部门id（默认0为学院）
     *
     * @return parentId - 父部门id（默认0为学院）
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父部门id（默认0为学院）
     *
     * @param parentid 父部门id（默认0为学院）
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}