package com.pay.national.agent.model.beans.query;

import java.io.Serializable;

public class MessageListQueryBean implements Serializable{
	private static final long serialVersionUID = 3364284756414579365L;
	
	private String userName;//接收消息的用户名
	
	private String businessType;//业务类型
	
	private String isRead;//已读：Y 未读：N
	
	private String msgType;//消息类型
	
	private Integer messageLevel;//消息等级

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getIsRead() {
		return isRead;
	}

	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Integer getMessageLevel() {
		return messageLevel;
	}

	public void setMessageLevel(Integer messageLevel) {
		this.messageLevel = messageLevel;
	}

	@Override
	public String toString() {
		return "MessageListQueryBean [userName=" + userName + ", businessType=" + businessType + ", isRead=" + isRead
				+ ", msgType=" + msgType + ", messageLevel=" + messageLevel + "]";
	}

}
