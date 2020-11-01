package com.sample;

import java.util.ArrayList;

public class Expense{

	private Double totalExpense;
	private Double monthlyExpenses;
	private Double ordersExpenses;
	private ArrayList<Payment_Out> expensesList;
	
	public Double calculateMonthlyExpenses() {
		Double monthlyExpenses = 0.0;
		for (int i = 0; i < expensesList.size(); i++) {
			if (expensesList.get(i).getPaymentType() == PaymentType.MONTHLY) {
				monthlyExpenses += expensesList.get(i).getValue();
			}
		}
		this.monthlyExpenses = monthlyExpenses;
		return this.monthlyExpenses;
	}

	public Double calculateOrdersExpenses() {
		Double ordersExpenses = 0.0;
		for (int i = 0; i < expensesList.size(); i++) {
			if (expensesList.get(i).getPaymentType() == PaymentType.ORDER) {
				ordersExpenses += expensesList.get(i).getValue();
			}
		}
		this.ordersExpenses = ordersExpenses;
		return this.ordersExpenses;
	}

	public Double calculateTotalExpense() {
		Double totalExpense = 0.0;
		for (int i = 0; i < expensesList.size(); i++) {
			totalExpense += expensesList.get(i).getValue();
		}
		this.totalExpense = totalExpense;
		return this.totalExpense;
	}

	public ArrayList<Payment_Out> getExpensesList() {
		return expensesList;
	}

	public void setExpensesList(ArrayList<Payment_Out> expensesList) {
		this.expensesList = expensesList;
	}

	public Expense(ArrayList<Payment_Out> expensesList) {
		super();
		this.expensesList = expensesList;
		this.calculateMonthlyExpenses();
		this.calculateTotalExpense();
		this.calculateOrdersExpenses();
	}

	public Double getTotalExpense() {
		return totalExpense;
	}

	public Double getMonthlyExpenses() {
		return monthlyExpenses;
	}

	public Double getOrdersExpenses() {
		return ordersExpenses;
	}
	
}
