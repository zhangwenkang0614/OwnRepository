package com.pay.national.agent.model.beans.results;

import java.io.Serializable;

import com.pay.settle.api.bean.SettleCardBean;

/**
 * @Description: 查找个人资料结果bean
 * @see: 需要参考的类
 * @version 2017年9月12日 上午10:00:46
 * @author zhenhui.liu
 */
public class FindInformationResultBean implements Serializable{

	private static final long serialVersionUID = -4264015784776974252L;
	
	private String name;
	
	private String identityNo;
	
	private SettleCardBean SettleCardBean ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public SettleCardBean getSettleCardBean() {
		return SettleCardBean;
	}

	public void setSettleCardBean(SettleCardBean settleCardBean) {
		SettleCardBean = settleCardBean;
	}

	@Override
	public String toString() {
		return "FindInformationResultBean [name=" + name + ", identityNo=" + identityNo + ", SettleCardBean="
				+ SettleCardBean + "]";
	}
	
	
}
