package com.object;

public class This {
	void m1()
	{
		System.out.println("from m1()");
		System.out.println(this);
	}
	public static void main(String[] args) {
		
		System.out.println("from main");
		This x = new This();
		System.out.println(x);
		x.m1();
		System.out.println("end of main");
		
		
	}

}
