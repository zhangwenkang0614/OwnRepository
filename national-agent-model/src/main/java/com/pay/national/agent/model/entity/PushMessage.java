package com.pay.national.agent.model.entity;

import java.util.Date;

public class PushMessage {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 版本号
     *
     * @mbggenerated
     */
    private Integer optimistic;

    /**
     * 推送的客户名
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 消息类型（MESSAGE、NOTICE）
     *
     * @mbggenerated
     */
    private String messageType;

    /**
     * 消息ID
     *
     * @mbggenerated
     */
    private String messageId;

    /**
     * 推送状态
     *
     * @mbggenerated
     */
    private String status;

    /**
     * 前端跳转方式
     *
     * @mbggenerated
     */
    private String jumpType;

    /**
     * 跳转H5的URL
     *
     * @mbggenerated
     */
    private String h5Url;

    /**
     * 跳转外链的URL
     *
     * @mbggenerated
     */
    private String linkUrl;

    /**
     * 安卓model名称
     *
     * @mbggenerated
     */
    private String androidModel;

    /**
     * 安卓model属性列表
     *
     * @mbggenerated
     */
    private String androidProperties;

    /**
     * IOSmodel名称
     *
     * @mbggenerated
     */
    private String iosModel;

    /**
     * IOSmodel属性列表
     *
     * @mbggenerated
     */
    private String iosProperties;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOptimistic() {
        return optimistic;
    }

    public void setOptimistic(Integer optimistic) {
        this.optimistic = optimistic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJumpType() {
        return jumpType;
    }

    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    public String getH5Url() {
        return h5Url;
    }

    public void setH5Url(String h5Url) {
        this.h5Url = h5Url;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getAndroidModel() {
        return androidModel;
    }

    public void setAndroidModel(String androidModel) {
        this.androidModel = androidModel;
    }

    public String getAndroidProperties() {
        return androidProperties;
    }

    public void setAndroidProperties(String androidProperties) {
        this.androidProperties = androidProperties;
    }

    public String getIosModel() {
        return iosModel;
    }

    public void setIosModel(String iosModel) {
        this.iosModel = iosModel;
    }

    public String getIosProperties() {
        return iosProperties;
    }

    public void setIosProperties(String iosProperties) {
        this.iosProperties = iosProperties;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "PushMessage [id=" + id + ", optimistic=" + optimistic + ", userName=" + userName + ", messageType="
				+ messageType + ", messageId=" + messageId + ", status=" + status + ", jumpType=" + jumpType
				+ ", h5Url=" + h5Url + ", linkUrl=" + linkUrl + ", androidModel=" + androidModel
				+ ", androidProperties=" + androidProperties + ", iosModel=" + iosModel + ", iosProperties="
				+ iosProperties + ", createTime=" + createTime + "]";
	}
    
    
}