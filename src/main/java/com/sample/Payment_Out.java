package com.sample;

public class Payment_Out extends Payment{
		
	public Payment_Out(Double value) {
		super(value);
		this.paymentFlow = PaymentFlow.OUT;
	}

}
