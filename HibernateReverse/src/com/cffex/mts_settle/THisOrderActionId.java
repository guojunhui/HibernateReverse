package com.cffex.mts_settle;
// Generated 2016-10-19 17:50:46 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * THisOrderActionId generated by hbm2java
 */
@Embeddable
public class THisOrderActionId implements java.io.Serializable {

	private String tradingDay;
	private String exchId;
	private String orderId;

	public THisOrderActionId() {
	}

	public THisOrderActionId(String tradingDay, String exchId, String orderId) {
		this.tradingDay = tradingDay;
		this.exchId = exchId;
		this.orderId = orderId;
	}

	@Column(name = "TRADING_DAY", nullable = false, length = 8)
	public String getTradingDay() {
		return this.tradingDay;
	}

	public void setTradingDay(String tradingDay) {
		this.tradingDay = tradingDay;
	}

	@Column(name = "EXCH_ID", nullable = false, length = 30)
	public String getExchId() {
		return this.exchId;
	}

	public void setExchId(String exchId) {
		this.exchId = exchId;
	}

	@Column(name = "ORDER_ID", nullable = false, length = 20)
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof THisOrderActionId))
			return false;
		THisOrderActionId castOther = (THisOrderActionId) other;

		return ((this.getTradingDay() == castOther.getTradingDay()) || (this.getTradingDay() != null
				&& castOther.getTradingDay() != null && this.getTradingDay().equals(castOther.getTradingDay())))
				&& ((this.getExchId() == castOther.getExchId()) || (this.getExchId() != null
						&& castOther.getExchId() != null && this.getExchId().equals(castOther.getExchId())))
				&& ((this.getOrderId() == castOther.getOrderId()) || (this.getOrderId() != null
						&& castOther.getOrderId() != null && this.getOrderId().equals(castOther.getOrderId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradingDay() == null ? 0 : this.getTradingDay().hashCode());
		result = 37 * result + (getExchId() == null ? 0 : this.getExchId().hashCode());
		result = 37 * result + (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		return result;
	}

}
