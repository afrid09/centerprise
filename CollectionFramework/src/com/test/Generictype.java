package com.test;

class Friend<T>{
	 
	 void show(T x)
	 {
		 System.out.println(x);
	}
		
}

public class Generictype {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Friend<Integer> f=new Friend<>();
		Friend<String> f1=new Friend<>();
		Friend<Double> f2=new Friend<>();
		f1.show("Nageswara");
		f.show(100);
		f2.show(10.20);
	}

}