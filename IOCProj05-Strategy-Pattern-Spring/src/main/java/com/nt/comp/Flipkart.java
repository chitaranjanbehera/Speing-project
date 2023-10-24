package com.nt.comp;
import java.util.*;
public class Flipkart {
//Has-A  property of  type interface
	private Courier courier;
	public Flipkart()
	{
		System.out.println("Flipkart::0-param constructor");
		
	}
	//setter method for setter injection
	public void SetCourier(Courier courier)
	{
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
		
	}
	public String Shopping(String items[],float price[])
	{
		//calculate billAtm(b.logic)
		float billAmt=0.0f;
		for(int i=0;i<items.length;i++)
		{
			billAmt=billAmt+price[i];
		}
		//Generate order id
		int oid=new Random().nextInt(100);
		//use courier for shopping
		String Status=courier.deliver(oid);
		String FinalMsg=Arrays.toString(items)+"are purched with price"+Arrays.toString(price)+"The Generate bill amount is:"+billAmt;
		
		return  FinalMsg+"::"+Status;
	}
}
