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
 * TInstrumentMargin generated by hbm2java
 */
@Entity
@Table(name = "T_INSTRUMENT_MARGIN")
public class TInstrumentMargin implements java.io.Serializable {

	private TInstrumentMarginId id;
	private BigDecimal longMarginRate;
	private BigDecimal shortMarginRate;
	private BigDecimal lowestAssurance;
	private BigDecimal marginAdjust;
	private String remark;
	private String operDate;
	private String operTime;
	private String operId;

	public TInstrumentMargin() {
	}

	public TInstrumentMargin(TInstrumentMarginId id) {
		this.id = id;
	}

	public TInstrumentMargin(TInstrumentMarginId id, BigDecimal longMarginRate, BigDecimal shortMarginRate,
			BigDecimal lowestAssurance, BigDecimal marginAdjust, String remark, String operDate, String operTime,
			String operId) {
		this.id = id;
		this.longMarginRate = longMarginRate;
		this.shortMarginRate = shortMarginRate;
		this.lowestAssurance = lowestAssurance;
		this.marginAdjust = marginAdjust;
		this.remark = remark;
		this.operDate = operDate;
		this.operTime = operTime;
		this.operId = operId;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "instrumentId", column = @Column(name = "INSTRUMENT_ID", nullable = false, length = 50)),
			@AttributeOverride(name = "codeType", column = @Column(name = "CODE_TYPE", nullable = false, length = 1)),
			@AttributeOverride(name = "hedgeFlag", column = @Column(name = "HEDGE_FLAG", nullable = false, length = 1)) })
	public TInstrumentMarginId getId() {
		return this.id;
	}

	public void setId(TInstrumentMarginId id) {
		this.id = id;
	}

	@Column(name = "LONG_MARGIN_RATE", scale = 6)
	public BigDecimal getLongMarginRate() {
		return this.longMarginRate;
	}

	public void setLongMarginRate(BigDecimal longMarginRate) {
		this.longMarginRate = longMarginRate;
	}

	@Column(name = "SHORT_MARGIN_RATE", scale = 6)
	public BigDecimal getShortMarginRate() {
		return this.shortMarginRate;
	}

	public void setShortMarginRate(BigDecimal shortMarginRate) {
		this.shortMarginRate = shortMarginRate;
	}

	@Column(name = "LOWEST_ASSURANCE", scale = 6)
	public BigDecimal getLowestAssurance() {
		return this.lowestAssurance;
	}

	public void setLowestAssurance(BigDecimal lowestAssurance) {
		this.lowestAssurance = lowestAssurance;
	}

	@Column(name = "MARGIN_ADJUST", scale = 6)
	public BigDecimal getMarginAdjust() {
		return this.marginAdjust;
	}

	public void setMarginAdjust(BigDecimal marginAdjust) {
		this.marginAdjust = marginAdjust;
	}

	@Column(name = "REMARK")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "OPER_DATE", length = 8)
	public String getOperDate() {
		return this.operDate;
	}

	public void setOperDate(String operDate) {
		this.operDate = operDate;
	}

	@Column(name = "OPER_TIME", length = 8)
	public String getOperTime() {
		return this.operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	@Column(name = "OPER_ID", length = 20)
	public String getOperId() {
		return this.operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

}
