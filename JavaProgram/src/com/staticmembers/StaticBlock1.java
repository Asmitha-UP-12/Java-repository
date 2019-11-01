package com.staticmembers;

public class StaticBlock1 {
	static
	{
		System.out.println("from sib2");
	}

	public static void main(String[] args) {
		System.out.println("from main");
		// TODO Auto-generated method stub

	}
	static 
	{
		System.out.println("from sib1");
	}

}
