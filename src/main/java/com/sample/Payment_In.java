package com.sample;

public class Payment_In extends Payment {

	public Payment_In(PaymentType paymentType, Double value) {
		super(paymentType, value);
		this.paymentFlow = PaymentFlow.IN;

	}

}
