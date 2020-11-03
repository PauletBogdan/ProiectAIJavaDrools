package com.sample;

public class Firm {

	private String name;
	private String businessDomain;
	private Balance balance;
	private BankruptcyStatus bankruptcyStatus;
	
	public Firm(String name, String businessDomain, Balance balance) {
		super();
		this.name = name;
		this.businessDomain = businessDomain;
		this.balance = balance;
		this.bankruptcyStatus = BankruptcyStatus.NOT_ENOUGH_DATA;
	}
	public Firm(String name, String businessDomain) {
		super();
		this.name = name;
		this.businessDomain = businessDomain;;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusinessDomain() {
		return businessDomain;
	}
	public void setBusinessDomain(String businessDomain) {
		this.businessDomain = businessDomain;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	
	public void firmStatus() {
		if(balance.getCurrentBalance() > 0) {			
			System.out.println("Firm is doing ok");
		}
		else {
			System.out.println("Firm is not doing ok");
		}
	}
	public BankruptcyStatus getBankruptcyStatus() {
		return bankruptcyStatus;
	}
	public void setBankruptcyStatus(BankruptcyStatus bankRuptcyStatus) {
		this.bankruptcyStatus = bankRuptcyStatus;
	}
	
	
}
