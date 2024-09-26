package com.order.beans;
//import org.springframework.beans.factory.annotation.Autowired;
public class Orders {
	int orderId;
	String orderItems;
	String orderPrice;
//	@Autowired
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
		System.out.println("Order Id is :"+this.orderId);
		System.out.println("Order Items are :"+this.orderItems);
		System.out.println("Order price is :"+this.orderPrice);
		payment.showPaymentDetails();
	}
	

}
