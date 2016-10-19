package com.cffex.mts_settle;
// Generated 2016-10-19 17:50:46 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * THisOrderAction generated by hbm2java
 */
@Entity
@Table(name = "T_HIS_ORDER_ACTION")
public class THisOrderAction implements java.io.Serializable {

	private THisOrderActionId id;
	private String orderUserId;
	private String userId;
	private String portfolioId;
	private String userOrderActionLocalId;
	private String localOrderId;
	private String actionFlag;
	private BigDecimal limitPrice;
	private Long volume;
	private String orderStatus;

	public THisOrderAction() {
	}

	public THisOrderAction(THisOrderActionId id, String portfolioId) {
		this.id = id;
		this.portfolioId = portfolioId;
	}

	public THisOrderAction(THisOrderActionId id, String orderUserId, String userId, String portfolioId,
			String userOrderActionLocalId, String localOrderId, String actionFlag, BigDecimal limitPrice, Long volume,
			String orderStatus) {
		this.id = id;
		this.orderUserId = orderUserId;
		this.userId = userId;
		this.portfolioId = portfolioId;
		this.userOrderActionLocalId = userOrderActionLocalId;
		this.localOrderId = localOrderId;
		this.actionFlag = actionFlag;
		this.limitPrice = limitPrice;
		this.volume = volume;
		this.orderStatus = orderStatus;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tradingDay", column = @Column(name = "TRADING_DAY", nullable = false, length = 8)),
			@AttributeOverride(name = "exchId", column = @Column(name = "EXCH_ID", nullable = false, length = 30)),
			@AttributeOverride(name = "orderId", column = @Column(name = "ORDER_ID", nullable = false, length = 20)) })
	public THisOrderActionId getId() {
		return this.id;
	}

	public void setId(THisOrderActionId id) {
		this.id = id;
	}

	@Column(name = "ORDER_USER_ID", length = 20)
	public String getOrderUserId() {
		return this.orderUserId;
	}

	public void setOrderUserId(String orderUserId) {
		this.orderUserId = orderUserId;
	}

	@Column(name = "USER_ID", length = 20)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "PORTFOLIO_ID", nullable = false, length = 12)
	public String getPortfolioId() {
		return this.portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	@Column(name = "USER_ORDER_ACTION_LOCAL_ID", length = 20)
	public String getUserOrderActionLocalId() {
		return this.userOrderActionLocalId;
	}

	public void setUserOrderActionLocalId(String userOrderActionLocalId) {
		this.userOrderActionLocalId = userOrderActionLocalId;
	}

	@Column(name = "LOCAL_ORDER_ID", length = 20)
	public String getLocalOrderId() {
		return this.localOrderId;
	}

	public void setLocalOrderId(String localOrderId) {
		this.localOrderId = localOrderId;
	}

	@Column(name = "ACTION_FLAG", length = 1)
	public String getActionFlag() {
		return this.actionFlag;
	}

	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
	}

	@Column(name = "LIMIT_PRICE", precision = 22, scale = 6)
	public BigDecimal getLimitPrice() {
		return this.limitPrice;
	}

	public void setLimitPrice(BigDecimal limitPrice) {
		this.limitPrice = limitPrice;
	}

	@Column(name = "VOLUME", precision = 13, scale = 0)
	public Long getVolume() {
		return this.volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	@Column(name = "ORDER_STATUS", length = 1)
	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}