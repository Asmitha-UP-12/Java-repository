package com.staticmembers;

public class Static6 {
	static int i;

	public static void main(String[] args) {
		int i=20;
		System.out.println(i);
		
		System.out.println(Static6.i);
		m1();
		System.out.println(Static6.i);
		
}
	public static void m1()
	{
		System.out.println(Static6.i);
		Static6.i=10;
	}

}
