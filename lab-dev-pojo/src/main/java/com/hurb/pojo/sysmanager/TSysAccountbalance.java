package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "t_sys_accountbalance")
public class TSysAccountbalance {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 账户uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 账户名
     */
    @Column(name = "accountName")
    private String accountname;

    /**
     * 剩余金额
     */
    @Column(name = "remainingAmount")
    private Double remainingamount;

    /**
     * 已消费金额
     */
    @Column(name = "currentConsumption")
    private BigDecimal currentconsumption;

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
     * 获取账户uid
     *
     * @return userUid - 账户uid
     */
    public String getUseruid() {
        return useruid;
    }

    /**
     * 设置账户uid
     *
     * @param useruid 账户uid
     */
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    /**
     * 获取账户名
     *
     * @return accountName - 账户名
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * 设置账户名
     *
     * @param accountname 账户名
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * 获取剩余金额
     *
     * @return remainingAmount - 剩余金额
     */
    public Double getRemainingamount() {
        return remainingamount;
    }

    /**
     * 设置剩余金额
     *
     * @param remainingamount 剩余金额
     */
    public void setRemainingamount(Double remainingamount) {
        this.remainingamount = remainingamount;
    }

    /**
     * 获取已消费金额
     *
     * @return currentConsumption - 已消费金额
     */
    public BigDecimal getCurrentconsumption() {
        return currentconsumption;
    }

    /**
     * 设置已消费金额
     *
     * @param currentconsumption 已消费金额
     */
    public void setCurrentconsumption(BigDecimal currentconsumption) {
        this.currentconsumption = currentconsumption;
    }
}