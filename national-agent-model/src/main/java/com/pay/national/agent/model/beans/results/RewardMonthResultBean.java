package com.pay.national.agent.model.beans.results;

import java.io.Serializable;
import java.util.List;

public class RewardMonthResultBean implements Serializable{
	private static final long serialVersionUID = 2907342481352731405L;
	private String month;
	private Double amountOfMonth;
	private List<RewardDayResultBean> rewardDayList;
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Double getAmountOfMonth() {
		return amountOfMonth;
	}
	public void setAmountOfMonth(Double amountOfMonth) {
		this.amountOfMonth = amountOfMonth;
	}
	public List<RewardDayResultBean> getRewardDayList() {
		return rewardDayList;
	}
	public void setRewardDayList(List<RewardDayResultBean> rewardDayList) {
		this.rewardDayList = rewardDayList;
	}
	@Override
	public String toString() {
		return "RewardMonthResultBean [month=" + month + ", amountOfMonth=" + amountOfMonth + ", rewardDayList="
				+ rewardDayList + "]";
	}
}
