package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_role")
public class TSysRole {
    /**
     * 唯一编码
     */
    @Id
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 父角色id
     */
    @Column(name = "parentRoleId")
    private Integer parentroleid;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父角色id
     *
     * @return parentRoleId - 父角色id
     */
    public Integer getParentroleid() {
        return parentroleid;
    }

    /**
     * 设置父角色id
     *
     * @param parentroleid 父角色id
     */
    public void setParentroleid(Integer parentroleid) {
        this.parentroleid = parentroleid;
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