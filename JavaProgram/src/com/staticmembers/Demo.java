package com.staticmembers;

public class Demo {
	static boolean i;
	static
	{
		System.out.println("from sib of Demo");
	}
	public static void main(String[] args) {
		System.out.println("from main of Demo");
		System.out.println(StaticDemo.i);
		
		
	}

}
