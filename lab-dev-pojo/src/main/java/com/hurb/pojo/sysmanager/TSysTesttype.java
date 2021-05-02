package com.hurb.pojo.sysmanager;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_testtype")
public class TSysTesttype {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 考试方式名称（笔试、大作业、论文、报告）
     */
    private String name;

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
     * 获取考试方式名称（笔试、大作业、论文、报告）
     *
     * @return name - 考试方式名称（笔试、大作业、论文、报告）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置考试方式名称（笔试、大作业、论文、报告）
     *
     * @param name 考试方式名称（笔试、大作业、论文、报告）
     */
    public void setName(String name) {
        this.name = name;
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