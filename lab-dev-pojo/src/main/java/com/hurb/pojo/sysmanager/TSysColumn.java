package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "t_sys_column")
public class TSysColumn {
    /**
     * id
     */
    private Integer id;

    /**
     * 栏目名
     */
    @Column(name = "columnName")
    private String columnname;

    /**
     * 父栏目
     */
    @Column(name = "parentColumnId")
    private Integer parentcolumnid;

    /**
     * 链接标题
     */
    @Column(name = "linkTitle")
    private String linktitle;

    /**
     * 文章类型
     */
    @Column(name = "articleType")
    private String articletype;

    /**
     * 栏目类型
     */
    @Column(name = "columnType")
    private String columntype;

    /**
     * 站点id
     */
    @Column(name = "laboratoryId")
    private Integer laboratoryid;

    /**
     * 审核人uid
     */
    @Column(name = "reviewerUid")
    private String revieweruid;

    /**
     * 显示区域
     */
    @Column(name = "showArea")
    private String showarea;

    /**
     * 关键字
     */
    private String keyword;

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
     * 获取栏目名
     *
     * @return columnName - 栏目名
     */
    public String getColumnname() {
        return columnname;
    }

    /**
     * 设置栏目名
     *
     * @param columnname 栏目名
     */
    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    /**
     * 获取父栏目
     *
     * @return parentColumnId - 父栏目
     */
    public Integer getParentcolumnid() {
        return parentcolumnid;
    }

    /**
     * 设置父栏目
     *
     * @param parentcolumnid 父栏目
     */
    public void setParentcolumnid(Integer parentcolumnid) {
        this.parentcolumnid = parentcolumnid;
    }

    /**
     * 获取链接标题
     *
     * @return linkTitle - 链接标题
     */
    public String getLinktitle() {
        return linktitle;
    }

    /**
     * 设置链接标题
     *
     * @param linktitle 链接标题
     */
    public void setLinktitle(String linktitle) {
        this.linktitle = linktitle;
    }

    /**
     * 获取文章类型
     *
     * @return articleType - 文章类型
     */
    public String getArticletype() {
        return articletype;
    }

    /**
     * 设置文章类型
     *
     * @param articletype 文章类型
     */
    public void setArticletype(String articletype) {
        this.articletype = articletype;
    }

    /**
     * 获取栏目类型
     *
     * @return columnType - 栏目类型
     */
    public String getColumntype() {
        return columntype;
    }

    /**
     * 设置栏目类型
     *
     * @param columntype 栏目类型
     */
    public void setColumntype(String columntype) {
        this.columntype = columntype;
    }

    /**
     * 获取站点id
     *
     * @return laboratoryId - 站点id
     */
    public Integer getLaboratoryid() {
        return laboratoryid;
    }

    /**
     * 设置站点id
     *
     * @param laboratoryid 站点id
     */
    public void setLaboratoryid(Integer laboratoryid) {
        this.laboratoryid = laboratoryid;
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
     * 获取显示区域
     *
     * @return showArea - 显示区域
     */
    public String getShowarea() {
        return showarea;
    }

    /**
     * 设置显示区域
     *
     * @param showarea 显示区域
     */
    public void setShowarea(String showarea) {
        this.showarea = showarea;
    }

    /**
     * 获取关键字
     *
     * @return keyword - 关键字
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置关键字
     *
     * @param keyword 关键字
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
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