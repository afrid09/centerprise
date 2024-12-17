package com.app2;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpno(101);
		e1.setEmpname("Nageswara");
		e1.setSalary(10000);
		
		
		
		System.out.println("Employee No "+e1.getEmpno());
		System.out.println("Employee Name "+e1.getEmpname());
		System.out.println("Employee Salary"+ e1.getSalary());
		
		Employee e2=new Employee();
		e2.setEmpno(102);
		e2.setEmpname("Baari");
		e2.setSalary(20000);
		
		System.out.println("Employee No "+e2.getEmpno());
		System.out.println("Employee Name "+e2.getEmpname());
		System.out.println("Employee Salary"+ e2.getSalary());

	}
}
