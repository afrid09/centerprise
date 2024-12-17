package com.app7;

import java.io.Serializable;
// it should be public class
public class Customer implements Serializable{
// private properties
private int custno;
private String custname;
private String custlocation;
//it should be public constructor
public Customer() {  //default constructor
}
public Customer(Integer custno, String custName, String location) { //parameterized constructor
	super();
	this.custno = custno;
	this.custname = custName;
	this.custlocation = location;
}
public int getCustno() {
	return custno;
}

public void setCustno(int custno) {
	this.custno = custno;
}

public String getCustname() {
	return custname;
}

//we use override to not to print hashcode and we can print the value according to our needs
@Override
public String toString() {
	return "Customer [custno=" + custno + ", custname=" + custname + ", custlocation=" + custlocation + "]";
}
public void setCustname(String custname) {
	this.custname = custname;
}

public String getCustlocation() {
	return custlocation;
}

public void setCustlocation(String custlocation) {
	this.custlocation = custlocation;
}


}