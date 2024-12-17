package com.app9;
public class Employee {

		public Employee() {
			super();
		}
		
		public Employee(Integer empNo, String empName, String email, Double salary) {
			super();
			this.empNo = empNo;
			this.empName = empName;
			this.email = email;
			this.salary = salary;
		}
		
		
		private Integer empNo;
		private String empName;
		private String email;
		private Double salary;
		
		public Integer getEmpNo() {
			return empNo;
		}
		public void setEmpNo(Integer empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empNo=" + empNo + ", empName=" + empName + ", email=" + email + ", salary=" + salary + "]";
		}
		
		

	}
