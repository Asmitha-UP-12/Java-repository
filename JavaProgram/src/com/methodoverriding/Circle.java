package com.methodoverriding;

public class Circle extends Shape{
	void area()
	{
		int r=2;
		double a=3.14*r*r;
		System.out.println("area of circle is:"+a);
	}

}
