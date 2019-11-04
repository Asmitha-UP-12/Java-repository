package com.object;

public class MainClass {
	public static void main(String[] args) {
		A ob1=new A();
		B ob2=new B();
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		ob1.d=10;
		ob2.d=20;
		System.out.println(ob1.d);
		System.out.println(ob2.d);
		
		
	}

}
