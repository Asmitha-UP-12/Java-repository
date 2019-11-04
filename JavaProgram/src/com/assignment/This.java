package com.assignment;

public class This {
	int i;
	public void initialize(int i)
	{
		
		this.i=i;
		System.out.println(i);
		System.out.println(this.i);
		
	}

	public static void main(String[] args) {
		This x= new This();
		x.initialize(15);
		
		// TODO Auto-generated method stub

	}

}
