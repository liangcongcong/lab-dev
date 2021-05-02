package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_experiment")
public class TSysExperiment {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 实验名称
     */
    @Column(name = "experimentName")
    private String experimentname;

    /**
     * 开课id
     */
    @Column(name = "openClassId")
    private Long openclassid;

    /**
     * 实验类型（实物实验、虚拟实验）
     */
    @Column(name = "experimentType")
    private String experimenttype;

    /**
     * 实验内容
     */
    @Column(name = "experimentContent")
    private String experimentcontent;

    /**
     * 实验要求
     */
    @Column(name = "experimentRequire")
    private String experimentrequire;

    /**
     * 实验报告内容
     */
    @Column(name = "experimentReportContent")
    private String experimentreportcontent;

    /**
     * 开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 截止时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 1必做，0选做
     */
    @Column(name = "optionalOrMustDo")
    private Integer optionalormustdo;

    /**
     * 创建者uid
     */
    @Column(name = "teacherUid")
    private String teacheruid;

    /**
     * 共享（1共享，0不共享）
     */
    private Integer shared;

    /**
     * 答案规则
     */
    @Column(name = "answerRule")
    private String answerrule;

    /**
     * 排序
     */
    private Integer order;

    /**
     * 是否收费（1收费、0不收费）
     */
    @Column(name = "isToll")
    private String istoll;

    /**
     * 资源url
     */
    @Column(name = "resourceUrl")
    private String resourceurl;

    /**
     * 实验时长
     */
    @Column(name = "experimentDuration")
    private Integer experimentduration;

    /**
     * 实验成绩比例
     */
    @Column(name = "experimentalSocreRatio")
    private Integer experimentalsocreratio;

    /**
     * 实验报告比例
     */
    @Column(name = "reportScoreRatio")
    private Integer reportscoreratio;

    /**
     * 实验报告批改类型
     */
    @Column(name = "reportReviewType")
    private String reportreviewtype;

    /**
     * 实验地点
     */
    private String location;

    /**
     * 是否提供实验帮助
     */
    @Column(name = "isProvideExperimentalHelp")
    private Integer isprovideexperimentalhelp;

    /**
     * 是否提供智能指导
     */
    @Column(name = "isProvideSmartGuidance")
    private Integer isprovidesmartguidance;

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
     * 获取实验名称
     *
     * @return experimentName - 实验名称
     */
    public String getExperimentname() {
        return experimentname;
    }

    /**
     * 设置实验名称
     *
     * @param experimentname 实验名称
     */
    public void setExperimentname(String experimentname) {
        this.experimentname = experimentname;
    }

    /**
     * 获取开课id
     *
     * @return openClassId - 开课id
     */
    public Long getOpenclassid() {
        return openclassid;
    }

    /**
     * 设置开课id
     *
     * @param openclassid 开课id
     */
    public void setOpenclassid(Long openclassid) {
        this.openclassid = openclassid;
    }

    /**
     * 获取实验类型（实物实验、虚拟实验）
     *
     * @return experimentType - 实验类型（实物实验、虚拟实验）
     */
    public String getExperimenttype() {
        return experimenttype;
    }

    /**
     * 设置实验类型（实物实验、虚拟实验）
     *
     * @param experimenttype 实验类型（实物实验、虚拟实验）
     */
    public void setExperimenttype(String experimenttype) {
        this.experimenttype = experimenttype;
    }

    /**
     * 获取实验内容
     *
     * @return experimentContent - 实验内容
     */
    public String getExperimentcontent() {
        return experimentcontent;
    }

    /**
     * 设置实验内容
     *
     * @param experimentcontent 实验内容
     */
    public void setExperimentcontent(String experimentcontent) {
        this.experimentcontent = experimentcontent;
    }

    /**
     * 获取实验要求
     *
     * @return experimentRequire - 实验要求
     */
    public String getExperimentrequire() {
        return experimentrequire;
    }

    /**
     * 设置实验要求
     *
     * @param experimentrequire 实验要求
     */
    public void setExperimentrequire(String experimentrequire) {
        this.experimentrequire = experimentrequire;
    }

    /**
     * 获取实验报告内容
     *
     * @return experimentReportContent - 实验报告内容
     */
    public String getExperimentreportcontent() {
        return experimentreportcontent;
    }

    /**
     * 设置实验报告内容
     *
     * @param experimentreportcontent 实验报告内容
     */
    public void setExperimentreportcontent(String experimentreportcontent) {
        this.experimentreportcontent = experimentreportcontent;
    }

    /**
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取截止时间
     *
     * @return endTime - 截止时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置截止时间
     *
     * @param endtime 截止时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取1必做，0选做
     *
     * @return optionalOrMustDo - 1必做，0选做
     */
    public Integer getOptionalormustdo() {
        return optionalormustdo;
    }

    /**
     * 设置1必做，0选做
     *
     * @param optionalormustdo 1必做，0选做
     */
    public void setOptionalormustdo(Integer optionalormustdo) {
        this.optionalormustdo = optionalormustdo;
    }

    /**
     * 获取创建者uid
     *
     * @return teacherUid - 创建者uid
     */
    public String getTeacheruid() {
        return teacheruid;
    }

    /**
     * 设置创建者uid
     *
     * @param teacheruid 创建者uid
     */
    public void setTeacheruid(String teacheruid) {
        this.teacheruid = teacheruid;
    }

    /**
     * 获取共享（1共享，0不共享）
     *
     * @return shared - 共享（1共享，0不共享）
     */
    public Integer getShared() {
        return shared;
    }

    /**
     * 设置共享（1共享，0不共享）
     *
     * @param shared 共享（1共享，0不共享）
     */
    public void setShared(Integer shared) {
        this.shared = shared;
    }

    /**
     * 获取答案规则
     *
     * @return answerRule - 答案规则
     */
    public String getAnswerrule() {
        return answerrule;
    }

    /**
     * 设置答案规则
     *
     * @param answerrule 答案规则
     */
    public void setAnswerrule(String answerrule) {
        this.answerrule = answerrule;
    }

    /**
     * 获取排序
     *
     * @return order - 排序
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置排序
     *
     * @param order 排序
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * 获取是否收费（1收费、0不收费）
     *
     * @return isToll - 是否收费（1收费、0不收费）
     */
    public String getIstoll() {
        return istoll;
    }

    /**
     * 设置是否收费（1收费、0不收费）
     *
     * @param istoll 是否收费（1收费、0不收费）
     */
    public void setIstoll(String istoll) {
        this.istoll = istoll;
    }

    /**
     * 获取资源url
     *
     * @return resourceUrl - 资源url
     */
    public String getResourceurl() {
        return resourceurl;
    }

    /**
     * 设置资源url
     *
     * @param resourceurl 资源url
     */
    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl;
    }

    /**
     * 获取实验时长
     *
     * @return experimentDuration - 实验时长
     */
    public Integer getExperimentduration() {
        return experimentduration;
    }

    /**
     * 设置实验时长
     *
     * @param experimentduration 实验时长
     */
    public void setExperimentduration(Integer experimentduration) {
        this.experimentduration = experimentduration;
    }

    /**
     * 获取实验成绩比例
     *
     * @return experimentalSocreRatio - 实验成绩比例
     */
    public Integer getExperimentalsocreratio() {
        return experimentalsocreratio;
    }

    /**
     * 设置实验成绩比例
     *
     * @param experimentalsocreratio 实验成绩比例
     */
    public void setExperimentalsocreratio(Integer experimentalsocreratio) {
        this.experimentalsocreratio = experimentalsocreratio;
    }

    /**
     * 获取实验报告比例
     *
     * @return reportScoreRatio - 实验报告比例
     */
    public Integer getReportscoreratio() {
        return reportscoreratio;
    }

    /**
     * 设置实验报告比例
     *
     * @param reportscoreratio 实验报告比例
     */
    public void setReportscoreratio(Integer reportscoreratio) {
        this.reportscoreratio = reportscoreratio;
    }

    /**
     * 获取实验报告批改类型
     *
     * @return reportReviewType - 实验报告批改类型
     */
    public String getReportreviewtype() {
        return reportreviewtype;
    }

    /**
     * 设置实验报告批改类型
     *
     * @param reportreviewtype 实验报告批改类型
     */
    public void setReportreviewtype(String reportreviewtype) {
        this.reportreviewtype = reportreviewtype;
    }

    /**
     * 获取实验地点
     *
     * @return location - 实验地点
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置实验地点
     *
     * @param location 实验地点
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取是否提供实验帮助
     *
     * @return isProvideExperimentalHelp - 是否提供实验帮助
     */
    public Integer getIsprovideexperimentalhelp() {
        return isprovideexperimentalhelp;
    }

    /**
     * 设置是否提供实验帮助
     *
     * @param isprovideexperimentalhelp 是否提供实验帮助
     */
    public void setIsprovideexperimentalhelp(Integer isprovideexperimentalhelp) {
        this.isprovideexperimentalhelp = isprovideexperimentalhelp;
    }

    /**
     * 获取是否提供智能指导
     *
     * @return isProvideSmartGuidance - 是否提供智能指导
     */
    public Integer getIsprovidesmartguidance() {
        return isprovidesmartguidance;
    }

    /**
     * 设置是否提供智能指导
     *
     * @param isprovidesmartguidance 是否提供智能指导
     */
    public void setIsprovidesmartguidance(Integer isprovidesmartguidance) {
        this.isprovidesmartguidance = isprovidesmartguidance;
    }
}