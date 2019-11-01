package com.staticmembers;

public class StaticBlock {
	static int i;
	static 
	{
		System.out.println("from sib");
		System.out.println(i);
		i=20;
	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(i);
		// TODO Auto-generated method stub

	}

}
