package com.spring.booking.beans;

import org.springframework.stereotype.Component;

@Component
public class Customers {
		int custId;
		String fname;
		String lname;
		String email;
		String phone;
		String pnr;
		int seatNo;
		String flightId;
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPnr() {
			return pnr;
		}
		public void setPnr(String pnr) {
			this.pnr = pnr;
		}
		public int getSeatNo() {
			return seatNo;
		}
		public void setSeatNo(int seatNo) {
			this.seatNo = seatNo;
		}
		public String getFlightId() {
			return flightId;
		}
		public void setFlightId(String flightId) {
			this.flightId = flightId;
		}
		public Customers(int custId, String fname, String lname, String email, String phone, String pnr, int seatNo,
				String flightId) {
			super();
			this.custId = custId;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.phone = phone;
			this.pnr = pnr;
			this.seatNo = seatNo;
			this.flightId = flightId;
		}
		public Customers() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
