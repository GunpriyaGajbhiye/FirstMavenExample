package com.lti.demo;

public class Customer {

	private int cusNo;
	private String cusName;
	private double billAmmount;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cusNo, String cusName, double billAmmount) {
		super();
		this.cusNo = cusNo;
		this.cusName = cusName;
		this.billAmmount = billAmmount;
	}
	public int getCusNo() {
		return cusNo;
	}
	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public double getBillAmmount() {
		return billAmmount;
	}
	public void setBillAmmount(double billAmmount) {
		this.billAmmount = billAmmount;
	}
	@Override
	public String toString() {
		return "Customer [cusNo=" + cusNo + ", cusName=" + cusName + ", billAmmount=" + billAmmount + "]";
	}
	
	
	}
