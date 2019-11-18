package com.toString;

public class B extends A1 {
	char ch;
	String s;
	public B(int i, int j,char ch,String s) {
		super(i, j);
		this.ch=ch;
		this.s=s;
		// TODO Auto-generated constructor stub
	}
	B()
	{
		
	}
	public String toString()
	{
		return super.toString()+" "+ch+" "+s;
	}
	public static void main(String[] args) {
		
	
	A1 ob=new A1(10,20);
	System.out.println(ob);
	B ob1=new B(12,20,'a',"hello");
	
	System.out.println(ob1);
	}	
	

	
	

}
