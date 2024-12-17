package com.app2;


	public class Student {
		 private int stno;
		 private String stname;
		 private String email;
		 
		 
         public Student() {
         System.out.println(" Default constructor");
			 this.stno = 101;
				this.stname = "Ramana";
				this.email = "ramana@gmail.com";
		 }
	public Student(int stno, String stname, String email) {
			//super();
			this.stno = stno;
			this.stname = stname;
			this.email = email;
		}
          
         public int getStno() {
			return stno;
		}
		
		@Override
		public String toString() {
			return "Student [stno=" + stno + ", stname=" + stname + ", email=" + email + "]";
		}




		public void setStno(int stno) {
			this.stno = stno;
		}
		public String getStname() {
			return stname;
		}
		public void setStname(String stname) {
			this.stname = stname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		 
		 
	}


