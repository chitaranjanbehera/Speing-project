package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratgyDpTest {

	public static void main(String[] args) {
		try {
			//get target class object
			Flipkart fpkt=FlipkartFactory.createFlipkart("bDart");
			//invoke the business logic
			String result=fpkt.Shopping(new String[] {"shirt","trouser","mobile"},new float[] {3000.08f,5600.9f,89900f});
			System.out.println(result);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
