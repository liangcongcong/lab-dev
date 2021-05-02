package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_group")
public class TSysGroup {
    /**
     * 唯一编码 主键
     */
    @Id
    private Integer id;

    /**
     * 分组名称 
     */
    private String name;

    /**
     * 分组类型id
     */
    @Column(name = "groupTypeId")
    private Integer grouptypeid;

    /**
     * 父级分组
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取唯一编码 主键
     *
     * @return id - 唯一编码 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一编码 主键
     *
     * @param id 唯一编码 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分组名称 
     *
     * @return name - 分组名称 
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分组名称 
     *
     * @param name 分组名称 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分组类型id
     *
     * @return groupTypeId - 分组类型id
     */
    public Integer getGrouptypeid() {
        return grouptypeid;
    }

    /**
     * 设置分组类型id
     *
     * @param grouptypeid 分组类型id
     */
    public void setGrouptypeid(Integer grouptypeid) {
        this.grouptypeid = grouptypeid;
    }

    /**
     * 获取父级分组
     *
     * @return parentId - 父级分组
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父级分组
     *
     * @param parentid 父级分组
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