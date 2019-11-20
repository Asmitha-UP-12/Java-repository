package com.arraylistprog;

public class Bike {
	String color;
	double mileage;

	public Bike(String color,double mileage) {
		super();
		this.color = color;
		this.mileage=mileage;
	}
	public  String toString()
	{
		return "["+color+","+mileage+"]";
	}
	
	

}
