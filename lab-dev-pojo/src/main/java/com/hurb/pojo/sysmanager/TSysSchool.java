package com.hurb.pojo.sysmanager;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_school")
public class TSysSchool {
    /**
     * 唯一编码
     */
    @Id
    private Integer id;

    /**
     * 学校名称
     */
    private String name;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String country;

    /**
     * 地址
     */
    private String address;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学校名称
     *
     * @return name - 学校名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学校名称
     *
     * @param name 学校名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取县
     *
     * @return country - 县
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置县
     *
     * @param country 县
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}