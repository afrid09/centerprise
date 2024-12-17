package com.app7;

public class SuperConstructor {

	static class A1
	{
		  int a=100;
		void show() {
			System.out.println("Show from class A1");
		}
		
	}
	static class A2
	{
		  int a=100;
		void show() {
			System.out.println("Show from class A1");
		}
		
	}

	static class B1 extends A1
	{
		 int a=200;
		void view() {
			super.show();
			System.out.println("view from class B1");
			System.out.println("local a value"+a);
			System.out.println("super class variable"+super.a);
		}
	}



	public class Sample32 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			B1 b =new B1();
			//b.show();
			b.view();
		}

	}
}