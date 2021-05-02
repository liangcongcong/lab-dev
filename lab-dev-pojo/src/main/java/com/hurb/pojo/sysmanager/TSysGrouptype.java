package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_grouptype")
public class TSysGrouptype {
    /**
     * 分组类型id
     */
    @Id
    private Integer id;

    /**
     * 分组类型名称
     */
    private String name;

    /**
     * 排他(1 代表是，0代表否)
     */
    @Column(name = "isExclusive")
    private Integer isexclusive;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取分组类型id
     *
     * @return id - 分组类型id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分组类型id
     *
     * @param id 分组类型id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分组类型名称
     *
     * @return name - 分组类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分组类型名称
     *
     * @param name 分组类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取排他(1 代表是，0代表否)
     *
     * @return isExclusive - 排他(1 代表是，0代表否)
     */
    public Integer getIsexclusive() {
        return isexclusive;
    }

    /**
     * 设置排他(1 代表是，0代表否)
     *
     * @param isexclusive 排他(1 代表是，0代表否)
     */
    public void setIsexclusive(Integer isexclusive) {
        this.isexclusive = isexclusive;
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