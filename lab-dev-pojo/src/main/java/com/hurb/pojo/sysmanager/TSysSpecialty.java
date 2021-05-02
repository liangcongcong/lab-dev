package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_specialty")
public class TSysSpecialty {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 专业名称
     */
    private String name;

    /**
     * 所属部门（学院）
     */
    @Column(name = "departId")
    private Integer departid;

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
     * 获取专业名称
     *
     * @return name - 专业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置专业名称
     *
     * @param name 专业名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属部门（学院）
     *
     * @return departId - 所属部门（学院）
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * 设置所属部门（学院）
     *
     * @param departid 所属部门（学院）
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
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