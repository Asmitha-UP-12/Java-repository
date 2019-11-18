package com.inheritance;

public class B implements I1 {
	public void test()
	{
		System.out.println("from test implements in B");
	}
	public static void main(String[] args) {
		B ob=new B();
		ob.test();
	}

}
