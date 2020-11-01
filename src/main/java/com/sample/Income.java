package com.sample;

import java.util.*;

public class Income {


	private Double totalIncome;
	private Double monthlyIncome;
	private Double ordersIncome;
	private ArrayList<Payment_In> incomeList;
	
	
	public Double calculateTotalIncome() {
		Double totalIncome = 0.0;
		for (int i = 0; i < this.incomeList.size(); i++) {
			totalIncome += this.incomeList.get(i).getValue();
		}

		this.totalIncome = totalIncome;
		return totalIncome;
	}

	public Double calculateMonthlyIncome() {
		Double monthlyIncome = 0.0;
		for (int i = 0; i < this.incomeList.size(); i++) {
			if (this.incomeList.get(i).getPaymentType() == PaymentType.MONTHLY) {
				monthlyIncome += this.incomeList.get(i).getValue();
			}
		}
		this.monthlyIncome = monthlyIncome;
		return this.monthlyIncome;
	}

	public Double calculateOrdersIncome() {
		Double ordersIncome = 0.0;
		for (int i = 0; i < this.incomeList.size(); i++) {
			if (this.incomeList.get(i).getPaymentType() == PaymentType.ORDER) {
				ordersIncome += this.incomeList.get(i).getValue();
			}
		}
		this.ordersIncome = ordersIncome;
		return ordersIncome;
	}

	public ArrayList<Payment_In> getIncomeList() {
		return incomeList;
	}

	public void setIncomeList(ArrayList<Payment_In> incomeList) {
		this.incomeList = incomeList;
	}

	public Income(ArrayList<Payment_In> incomeList) {
		super();
		this.incomeList = incomeList;
		this.calculateTotalIncome();
		this.calculateMonthlyIncome();
		this.calculateOrdersIncome();
	}	
	
	public Double getTotalIncome() {
		return totalIncome;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public Double getOrdersIncome() {
		return ordersIncome;
	}
}
