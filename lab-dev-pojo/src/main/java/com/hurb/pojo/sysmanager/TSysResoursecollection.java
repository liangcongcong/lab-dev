package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_resoursecollection")
public class TSysResoursecollection {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 用户uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 资源id
     */
    @Column(name = "resourseId")
    private Integer resourseid;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户uid
     *
     * @return userUid - 用户uid
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
     * 获取资源id
     *
     * @return resourseId - 资源id
     */
    public Integer getResourseid() {
        return resourseid;
    }

    /**
     * 设置资源id
     *
     * @param resourseid 资源id
     */
    public void setResourseid(Integer resourseid) {
        this.resourseid = resourseid;
    }
}