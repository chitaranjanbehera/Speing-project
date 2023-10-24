package com.nt.beans;

public class Employee {
	// all are mandatory to  participate
		private int eno;
		private String ename;
		private Float billAmt;
		
		public Employee(int eno, String ename, Float billAmt) {
			//super();
			this.eno = eno;
			this.ename = ename;
			this.billAmt = billAmt;
		}

		public String toString()
		{
			return"Employee leno-"+eno+"ename-"+ename+"billAmt"+billAmt;
		}
		
}
