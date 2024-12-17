package com.test;

import java.util.ArrayList;

import com.app9.Employee;

public class sampleTest {
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Nageswara","naga@gmail.com",1000.00);
		Employee e2=new Employee(102,"Nageswara","naga@gmail.com",1000.00);
		Employee e3=new Employee(103,"Nageswara","naga@gmail.com",1000.00);
		Employee e4=new Employee(104,"Nageswara","naga@gmail.com",1000.00);
		Employee e5=new Employee(105,"Nageswara","naga@gmail.com",1000.00);
		Employee e11=new Employee(101,"Nageswara","naga@gmail.com",1000.00);
		Employee e22=new Employee(102,"Nageswara","naga@gmail.com",1000.00);
		Employee e33=new Employee(103,"Nageswara","naga@gmail.com",1000.00);
		Employee e44=new Employee(104,"Nageswara","naga@gmail.com",1000.00);
		Employee e55=new Employee(105,"Nageswara","naga@gmail.com",1000.00);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e11);
		list.add(e22);
		list.add(e33);
		list.add(e44);
		list.add(e55);
		
		
		for (Employee employee : list) {
		System.out.println(employee);	
		}
		
		
	}

}