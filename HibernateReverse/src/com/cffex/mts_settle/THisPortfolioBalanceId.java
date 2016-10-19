package com.cffex.mts_settle;
// Generated 2016-10-19 17:50:46 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * THisPortfolioBalanceId generated by hbm2java
 */
@Embeddable
public class THisPortfolioBalanceId implements java.io.Serializable {

	private String tradingDay;
	private String portfolioId;

	public THisPortfolioBalanceId() {
	}

	public THisPortfolioBalanceId(String tradingDay, String portfolioId) {
		this.tradingDay = tradingDay;
		this.portfolioId = portfolioId;
	}

	@Column(name = "TRADING_DAY", nullable = false, length = 8)
	public String getTradingDay() {
		return this.tradingDay;
	}

	public void setTradingDay(String tradingDay) {
		this.tradingDay = tradingDay;
	}

	@Column(name = "PORTFOLIO_ID", nullable = false, length = 12)
	public String getPortfolioId() {
		return this.portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof THisPortfolioBalanceId))
			return false;
		THisPortfolioBalanceId castOther = (THisPortfolioBalanceId) other;

		return ((this.getTradingDay() == castOther.getTradingDay()) || (this.getTradingDay() != null
				&& castOther.getTradingDay() != null && this.getTradingDay().equals(castOther.getTradingDay())))
				&& ((this.getPortfolioId() == castOther.getPortfolioId())
						|| (this.getPortfolioId() != null && castOther.getPortfolioId() != null
								&& this.getPortfolioId().equals(castOther.getPortfolioId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradingDay() == null ? 0 : this.getTradingDay().hashCode());
		result = 37 * result + (getPortfolioId() == null ? 0 : this.getPortfolioId().hashCode());
		return result;
	}

}
