package com.order.beans;

public class Orders {
	int orderId;
	String orderItems;
	String orderPrice;
	PaymentService payment;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(String orderItems) {
		this.orderItems = orderItems;
	}
	public String getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	public PaymentService getPayment() {
		return payment;
	}
	public void setPayment(PaymentService payment) {
		this.payment = payment;
	}
	
	public void showOrderDetails() {
		System.out.println("Order id:"+this.orderId);
		System.out.println("Order Items:"+this.orderItems);
		System.out.println("Order Price:"+this.orderPrice);
		payment.showPaymentDetails();
	}
	
}
