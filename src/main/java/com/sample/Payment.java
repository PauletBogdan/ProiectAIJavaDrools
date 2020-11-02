package com.sample;

public abstract class Payment {

	protected PaymentFlow paymentFlow;
	private PaymentType paymentType;
	private Double value;
	
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}

	public Payment(Double value) {
		super();

		this.value = value;
	}
	
	public PaymentFlow getPaymentFlow() {
		return paymentFlow;
	}	
}
