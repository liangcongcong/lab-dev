package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_classtime")
public class TSysClasstime {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 上课节序号
     */
    @Column(name = "classNo")
    private Integer classno;

    /**
     * 上课时间点
     */
    @Column(name = "classTime")
    private Date classtime;

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
     * 获取上课节序号
     *
     * @return classNo - 上课节序号
     */
    public Integer getClassno() {
        return classno;
    }

    /**
     * 设置上课节序号
     *
     * @param classno 上课节序号
     */
    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    /**
     * 获取上课时间点
     *
     * @return classTime - 上课时间点
     */
    public Date getClasstime() {
        return classtime;
    }

    /**
     * 设置上课时间点
     *
     * @param classtime 上课时间点
     */
    public void setClasstime(Date classtime) {
        this.classtime = classtime;
    }
}