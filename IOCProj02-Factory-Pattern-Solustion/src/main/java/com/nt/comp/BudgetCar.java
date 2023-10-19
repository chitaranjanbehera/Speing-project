package com.nt.comp;

public class BudgetCar extends Car {
	private String regNo;
	public BudgetCar(String regNo)
	{
	System.out.println("===BudgetCarCar:: 1 -param-Constructor===");
	this.regNo=regNo;
	
	}
	public void drive() {
		
		System.out.println("BudgetCar::"+regNo);
		
	}
	

}
