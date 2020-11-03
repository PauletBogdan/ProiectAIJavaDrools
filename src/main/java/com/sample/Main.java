package com.sample;

import java.util.*;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {

	public static void main(String[] args) {

		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
//		-----------Payments/Income-----------------
			Payment_In payment_in1 = new Payment_In(100.32);
			Payment_In payment_in2 = new Payment_In(430.7);
			Payment_In payment_in3 = new Payment_In(69.69);
			Payment_In payment_in4 = new Payment_In(156.5);
			Payment_In payment_in5 = new Payment_In(420.69);

			ArrayList<Payment_In> incomeList = new ArrayList<>();
			incomeList.add(payment_in1);
			incomeList.add(payment_in2);
			incomeList.add(payment_in3);
			incomeList.add(payment_in4);
			incomeList.add(payment_in5);

//		-----------Payments/Expenses-----------------

			Payment_Out payment_out1 = new Payment_Out(120.32);
			Payment_Out payment_out2 = new Payment_Out(34.53);
			Payment_Out payment_out3 = new Payment_Out(99.3);
			Payment_Out payment_out4 = new Payment_Out(120.32);
			Payment_Out payment_out5 = new Payment_Out(340.0);

			ArrayList<Payment_Out> expenseList = new ArrayList<>();
			expenseList.add(payment_out1);
			expenseList.add(payment_out2);
			expenseList.add(payment_out3);
			expenseList.add(payment_out4);
			expenseList.add(payment_out5);

//		-----------Income-----------------

			Income income = new Income(incomeList);
			Double monthlyIncomeValue = income.calculateMonthlyIncome();
//			System.out.println("Monthly income Value is : " + monthlyIncomeValue);
			Double orderIncomeValue = income.calculateOrdersIncome();
//			System.out.println("Orders income Value is : " + orderIncomeValue);
			Double totalIncomeValue = income.calculateTotalIncome();
//			System.out.println("Total income Value is : " + totalIncomeValue);

//		-----------Expenses---------------

			Expense expense = new Expense(expenseList);
			Double monthlyExpenseValue = expense.calculateMonthlyExpenses();
//			System.out.println("Monthly expense Value is : " + monthlyExpenseValue);
			Double orderExpenseValue = expense.calculateOrdersExpenses();
//			System.out.println("Orders expense Value is : " + orderExpenseValue);
			Double totalExpenseValue = expense.calculateTotalExpense();
//			System.out.println("Total expense Value is : " + totalExpenseValue);

//		-------------------------------------------------------------------------------------------------------------

			Payment_In payment_in231 = new Payment_In(231.0);
//    		incomeList.add(payment_in231);

			Payment_Out payment_out367 = new Payment_Out(461.0);
			expenseList.add(payment_out367);

			Payment_Out payment_out21 = new Payment_Out(100265.3);
			expenseList.add(payment_out21); 
			
			Payment_In payment_in3722 = new Payment_In(0.0);
			
			Expense newExpense = new Expense(expenseList);

			Income newIncome = new Income(incomeList);

			Balance newBalance = new Balance(newExpense, newIncome);
			newBalance.calculateAllTheBalance();
			
			Firm firm = new Firm("Jean SRL", "WebDev", newBalance);

//			System.out.println(newBalance.getCurrentMonthlyBalance());
			// go !
			kSession.insert(payment_out21);
			kSession.insert(payment_in3722);
			kSession.insert(payment_in231);
			kSession.insert(newIncome);
			kSession.insert(newExpense);
			kSession.insert(newBalance);
			kSession.insert(firm);
			kSession.fireAllRules();

		} catch (Throwable t) {
			t.printStackTrace();
		}

	}
}
