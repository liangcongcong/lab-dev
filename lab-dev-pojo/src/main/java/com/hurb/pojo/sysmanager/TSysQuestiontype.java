package com.hurb.pojo.sysmanager;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_questiontype")
public class TSysQuestiontype {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 题型名称(单选、多选、判断、填空、简答、其他)
     */
    private String name;

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
     * 获取题型名称(单选、多选、判断、填空、简答、其他)
     *
     * @return name - 题型名称(单选、多选、判断、填空、简答、其他)
     */
    public String getName() {
        return name;
    }

    /**
     * 设置题型名称(单选、多选、判断、填空、简答、其他)
     *
     * @param name 题型名称(单选、多选、判断、填空、简答、其他)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}