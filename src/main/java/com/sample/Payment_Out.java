package com.sample;

public class Payment_Out extends Payment{
		
	public Payment_Out(PaymentType paymentType, Double value) {
		super(paymentType, value);
		this.paymentFlow = PaymentFlow.OUT;
	}

}
