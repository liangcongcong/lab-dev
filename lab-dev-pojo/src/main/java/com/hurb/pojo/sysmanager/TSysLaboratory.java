package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_laboratory")
public class TSysLaboratory {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "laboratoryName")
    private String laboratoryname;

    /**
     * 中心管理员uid
     */
    @Column(name = "managerUid")
    private String manageruid;

    /**
     * 中心域名
     */
    @Column(name = "centralDomainName")
    private String centraldomainname;

    /**
     * 路径
     */
    private String path;

    /**
     * 模块名
     */
    @Column(name = "templateName")
    private String templatename;

    /**
     * 样式
     */
    private String style;

    /**
     * 转发
     */
    @Column(name = "isForward")
    private Integer isforward;

    /**
     * 描述
     */
    private String description;

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
     * 获取名称
     *
     * @return laboratoryName - 名称
     */
    public String getLaboratoryname() {
        return laboratoryname;
    }

    /**
     * 设置名称
     *
     * @param laboratoryname 名称
     */
    public void setLaboratoryname(String laboratoryname) {
        this.laboratoryname = laboratoryname;
    }

    /**
     * 获取中心管理员uid
     *
     * @return managerUid - 中心管理员uid
     */
    public String getManageruid() {
        return manageruid;
    }

    /**
     * 设置中心管理员uid
     *
     * @param manageruid 中心管理员uid
     */
    public void setManageruid(String manageruid) {
        this.manageruid = manageruid;
    }

    /**
     * 获取中心域名
     *
     * @return centralDomainName - 中心域名
     */
    public String getCentraldomainname() {
        return centraldomainname;
    }

    /**
     * 设置中心域名
     *
     * @param centraldomainname 中心域名
     */
    public void setCentraldomainname(String centraldomainname) {
        this.centraldomainname = centraldomainname;
    }

    /**
     * 获取路径
     *
     * @return path - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取模块名
     *
     * @return templateName - 模块名
     */
    public String getTemplatename() {
        return templatename;
    }

    /**
     * 设置模块名
     *
     * @param templatename 模块名
     */
    public void setTemplatename(String templatename) {
        this.templatename = templatename;
    }

    /**
     * 获取样式
     *
     * @return style - 样式
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置样式
     *
     * @param style 样式
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * 获取转发
     *
     * @return isForward - 转发
     */
    public Integer getIsforward() {
        return isforward;
    }

    /**
     * 设置转发
     *
     * @param isforward 转发
     */
    public void setIsforward(Integer isforward) {
        this.isforward = isforward;
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