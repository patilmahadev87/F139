package com.app.criatosoft.main.disburt.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Disburtment {
	@Id
	
	private int disburseId;
	
	private Date disburseDate;
	private double proCharges;
	private double interest;
	private double disburse;
	
	
	public double getDisburse() {
		return disburse;
	}
	public void setDisburse(double disburse) {
		this.disburse = disburse;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public int getDisburseId() {
		return disburseId;
	}
	public void setDisburseId(int disburseId) {
		this.disburseId = disburseId;
	}
	public Date getDisburseDate() {
		return disburseDate;
	}
	public double getInterest() {
		return interest;
	}
	public void setDisburseDate(Date disburseDate) {
		this.disburseDate = disburseDate;
	}
	public double getProCharges() {
		return proCharges;
	}
	public void setProCharges(double proCharges) {
		this.proCharges = proCharges;
	}
	
	
	
	
}
