package com.has_a;

public class MainClass {
	public static void main(String[] args) {
		P1.test();
		P1.i=20;
		
		System.out.println(P1.i);
		System.out.println(P2.i);
		P2.i=30;
		System.out.println(P1.i);
		

	}

}
