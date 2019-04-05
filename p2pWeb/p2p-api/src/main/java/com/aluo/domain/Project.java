package com.aluo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Project implements Serializable {
	private Long id;
	private String name;
	private BigDecimal loanMoney;
	private String code;
	private Integer loanTime;
	private BigDecimal zhl;
	private String description;
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getLoanMoney() {
		return loanMoney;
	}

	public void setLoanMoney(BigDecimal loanMoney) {
		this.loanMoney = loanMoney;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getLoanTime() {
		return loanTime;
	}

	public void setLoanTime(Integer loanTime) {
		this.loanTime = loanTime;
	}

	public BigDecimal getZhl() {
		return zhl;
	}

	public void setZhl(BigDecimal zhl) {
		this.zhl = zhl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
