package com.app7;

public class ThisConstructor {
	

	class AA
	{
		AA(){
			//this(100);
			System.out.println(" Default Constructor");
		}
		
		AA(int x){
			this();
			System.out.println(" Arg Constructor"+x);
		}
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	           //new AA();
	      new AA(100);
	           }
}

	