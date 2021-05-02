package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_systeacher")
public class TSysteacher {
    /**
     * 对应useuid 主键、外键
     */
    @Id
    @Column(name = "userUid")
    private String useruid;

    /**
     * 工号编码
     */
    @Column(name = "tNo")
    private String tno;

    /**
     * 职称
     */
    private String position;

    /**
     * 学历
     */
    private String education;

    /**
     * 毕业院校
     */
    @Column(name = "graduateSchoolId")
    private Long graduateschoolid;

    /**
     * 主授课代码
     */
    @Column(name = "mainCourseCode")
    private String maincoursecode;

    /**
     * 所属学校id
     */
    @Column(name = "schoolId")
    private Long schoolid;

    /**
     * 临时教师否 临时教师否，0为临时，1为正式
     */
    private Integer flag;

    /**
     * 荣誉
     */
    private String honor;

    /**
     * 备注 简介
     */
    private String memo;

    /**
     * 获取对应useuid 主键、外键
     *
     * @return userUid - 对应useuid 主键、外键
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置对应useuid 主键、外键
     *
     * @param useruid 对应useuid 主键、外键
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取工号编码
     *
     * @return tNo - 工号编码
     */
    public String getTno() {
        return tno;
    }

    /**
     * 设置工号编码
     *
     * @param tno 工号编码
     */
    public void setTno(String tno) {
        this.tno = tno;
    }

    /**
     * 获取职称
     *
     * @return position - 职称
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职称
     *
     * @param position 职称
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取学历
     *
     * @return education - 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置学历
     *
     * @param education 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取毕业院校
     *
     * @return graduateSchoolId - 毕业院校
     */
    public Long getGraduateschoolid() {
        return graduateschoolid;
    }

    /**
     * 设置毕业院校
     *
     * @param graduateschoolid 毕业院校
     */
    public void setGraduateschoolid(Long graduateschoolid) {
        this.graduateschoolid = graduateschoolid;
    }

    /**
     * 获取主授课代码
     *
     * @return mainCourseCode - 主授课代码
     */
    public String getMaincoursecode() {
        return maincoursecode;
    }

    /**
     * 设置主授课代码
     *
     * @param maincoursecode 主授课代码
     */
    public void setMaincoursecode(String maincoursecode) {
        this.maincoursecode = maincoursecode;
    }

    /**
     * 获取所属学校id
     *
     * @return schoolId - 所属学校id
     */
    public Long getSchoolid() {
        return schoolid;
    }

    /**
     * 设置所属学校id
     *
     * @param schoolid 所属学校id
     */
    public void setSchoolid(Long schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取临时教师否 临时教师否，0为临时，1为正式
     *
     * @return flag - 临时教师否 临时教师否，0为临时，1为正式
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置临时教师否 临时教师否，0为临时，1为正式
     *
     * @param flag 临时教师否 临时教师否，0为临时，1为正式
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取荣誉
     *
     * @return honor - 荣誉
     */
    public String getHonor() {
        return honor;
    }

    /**
     * 设置荣誉
     *
     * @param honor 荣誉
     */
    public void setHonor(String honor) {
        this.honor = honor;
    }

    /**
     * 获取备注 简介
     *
     * @return memo - 备注 简介
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注 简介
     *
     * @param memo 备注 简介
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}