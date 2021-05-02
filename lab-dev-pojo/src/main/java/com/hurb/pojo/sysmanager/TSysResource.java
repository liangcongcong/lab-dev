package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_resource")
public class TSysResource {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 资源名称
     */
    @Column(name = "resourceName")
    private String resourcename;

    /**
     * 上传者uid
     */
    @Column(name = "uploaderUid")
    private String uploaderuid;

    /**
     * 审核人uid
     */
    @Column(name = "reviewerUid")
    private String revieweruid;

    /**
     * 审核状态
     */
    @Column(name = "reviewerStatus")
    private String reviewerstatus;

    /**
     * 上传日期
     */
    @Column(name = "uploadDate")
    private Date uploaddate;

    /**
     * 资源类型
     */
    @Column(name = "resourceType")
    private String resourcetype;

    /**
     * 所属课程id
     */
    @Column(name = "courseCode")
    private String coursecode;

    /**
     * url
     */
    private String url;

    @Column(name = "downloadTimes")
    private Integer downloadtimes;

    @Column(name = "clicksTimes")
    private Integer clickstimes;

    private Integer score;

    @Column(name = "usageRights")
    private String usagerights;

    /**
     * 资源描述
     */
    private String description;

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
     * 获取资源名称
     *
     * @return resourceName - 资源名称
     */
    public String getResourcename() {
        return resourcename;
    }

    /**
     * 设置资源名称
     *
     * @param resourcename 资源名称
     */
    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    /**
     * 获取上传者uid
     *
     * @return uploaderUid - 上传者uid
     */
    public String getUploaderuid() {
        return uploaderuid;
    }

    /**
     * 设置上传者uid
     *
     * @param uploaderuid 上传者uid
     */
    public void setUploaderuid(String uploaderuid) {
        this.uploaderuid = uploaderuid;
    }

    /**
     * 获取审核人uid
     *
     * @return reviewerUid - 审核人uid
     */
    public String getRevieweruid() {
        return revieweruid;
    }

    /**
     * 设置审核人uid
     *
     * @param revieweruid 审核人uid
     */
    public void setRevieweruid(String revieweruid) {
        this.revieweruid = revieweruid;
    }

    /**
     * 获取审核状态
     *
     * @return reviewerStatus - 审核状态
     */
    public String getReviewerstatus() {
        return reviewerstatus;
    }

    /**
     * 设置审核状态
     *
     * @param reviewerstatus 审核状态
     */
    public void setReviewerstatus(String reviewerstatus) {
        this.reviewerstatus = reviewerstatus;
    }

    /**
     * 获取上传日期
     *
     * @return uploadDate - 上传日期
     */
    public Date getUploaddate() {
        return uploaddate;
    }

    /**
     * 设置上传日期
     *
     * @param uploaddate 上传日期
     */
    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    /**
     * 获取资源类型
     *
     * @return resourceType - 资源类型
     */
    public String getResourcetype() {
        return resourcetype;
    }

    /**
     * 设置资源类型
     *
     * @param resourcetype 资源类型
     */
    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype;
    }

    /**
     * 获取所属课程id
     *
     * @return courseCode - 所属课程id
     */
    public String getCoursecode() {
        return coursecode;
    }

    /**
     * 设置所属课程id
     *
     * @param coursecode 所属课程id
     */
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    /**
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return downloadTimes
     */
    public Integer getDownloadtimes() {
        return downloadtimes;
    }

    /**
     * @param downloadtimes
     */
    public void setDownloadtimes(Integer downloadtimes) {
        this.downloadtimes = downloadtimes;
    }

    /**
     * @return clicksTimes
     */
    public Integer getClickstimes() {
        return clickstimes;
    }

    /**
     * @param clickstimes
     */
    public void setClickstimes(Integer clickstimes) {
        this.clickstimes = clickstimes;
    }

    /**
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return usageRights
     */
    public String getUsagerights() {
        return usagerights;
    }

    /**
     * @param usagerights
     */
    public void setUsagerights(String usagerights) {
        this.usagerights = usagerights;
    }

    /**
     * 获取资源描述
     *
     * @return description - 资源描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置资源描述
     *
     * @param description 资源描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}