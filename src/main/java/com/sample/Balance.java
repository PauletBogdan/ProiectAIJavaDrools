package com.sample;

public class Balance {

	private Expense expenses;
	private Income incomes;
	private Double currentBalance;
	private Double currentMonthlyBalance;
	private Double currentOrdersBalance;

	public Balance() {
		super();
	}

	private Double calculate(Double a, Double b) {
		return a - b;
	}

	public Balance(Expense expenses, Income incomes) {
		super();
		this.expenses = expenses;
		this.incomes = incomes;
	
	}
	public void calculateAllTheBalance() {
		this.calculateCurrentBalance(this.expenses.getTotalExpense(), this.incomes.getTotalIncome());
		this.calculateMonthlyBalance(this.expenses.getMonthlyExpenses(), this.incomes.getMonthlyIncome());
		this.calculateOrdersBalance(this.expenses.getOrdersExpenses(), this.incomes.getOrdersIncome());
		
	}

	public Double calculateCurrentBalance(Double totalExpense, Double totalIncome) {

		this.currentBalance = calculate(totalIncome, totalExpense);
		return currentBalance;
	}

	public Double calculateMonthlyBalance(Double monthlyExpense, Double monthlyIncome) {

		this.currentMonthlyBalance = calculate(monthlyIncome, monthlyExpense);
		return currentMonthlyBalance;
	}

	public Double calculateOrdersBalance(Double ordersExpenses, Double ordersIncome) {

		this.currentOrdersBalance = calculate(ordersIncome, ordersExpenses);
		return currentOrdersBalance;
	}

	public Expense getExpenses() {
		return expenses;
	}

	public void setExpenses(Expense expenses) {
		this.expenses = expenses;
	}

	public Income getIncomes() {
		return incomes;
	}

	public void setIncomes(Income incomes) {
		this.incomes = incomes;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public Double getCurrentMonthlyBalance() {
		return currentMonthlyBalance;
	}

	public Double getCurrentOrdersBalance() {
		return currentOrdersBalance;
	}	

}
