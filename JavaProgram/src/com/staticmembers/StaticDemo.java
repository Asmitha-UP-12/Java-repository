package com.staticmembers;

public class StaticDemo {
	static int i;
	static 
	{
		System.out.println("from sib of SaticDemo");
	}
	public static void main(String[] args) {
        System.out.println("from static demo main");
		System.out.println(Demo.i);
		
		
	}

}
