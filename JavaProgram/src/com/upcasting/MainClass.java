package com.upcasting;

public class MainClass {

	public static void main(String[] args) {
		A ob1 =new B();//upacasting
		System.out.println(ob1.i);
		B ob2=new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		A ob3=ob2;//upcasting
		System.out.println(ob3.i);
		//System.out.println(ob3.j);//CTE
		
		
		// TODO Auto-generated method stub

	}

}
