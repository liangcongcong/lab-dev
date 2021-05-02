package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_studentinfoview")
public class TStudentinfoview {
    /**
     * 学号 唯一
     */
    @Column(name = "sNo")
    private String sno;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 学校名称
     */
    @Column(name = "schoolName")
    private String schoolname;

    /**
     * 专业名称
     */
    @Column(name = "specialtyName")
    private String specialtyname;

    /**
     * 学校编号
     */
    @Column(name = "schoolId")
    private Integer schoolid;

    /**
     * 专业id
     */
    @Column(name = "specialId")
    private Integer specialid;

    /**
     * 入学年月
     */
    private String registerdate;

    /**
     * 用户账户 登录唯一
     */
    private String username;

    /**
     * 用户名登录密码
     */
    private String password;

    /**
     * uuid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 微信号
     */
    private String wecharid;

    /**
     * 微信码 唯一
     */
    private String wecharuid;

    /**
     * QQ号 唯一
     */
    private String qqid;

    /**
     * QQuid码
     */
    private String qquid;

    /**
     * 密钥
     */
    private String salt;

    /**
     * 性别
     */
    private String sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态 默认0,-1停用
     */
    private Integer status;

    /**
     * 移动电话 唯一，可登录
     */
    private String mobile;

    /**
     * 出生年月日
     */
    private Date birthday;

    /**
     * 座右铭,个性签名
     */
    private String maxim;

    /**
     * 用户vip等级
     */
    @Column(name = "vipGrade")
    private Integer vipgrade;

    /**
     * 头像图片路径 如果为空，使用系统默认时间，与本地头像更新时间比较，如果有更新，则再下载头像
     */
    private String picture;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 年级
     */
    @Column(name = "njGrade")
    private Integer njgrade;

    /**
     * 获取学号 唯一
     *
     * @return sNo - 学号 唯一
     */
    public String getSno() {
        return sno;
    }

    /**
     * 设置学号 唯一
     *
     * @param sno 学号 唯一
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取学校名称
     *
     * @return schoolName - 学校名称
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * 设置学校名称
     *
     * @param schoolname 学校名称
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    /**
     * 获取专业名称
     *
     * @return specialtyName - 专业名称
     */
    public String getSpecialtyname() {
        return specialtyname;
    }

    /**
     * 设置专业名称
     *
     * @param specialtyname 专业名称
     */
    public void setSpecialtyname(String specialtyname) {
        this.specialtyname = specialtyname;
    }

    /**
     * 获取学校编号
     *
     * @return schoolId - 学校编号
     */
    public Integer getSchoolid() {
        return schoolid;
    }

    /**
     * 设置学校编号
     *
     * @param schoolid 学校编号
     */
    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取专业id
     *
     * @return specialId - 专业id
     */
    public Integer getSpecialid() {
        return specialid;
    }

    /**
     * 设置专业id
     *
     * @param specialid 专业id
     */
    public void setSpecialid(Integer specialid) {
        this.specialid = specialid;
    }

    /**
     * 获取入学年月
     *
     * @return registerdate - 入学年月
     */
    public String getRegisterdate() {
        return registerdate;
    }

    /**
     * 设置入学年月
     *
     * @param registerdate 入学年月
     */
    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    /**
     * 获取用户账户 登录唯一
     *
     * @return username - 用户账户 登录唯一
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户账户 登录唯一
     *
     * @param username 用户账户 登录唯一
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户名登录密码
     *
     * @return password - 用户名登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户名登录密码
     *
     * @param password 用户名登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取uuid
     *
     * @return userUid - uuid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置uuid
     *
     * @param useruid uuid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取微信号
     *
     * @return wecharid - 微信号
     */
    public String getWecharid() {
        return wecharid;
    }

    /**
     * 设置微信号
     *
     * @param wecharid 微信号
     */
    public void setWecharid(String wecharid) {
        this.wecharid = wecharid;
    }

    /**
     * 获取微信码 唯一
     *
     * @return wecharuid - 微信码 唯一
     */
    public String getWecharuid() {
        return wecharuid;
    }

    /**
     * 设置微信码 唯一
     *
     * @param wecharuid 微信码 唯一
     */
    public void setWecharuid(String wecharuid) {
        this.wecharuid = wecharuid;
    }

    /**
     * 获取QQ号 唯一
     *
     * @return qqid - QQ号 唯一
     */
    public String getQqid() {
        return qqid;
    }

    /**
     * 设置QQ号 唯一
     *
     * @param qqid QQ号 唯一
     */
    public void setQqid(String qqid) {
        this.qqid = qqid;
    }

    /**
     * 获取QQuid码
     *
     * @return qquid - QQuid码
     */
    public String getQquid() {
        return qquid;
    }

    /**
     * 设置QQuid码
     *
     * @param qquid QQuid码
     */
    public void setQquid(String qquid) {
        this.qquid = qquid;
    }

    /**
     * 获取密钥
     *
     * @return salt - 密钥
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置密钥
     *
     * @param salt 密钥
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取状态 默认0,-1停用
     *
     * @return status - 状态 默认0,-1停用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 默认0,-1停用
     *
     * @param status 状态 默认0,-1停用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取移动电话 唯一，可登录
     *
     * @return mobile - 移动电话 唯一，可登录
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置移动电话 唯一，可登录
     *
     * @param mobile 移动电话 唯一，可登录
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取出生年月日
     *
     * @return birthday - 出生年月日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生年月日
     *
     * @param birthday 出生年月日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取座右铭,个性签名
     *
     * @return maxim - 座右铭,个性签名
     */
    public String getMaxim() {
        return maxim;
    }

    /**
     * 设置座右铭,个性签名
     *
     * @param maxim 座右铭,个性签名
     */
    public void setMaxim(String maxim) {
        this.maxim = maxim;
    }

    /**
     * 获取用户vip等级
     *
     * @return vipGrade - 用户vip等级
     */
    public Integer getVipgrade() {
        return vipgrade;
    }

    /**
     * 设置用户vip等级
     *
     * @param vipgrade 用户vip等级
     */
    public void setVipgrade(Integer vipgrade) {
        this.vipgrade = vipgrade;
    }

    /**
     * 获取头像图片路径 如果为空，使用系统默认时间，与本地头像更新时间比较，如果有更新，则再下载头像
     *
     * @return picture - 头像图片路径 如果为空，使用系统默认时间，与本地头像更新时间比较，如果有更新，则再下载头像
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置头像图片路径 如果为空，使用系统默认时间，与本地头像更新时间比较，如果有更新，则再下载头像
     *
     * @param picture 头像图片路径 如果为空，使用系统默认时间，与本地头像更新时间比较，如果有更新，则再下载头像
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取年级
     *
     * @return njGrade - 年级
     */
    public Integer getNjgrade() {
        return njgrade;
    }

    /**
     * 设置年级
     *
     * @param njgrade 年级
     */
    public void setNjgrade(Integer njgrade) {
        this.njgrade = njgrade;
    }
}