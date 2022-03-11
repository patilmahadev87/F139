package com.app.criatosoft.main.disburt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanSanction {
	
	@Id
	private long loanSanctionId;
	private long loanAmount;
	private Date sanctionData;
	private byte[] sanctionLetter;
	private String remark;
	public long getLoanSanctionId() {
		return loanSanctionId;
	}
	public void setLoanSanctionId(long loanSanctionId) {
		this.loanSanctionId = loanSanctionId;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Date getSanctionData() {
		return sanctionData;
	}
	public void setSanctionData(Date sanctionData) {
		this.sanctionData = sanctionData;
	}
	public byte[] getSanctionLetter() {
		return sanctionLetter;
	}
	public void setSanctionLetter(byte[] sanctionLetter) {
		this.sanctionLetter = sanctionLetter;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
