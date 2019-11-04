package com.nonstaticblock;

public class P1 {
	{
		System.out.println("from iib1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 ob=new P1();
		System.out.println("**************************");
		P1 ob2 =new P1();
		
		}
	{
		System.out.println("from iib2");
	}

}
