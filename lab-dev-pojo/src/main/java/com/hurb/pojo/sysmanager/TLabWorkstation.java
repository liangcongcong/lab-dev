package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_lab_workstation")
public class TLabWorkstation {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 工位编号
     */
    @Column(name = "workStationCode")
    private String workstationcode;

    /**
     * 共享人数
     */
    @Column(name = "sharePersonNumber")
    private Integer sharepersonnumber;

    /**
     * 是否可用
     */
    @Column(name = "isUseable")
    private Integer isuseable;

    /**
     * 所属实验室
     */
    @Column(name = "labId")
    private Integer labid;

    /**
     * 备注
     */
    private String memo;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取工位编号
     *
     * @return workStationCode - 工位编号
     */
    public String getWorkstationcode() {
        return workstationcode;
    }

    /**
     * 设置工位编号
     *
     * @param workstationcode 工位编号
     */
    public void setWorkstationcode(String workstationcode) {
        this.workstationcode = workstationcode;
    }

    /**
     * 获取共享人数
     *
     * @return sharePersonNumber - 共享人数
     */
    public Integer getSharepersonnumber() {
        return sharepersonnumber;
    }

    /**
     * 设置共享人数
     *
     * @param sharepersonnumber 共享人数
     */
    public void setSharepersonnumber(Integer sharepersonnumber) {
        this.sharepersonnumber = sharepersonnumber;
    }

    /**
     * 获取是否可用
     *
     * @return isUseable - 是否可用
     */
    public Integer getIsuseable() {
        return isuseable;
    }

    /**
     * 设置是否可用
     *
     * @param isuseable 是否可用
     */
    public void setIsuseable(Integer isuseable) {
        this.isuseable = isuseable;
    }

    /**
     * 获取所属实验室
     *
     * @return labId - 所属实验室
     */
    public Integer getLabid() {
        return labid;
    }

    /**
     * 设置所属实验室
     *
     * @param labid 所属实验室
     */
    public void setLabid(Integer labid) {
        this.labid = labid;
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