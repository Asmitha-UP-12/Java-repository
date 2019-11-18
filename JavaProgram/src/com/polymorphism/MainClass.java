package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           A ob;
           ob=new A();
           ob.test();
           ob= new B();//upcasting
           ob.test();//polymorphism
           
	}

}
