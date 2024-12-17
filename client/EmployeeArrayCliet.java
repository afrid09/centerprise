package com.app.client;

import com.app2.Employee;

public class EmployeeArrayCliet {
	public static void main(String[] args) {
		Employee e[]=new Employee[10];
		
		Employee e1=new Employee();
		e1.setEmpno(101);
		e1.setEmpname("Nageswara");
		e1.setSalary(10000);
		Employee e2=new Employee();
		e2.setEmpno(102);
		e2.setEmpname("Baari");
		e2.setSalary(20000);
		System.out.println(e.length);
		e[0]=e1;
		e[1]=e2;
		for (int i = 0; i < 2; i++) {
			System.out.println("Employee No "+e[i].getEmpno());
			System.out.println("Employee Name "+e[i].getEmpname());
			System.out.println("Employee Salary"+ e[i].getSalary());	
		}
		
	}
}

