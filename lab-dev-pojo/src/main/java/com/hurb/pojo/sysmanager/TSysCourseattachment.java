package com.hurb.pojo.sysmanager;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_sys_courseattachment")
public class TSysCourseattachment {
    /**
     * 唯一编码
     */
    @Id
    private Long id;

    /**
     * 课程编号
     */
    @Column(name = "courseCode")
    private String coursecode;

    /**
     * 链接实验地址
     */
    @Column(name = "linkLabAddress")
    private String linklabaddress;

    /**
     * 帮助文档 帮助文档
     */
    private String helpdoc;

    /**
     * 虚拟实验插件
     */
    private String plugin;

    /**
     * 3D插件
     */
    @Column(name = "plugin3D")
    private String plugin3d;

    /**
     * 服务器配置地址
     */
    @Column(name = "serverAddress")
    private String serveraddress;

    /**
     * 服务器配置端口
     */
    @Column(name = "serverPort")
    private Integer serverport;

    /**
     * 服务器配置用户名
     */
    @Column(name = "serverUser")
    private String serveruser;

    /**
     * 服务器密码
     */
    @Column(name = "serverPasswd")
    private String serverpasswd;

    /**
     * 客户端软件安装包
     */
    private String clientpkg;

    /**
     * 远程连接配置文件
     */
    @Column(name = "remoteLinkFile")
    private String remotelinkfile;

    /**
     * 远程连接配置软件名称
     */
    @Column(name = "remoteLinkSoftware")
    private String remotelinksoftware;

    /**
     * 备注
     */
    private String memo;

    /**
     * 获取唯一编码
     *
     * @return id - 唯一编码
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置唯一编码
     *
     * @param id 唯一编码
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取课程编号
     *
     * @return courseCode - 课程编号
     */
    public String getCoursecode() {
        return coursecode;
    }

    /**
     * 设置课程编号
     *
     * @param coursecode 课程编号
     */
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    /**
     * 获取链接实验地址
     *
     * @return linkLabAddress - 链接实验地址
     */
    public String getLinklabaddress() {
        return linklabaddress;
    }

    /**
     * 设置链接实验地址
     *
     * @param linklabaddress 链接实验地址
     */
    public void setLinklabaddress(String linklabaddress) {
        this.linklabaddress = linklabaddress;
    }

    /**
     * 获取帮助文档 帮助文档
     *
     * @return helpdoc - 帮助文档 帮助文档
     */
    public String getHelpdoc() {
        return helpdoc;
    }

    /**
     * 设置帮助文档 帮助文档
     *
     * @param helpdoc 帮助文档 帮助文档
     */
    public void setHelpdoc(String helpdoc) {
        this.helpdoc = helpdoc;
    }

    /**
     * 获取虚拟实验插件
     *
     * @return plugin - 虚拟实验插件
     */
    public String getPlugin() {
        return plugin;
    }

    /**
     * 设置虚拟实验插件
     *
     * @param plugin 虚拟实验插件
     */
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    /**
     * 获取3D插件
     *
     * @return plugin3D - 3D插件
     */
    public String getPlugin3d() {
        return plugin3d;
    }

    /**
     * 设置3D插件
     *
     * @param plugin3d 3D插件
     */
    public void setPlugin3d(String plugin3d) {
        this.plugin3d = plugin3d;
    }

    /**
     * 获取服务器配置地址
     *
     * @return serverAddress - 服务器配置地址
     */
    public String getServeraddress() {
        return serveraddress;
    }

    /**
     * 设置服务器配置地址
     *
     * @param serveraddress 服务器配置地址
     */
    public void setServeraddress(String serveraddress) {
        this.serveraddress = serveraddress;
    }

    /**
     * 获取服务器配置端口
     *
     * @return serverPort - 服务器配置端口
     */
    public Integer getServerport() {
        return serverport;
    }

    /**
     * 设置服务器配置端口
     *
     * @param serverport 服务器配置端口
     */
    public void setServerport(Integer serverport) {
        this.serverport = serverport;
    }

    /**
     * 获取服务器配置用户名
     *
     * @return serverUser - 服务器配置用户名
     */
    public String getServeruser() {
        return serveruser;
    }

    /**
     * 设置服务器配置用户名
     *
     * @param serveruser 服务器配置用户名
     */
    public void setServeruser(String serveruser) {
        this.serveruser = serveruser;
    }

    /**
     * 获取服务器密码
     *
     * @return serverPasswd - 服务器密码
     */
    public String getServerpasswd() {
        return serverpasswd;
    }

    /**
     * 设置服务器密码
     *
     * @param serverpasswd 服务器密码
     */
    public void setServerpasswd(String serverpasswd) {
        this.serverpasswd = serverpasswd;
    }

    /**
     * 获取客户端软件安装包
     *
     * @return clientpkg - 客户端软件安装包
     */
    public String getClientpkg() {
        return clientpkg;
    }

    /**
     * 设置客户端软件安装包
     *
     * @param clientpkg 客户端软件安装包
     */
    public void setClientpkg(String clientpkg) {
        this.clientpkg = clientpkg;
    }

    /**
     * 获取远程连接配置文件
     *
     * @return remoteLinkFile - 远程连接配置文件
     */
    public String getRemotelinkfile() {
        return remotelinkfile;
    }

    /**
     * 设置远程连接配置文件
     *
     * @param remotelinkfile 远程连接配置文件
     */
    public void setRemotelinkfile(String remotelinkfile) {
        this.remotelinkfile = remotelinkfile;
    }

    /**
     * 获取远程连接配置软件名称
     *
     * @return remoteLinkSoftware - 远程连接配置软件名称
     */
    public String getRemotelinksoftware() {
        return remotelinksoftware;
    }

    /**
     * 设置远程连接配置软件名称
     *
     * @param remotelinksoftware 远程连接配置软件名称
     */
    public void setRemotelinksoftware(String remotelinksoftware) {
        this.remotelinksoftware = remotelinksoftware;
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