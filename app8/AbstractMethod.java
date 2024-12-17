package com.app8;

abstract class Sample {
    Sample(){ System.out.println("This is abstract method-c");}
	abstract void show();
    static void show1() {System.out.println("This is abstract method-s1");}
    final void show2()  {System.out.println("This is abstract method-s2");}
	
}
class A1 extends Sample
{
	void show() {
		System.out.println("This is abstract method-s");
	}
}

public class  AbstractMethod{

	public static void main(String[] args) {
	A1.show();
	A1.show1();
    new A1().show2();;
    
         
	}

}
