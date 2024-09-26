package com.spring.expressdepartment.beans;

import org.springframework.stereotype.Component;

@Component
public class Department {
		private int deptId;
		private String deptName;
		private String deptIntake;
		private int deptDuration;
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Department(int deptId, String deptName, String deptIntake, int deptDuration) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			this.deptIntake = deptIntake;
			this.deptDuration = deptDuration;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getDeptIntake() {
			return deptIntake;
		}
		public void setDeptIntake(String deptIntake) {
			this.deptIntake = deptIntake;
		}
		public int getDeptDuration() {
			return deptDuration;
		}
		public void setDeptDuration(int deptDuration) {
			this.deptDuration = deptDuration;
		}
		
		
}
