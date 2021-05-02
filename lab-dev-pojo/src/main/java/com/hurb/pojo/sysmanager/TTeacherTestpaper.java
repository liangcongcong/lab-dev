package com.hurb.pojo.sysmanager;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_teacher_testpaper")
public class TTeacherTestpaper {
    /**
     * ID
     */
    @Id
    private Integer id;

    /**
     * 试卷名称
     */
    private String name;

    /**
     * 课程编号
     */
    private Integer courseid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 用户uid
     */
    private String useruid;

    /**
     * 备注
     */
    private String memo;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取试卷名称
     *
     * @return name - 试卷名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置试卷名称
     *
     * @param name 试卷名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取课程编号
     *
     * @return courseid - 课程编号
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * 设置课程编号
     *
     * @param courseid 课程编号
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取用户uid
     *
     * @return useruid - 用户uid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置用户uid
     *
     * @param useruid 用户uid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}