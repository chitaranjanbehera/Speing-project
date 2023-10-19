package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.Dtdc;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
//static  factory method supporting factory pattern
	public static Flipkart createFlipkart(String CourierType)
	{
		//create target class object
		Flipkart fpkt=new Flipkart();
		Courier courier=null;
		//create Dependent class object based on given Courier type
		if(CourierType.equalsIgnoreCase("dtdc"))
		{
			courier=new Dtdc();
		}
		else if(CourierType.equalsIgnoreCase("bDart"))
		{
			courier=new BlueDart();
		}
		else
		{
			throw new IllegalArgumentException("invalid delivered id");
		}
		return fpkt;
		
	}
}
