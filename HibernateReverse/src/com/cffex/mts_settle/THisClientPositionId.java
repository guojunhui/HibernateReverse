package com.cffex.mts_settle;
// Generated 2016-10-19 17:50:46 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * THisClientPositionId generated by hbm2java
 */
@Embeddable
public class THisClientPositionId implements java.io.Serializable {

	private String tradingDay;
	private String accountId;
	private String instrumentId;
	private String hedgeFlag;
	private String exchClientId;
	private String direction;

	public THisClientPositionId() {
	}

	public THisClientPositionId(String tradingDay, String accountId, String instrumentId, String hedgeFlag,
			String exchClientId, String direction) {
		this.tradingDay = tradingDay;
		this.accountId = accountId;
		this.instrumentId = instrumentId;
		this.hedgeFlag = hedgeFlag;
		this.exchClientId = exchClientId;
		this.direction = direction;
	}

	@Column(name = "TRADING_DAY", nullable = false, length = 8)
	public String getTradingDay() {
		return this.tradingDay;
	}

	public void setTradingDay(String tradingDay) {
		this.tradingDay = tradingDay;
	}

	@Column(name = "ACCOUNT_ID", nullable = false, length = 20)
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Column(name = "INSTRUMENT_ID", nullable = false, length = 50)
	public String getInstrumentId() {
		return this.instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	@Column(name = "HEDGE_FLAG", nullable = false, length = 1)
	public String getHedgeFlag() {
		return this.hedgeFlag;
	}

	public void setHedgeFlag(String hedgeFlag) {
		this.hedgeFlag = hedgeFlag;
	}

	@Column(name = "EXCH_CLIENT_ID", nullable = false, length = 20)
	public String getExchClientId() {
		return this.exchClientId;
	}

	public void setExchClientId(String exchClientId) {
		this.exchClientId = exchClientId;
	}

	@Column(name = "DIRECTION", nullable = false, length = 50)
	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof THisClientPositionId))
			return false;
		THisClientPositionId castOther = (THisClientPositionId) other;

		return ((this.getTradingDay() == castOther.getTradingDay()) || (this.getTradingDay() != null
				&& castOther.getTradingDay() != null && this.getTradingDay().equals(castOther.getTradingDay())))
				&& ((this.getAccountId() == castOther.getAccountId()) || (this.getAccountId() != null
						&& castOther.getAccountId() != null && this.getAccountId().equals(castOther.getAccountId())))
				&& ((this.getInstrumentId() == castOther.getInstrumentId())
						|| (this.getInstrumentId() != null && castOther.getInstrumentId() != null
								&& this.getInstrumentId().equals(castOther.getInstrumentId())))
				&& ((this.getHedgeFlag() == castOther.getHedgeFlag()) || (this.getHedgeFlag() != null
						&& castOther.getHedgeFlag() != null && this.getHedgeFlag().equals(castOther.getHedgeFlag())))
				&& ((this.getExchClientId() == castOther.getExchClientId())
						|| (this.getExchClientId() != null && castOther.getExchClientId() != null
								&& this.getExchClientId().equals(castOther.getExchClientId())))
				&& ((this.getDirection() == castOther.getDirection()) || (this.getDirection() != null
						&& castOther.getDirection() != null && this.getDirection().equals(castOther.getDirection())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradingDay() == null ? 0 : this.getTradingDay().hashCode());
		result = 37 * result + (getAccountId() == null ? 0 : this.getAccountId().hashCode());
		result = 37 * result + (getInstrumentId() == null ? 0 : this.getInstrumentId().hashCode());
		result = 37 * result + (getHedgeFlag() == null ? 0 : this.getHedgeFlag().hashCode());
		result = 37 * result + (getExchClientId() == null ? 0 : this.getExchClientId().hashCode());
		result = 37 * result + (getDirection() == null ? 0 : this.getDirection().hashCode());
		return result;
	}

}
