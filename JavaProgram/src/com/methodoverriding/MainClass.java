package com.methodoverriding;

public class MainClass {

	public static void main(String[] args) {
		A ob=new A();
		ob.test();//from A test()
		B ob1=new B();
		ob1.test();//from B test()
		// TODO Auto-generated method stub

	}

}
