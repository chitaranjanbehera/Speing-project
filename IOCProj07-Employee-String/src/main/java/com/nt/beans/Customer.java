package com.nt.beans;
public class Customer {
//cno,cname,billAmt are mandatory  property
	private int cno;
	private String cname;
	private Float billAmt;
	// caddress,mobile no are optional
	private String caddrs;
	private long mobileNo;
	public Customer(int cno, String cname, Float billAmt) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.billAmt = billAmt;
	}
	
	public void setCaddrs(String caddrs) {
		this.caddrs = caddrs;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String toString()
	{
		return"Employee leno-"+cno+"ename-"+cname+"billAmt"+billAmt;
	}
}
