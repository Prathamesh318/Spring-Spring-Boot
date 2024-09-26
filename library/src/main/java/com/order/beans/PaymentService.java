package com.order.beans;

public class PaymentService {
	String paymentMethod;
	int payMentId;
	double gateWayFee;
	String serviceProvider;
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public int getPayMentId() {
		return payMentId;
	}
	public void setPayMentId(int paymentId) {
		this.payMentId = paymentId;
	}
	public double getGateWayFee() {
		return gateWayFee;
	}
	public void setGateWayFee(double gateWayFee) {
		this.gateWayFee = gateWayFee;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
	public void showPaymentDetails() {
		System.out.println("Payment Id is :"+this.payMentId);
		System.out.println("Payment Method :"+this.paymentMethod);
		System.out.println("Payment Service provider :"+this.serviceProvider);
		System.out.println("Gateway Fee:"+this.gateWayFee);
		
	}


}
