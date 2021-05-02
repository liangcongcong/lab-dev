package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_teacher_testpaperstrategycount")
public class TTeacherTestpaperstrategycount {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 策略id
     */
    @Column(name = "strategyId")
    private Integer strategyid;

    /**
     * 策略条目id
     */
    @Column(name = "strategyCountId")
    private Integer strategycountid;

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
     * 获取策略id
     *
     * @return strategyId - 策略id
     */
    public Integer getStrategyid() {
        return strategyid;
    }

    /**
     * 设置策略id
     *
     * @param strategyid 策略id
     */
    public void setStrategyid(Integer strategyid) {
        this.strategyid = strategyid;
    }

    /**
     * 获取策略条目id
     *
     * @return strategyCountId - 策略条目id
     */
    public Integer getStrategycountid() {
        return strategycountid;
    }

    /**
     * 设置策略条目id
     *
     * @param strategycountid 策略条目id
     */
    public void setStrategycountid(Integer strategycountid) {
        this.strategycountid = strategycountid;
    }
}