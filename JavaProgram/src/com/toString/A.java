package com.toString;

public class A {
	int i;
	A(int i)
	{
		this.i=i;
		
	}
	public String toString()
	{
		return " i:  "+i;
	}
	public static void main(String[] args) {
		A ob=new A(10);
		System.out.println(ob);
	}

}
