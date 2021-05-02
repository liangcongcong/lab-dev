package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_experimentattendance")
public class TTeacherExperimentattendance {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 实验id
     */
    @Column(name = "experimentId")
    private Integer experimentid;

    /**
     * 学生uid
     */
    @Column(name = "stuUid")
    private Integer stuuid;

    /**
     * 考勤状态
     */
    @Column(name = "attendanceStatus")
    private String attendancestatus;

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
     * 获取实验id
     *
     * @return experimentId - 实验id
     */
    public Integer getExperimentid() {
        return experimentid;
    }

    /**
     * 设置实验id
     *
     * @param experimentid 实验id
     */
    public void setExperimentid(Integer experimentid) {
        this.experimentid = experimentid;
    }

    /**
     * 获取学生uid
     *
     * @return stuUid - 学生uid
     */
    public Integer getStuuid() {
        return stuuid;
    }

    /**
     * 设置学生uid
     *
     * @param stuuid 学生uid
     */
    public void setStuuid(Integer stuuid) {
        this.stuuid = stuuid;
    }

    /**
     * 获取考勤状态
     *
     * @return attendanceStatus - 考勤状态
     */
    public String getAttendancestatus() {
        return attendancestatus;
    }

    /**
     * 设置考勤状态
     *
     * @param attendancestatus 考勤状态
     */
    public void setAttendancestatus(String attendancestatus) {
        this.attendancestatus = attendancestatus;
    }
}