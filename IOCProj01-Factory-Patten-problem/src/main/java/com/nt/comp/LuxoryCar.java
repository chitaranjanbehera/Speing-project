package com.nt.comp;

public class LuxoryCar extends Car {
	private String regNo;
	public LuxoryCar(String regNo)
	{
	System.out.println("LuxoryCar:: 1 -param-Constructor");
	this.regNo=regNo;
	
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("LuxoryCar::"+regNo);
	}

}
