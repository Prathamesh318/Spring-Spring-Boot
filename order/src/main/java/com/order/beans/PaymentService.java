package com.order.beans;

public class PaymentService {
	String paymentMethod;
	int payMentId;
	String serviceProvider;
	Double gateWayFee;
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public int getPayMentId() {
		return payMentId;
	}
	public void setPayMentId(int payMentId) {
		this.payMentId = payMentId;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public Double getGateWayFee() {
		return gateWayFee;
	}
	public void setGateWayFee(Double gateWayFee) {
		this.gateWayFee = gateWayFee;
	}
	
	public void showPaymentDetails() {
		System.out.println("Payment Method:"+this.getPaymentMethod());
		System.out.println("Payment Id:"+this.getPayMentId());
		System.out.println("Service Provider:"+this.getServiceProvider());
		System.out.println("Gateway Fee:"+this.getGateWayFee());
	}
}
