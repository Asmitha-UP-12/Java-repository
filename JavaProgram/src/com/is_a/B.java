package com.is_a;

public class B extends A{
	static int i=100;
	int j=200;
	static 
	{
		System.out.println("from sib of B");
	}
	{
		System.out.println("from iib of b");
	}
	B()
	{
	  System.out.println("from b()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B();
		
		System.out.println(ob1.j);
		
		System.out.println(B.i);

	}

}
