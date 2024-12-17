package com.app8;

abstract class Sample01{
	Sample01(){ System.out.println("This is abstract method-c");}
	abstract void show();
    //static void show1() {System.out.println("This is abstract method-s1");}
    //final void show2() {System.out.println("This is abstract method-s2");}
	
}
abstract class A2 extends Sample01
{
	
}

class A3 extends A2 //concrete class
{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}



