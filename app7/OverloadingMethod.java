package com.app7;

public class OverloadingMethod {
		
		int sum()
		{ 
			return 1000;
			}
		int sum(int x) { 
			return x*x;
			}
		int sum(int x,int y)
		{
			return x+y;
			}
		float sum(float x,int y)
		{
			return x+y;
			}
		int sum(float x,float y)
		{ 
			return 0;
			}
		int sum(int x,float y)
		{
			return 0;
			}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			OverloadingMethod s=new OverloadingMethod();
			System.out.println(s.sum());
			System.out.println(s.sum(100));
			System.out.println(s.sum(10,20));
			System.out.println(s.sum(10.20f,20));

		}

}
