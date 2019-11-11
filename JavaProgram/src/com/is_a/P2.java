package com.is_a;

public class P2 extends P1{
	int j;
	{
		System.out.println("from iib of P2");
	}
	P2()
	{
		super();
		System.out.println("from p1()");
	}
	public static void main(String[] args) {
		
		P2 ob=new P2();
		System.out.println(ob.i);
		System.out.println(ob.j);
		P1 ob2=new P1();
		System.out.println(ob2.i);
		
		
	}

}
