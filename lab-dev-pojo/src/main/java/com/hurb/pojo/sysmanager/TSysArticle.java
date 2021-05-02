package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_sys_article")
public class TSysArticle {
    /**
     * id
     */
    private Integer id;

    /**
     * 文章名
     */
    @Column(name = "articleName")
    private String articlename;

    /**
     * 所属栏目id
     */
    @Column(name = "columnId")
    private Integer columnid;

    /**
     * 标题
     */
    private String title;

    /**
     * 链接标题
     */
    @Column(name = "linkTile")
    private String linktile;

    /**
     * 标题图片
     */
    @Column(name = "titlePicture")
    private String titlepicture;

    /**
     * 站点id
     */
    @Column(name = "laboratoryId")
    private Integer laboratoryid;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 添加时间
     */
    @Column(name = "addTime")
    private Date addtime;

    /**
     * 发布时间
     */
    @Column(name = "publishTime")
    private Date publishtime;

    /**
     * 置顶级别
     */
    @Column(name = "stickyLevel")
    private String stickylevel;

    @Column(name = "sortLevel")
    private String sortlevel;

    /**
     * 状态（0草稿、默认1发布、-1下线）
     */
    private String state;

    /**
     * 文章内容
     */
    private String content;

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
     * 获取文章名
     *
     * @return articleName - 文章名
     */
    public String getArticlename() {
        return articlename;
    }

    /**
     * 设置文章名
     *
     * @param articlename 文章名
     */
    public void setArticlename(String articlename) {
        this.articlename = articlename;
    }

    /**
     * 获取所属栏目id
     *
     * @return columnId - 所属栏目id
     */
    public Integer getColumnid() {
        return columnid;
    }

    /**
     * 设置所属栏目id
     *
     * @param columnid 所属栏目id
     */
    public void setColumnid(Integer columnid) {
        this.columnid = columnid;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取链接标题
     *
     * @return linkTile - 链接标题
     */
    public String getLinktile() {
        return linktile;
    }

    /**
     * 设置链接标题
     *
     * @param linktile 链接标题
     */
    public void setLinktile(String linktile) {
        this.linktile = linktile;
    }

    /**
     * 获取标题图片
     *
     * @return titlePicture - 标题图片
     */
    public String getTitlepicture() {
        return titlepicture;
    }

    /**
     * 设置标题图片
     *
     * @param titlepicture 标题图片
     */
    public void setTitlepicture(String titlepicture) {
        this.titlepicture = titlepicture;
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
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取添加时间
     *
     * @return addTime - 添加时间
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * 设置添加时间
     *
     * @param addtime 添加时间
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取发布时间
     *
     * @return publishTime - 发布时间
     */
    public Date getPublishtime() {
        return publishtime;
    }

    /**
     * 设置发布时间
     *
     * @param publishtime 发布时间
     */
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * 获取置顶级别
     *
     * @return stickyLevel - 置顶级别
     */
    public String getStickylevel() {
        return stickylevel;
    }

    /**
     * 设置置顶级别
     *
     * @param stickylevel 置顶级别
     */
    public void setStickylevel(String stickylevel) {
        this.stickylevel = stickylevel;
    }

    /**
     * @return sortLevel
     */
    public String getSortlevel() {
        return sortlevel;
    }

    /**
     * @param sortlevel
     */
    public void setSortlevel(String sortlevel) {
        this.sortlevel = sortlevel;
    }

    /**
     * 获取状态（0草稿、默认1发布、-1下线）
     *
     * @return state - 状态（0草稿、默认1发布、-1下线）
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态（0草稿、默认1发布、-1下线）
     *
     * @param state 状态（0草稿、默认1发布、-1下线）
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
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