package com.constructor;

public class Demo4 {
	     
	{
		System.out.println("from iib");
	}
	Demo4()
	{
		System.out.println("from Demo4()");
	}
	Demo4(int i)
	{   
		this(10,10);
		System.out.println("from Demo4(int)");
		
	}
	Demo4(int i,int j)
	{   this();
		System.out.println("from Demo4(int,int)");
	}
	

	public static void main(String[] args) {
		
		Demo4 ob1=new Demo4();
		Demo4 ob2=new Demo4(10);
		Demo4 ob3=new Demo4(20,20);
		// TODO Auto-generated method stub

	}

}
