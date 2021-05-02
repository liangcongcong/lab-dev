package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_accountturnover")
public class TSysAccountturnover {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 用户uid
     */
    @Column(name = "userUid")
    private String useruid;

    /**
     * 账户名
     */
    @Column(name = "accountName")
    private String accountname;

    /**
     * 交易时间
     */
    @Column(name = "transactionTime")
    private Date transactiontime;

    /**
     * 交易类型
     */
    @Column(name = "transactionType")
    private String transactiontype;

    /**
     * 交易金额
     */
    @Column(name = "transactionAmount")
    private Double transactionamount;

    /**
     * 交易状态
     */
    @Column(name = "transactionStatus")
    private String transactionstatus;

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
     * 获取交易时间
     *
     * @return transactionTime - 交易时间
     */
    public Date getTransactiontime() {
        return transactiontime;
    }

    /**
     * 设置交易时间
     *
     * @param transactiontime 交易时间
     */
    public void setTransactiontime(Date transactiontime) {
        this.transactiontime = transactiontime;
    }

    /**
     * 获取交易类型
     *
     * @return transactionType - 交易类型
     */
    public String getTransactiontype() {
        return transactiontype;
    }

    /**
     * 设置交易类型
     *
     * @param transactiontype 交易类型
     */
    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    /**
     * 获取交易金额
     *
     * @return transactionAmount - 交易金额
     */
    public Double getTransactionamount() {
        return transactionamount;
    }

    /**
     * 设置交易金额
     *
     * @param transactionamount 交易金额
     */
    public void setTransactionamount(Double transactionamount) {
        this.transactionamount = transactionamount;
    }

    /**
     * 获取交易状态
     *
     * @return transactionStatus - 交易状态
     */
    public String getTransactionstatus() {
        return transactionstatus;
    }

    /**
     * 设置交易状态
     *
     * @param transactionstatus 交易状态
     */
    public void setTransactionstatus(String transactionstatus) {
        this.transactionstatus = transactionstatus;
    }
}