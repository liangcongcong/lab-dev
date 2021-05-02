package com.hurb.pojo.sysmanager;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sysuser")
public class TSysuser {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * uid 编码唯一
     */
    private String uid;

    /**
     * 用户账户 登录唯一
     */
    private String username;

    /**
     * 用户名登录密码
     */
    private String password;

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
     * 真实姓名
     */
    private String realname;

    /**
     * 性别
     */
    private String sex;

    /**
     * 密钥
     */
    private String salt;

    /**
     * 状态 默认0,-1停用
     */
    private Integer status;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 移动电话 唯一，可登录
     */
    private String mobile;

    /**
     * 昵称
     */
    private String nickname;

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
    private Integer grade;

    /**
     * 头像图片路径 如果为空，使用系统默认时间，与本地头像更新时间比较，如果有更新，则再下载头像
     */
    private String picture;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取uid 编码唯一
     *
     * @return uid - uid 编码唯一
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置uid 编码唯一
     *
     * @param uid uid 编码唯一
     */
    public void setUid(String uid) {
        this.uid = uid;
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
     * @return grade - 用户vip等级
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置用户vip等级
     *
     * @param grade 用户vip等级
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
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
}