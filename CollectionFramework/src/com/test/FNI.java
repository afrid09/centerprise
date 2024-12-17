package com.test;
//Any interface contain only one method is calls as FNI
interface Sample{
	   void show();  //anonymous 
}
public class FNI {    //Functional interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anonymous class
		 Sample s= new Sample() {
			
			@Override
			public void show() {
				System.out.println(" show from Sample Class");
				
			}
		};
		
		s.show();
		
	}

}

