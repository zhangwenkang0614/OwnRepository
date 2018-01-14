package com.pay.national.agent.model.entity;

import java.util.Date;

public class RewardGather {
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
     * 用户编号
     *
     * @mbggenerated
     */
    private String userNo;

    /**
     * 业务编码
     *
     * @mbggenerated
     */
    private String businessCode;

    /**
     * 子业务编码
     *
     * @mbggenerated
     */
    private String childBusinessCode;

    /**
     * 奖励总金额
     *
     * @mbggenerated
     */
    private Double rewardAmountTotal;

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

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getChildBusinessCode() {
        return childBusinessCode;
    }

    public void setChildBusinessCode(String childBusinessCode) {
        this.childBusinessCode = childBusinessCode;
    }

    public Double getRewardAmountTotal() {
        return rewardAmountTotal;
    }

    public void setRewardAmountTotal(Double rewardAmountTotal) {
        this.rewardAmountTotal = rewardAmountTotal;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "RewardGather [id=" + id + ", optimistic=" + optimistic + ", userNo=" + userNo + ", businessCode="
				+ businessCode + ", childBusinessCode=" + childBusinessCode + ", rewardAmountTotal=" + rewardAmountTotal
				+ ", createTime=" + createTime + "]";
	}
    
}