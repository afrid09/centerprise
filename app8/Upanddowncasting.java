package com.app8;

public class Upanddowncasting {
	class A extends Object
	{
		void show(){ System.out.println(" show from class A"); }
		void display() { System.out.println(" Display from class A");}
	}
 class B extends A
	{
		void view() { System.out.println(" show from class B");}
		@Override
		void display() { System.out.println(" Display from class B");}
		
	}

	public class Sample34 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			B b1=new B();
			b1.show();
			b1.view();
			b1.display();
			
			//Upcasting
				System.out.println("============================");
		    A a=new B();
			a.show();
			a.display();
		    
			System.out.println("============================");
			//DownCasting
			//B b=(B) new A();
			B b=(B)a;
			b.show();
			b.view();
			b.display();
			

		}

	}
	}
