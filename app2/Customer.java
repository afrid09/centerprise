package com.app2;

import com.app2.Student;

public class Customer {
            int custno;
            String custname;
            double custprice;
	public int getCustno() {
				return custno;
			}
	public Customer() {
		 
		 System.out.println(" Default constructor");
		 this.custno = 101;
			this.custname = "Ramana";
			this.custprice = 200;
	 }
			public void setCustno(int custno) {
				this.custno = custno;
			}
			public Customer(int custno, String custname, int custprice) {
				//super();
				this.custno = custno;
				this.custname = custname;
				this.custprice = custprice;
			}
			public String getCustname() {
				return custname;
			}
			public void setCustname(String custname) {
				this.custname = custname;
			}
			public double getCustprice() {
				return custprice;
			}
			public void setCustprice(double custprice) {
				this.custprice = custprice;
			}

}
