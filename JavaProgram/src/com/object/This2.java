package com.object;

public class This2 {
	int i=20;
	void test()
	{
		int i=10;
		System.out.println( i);
		System.out.println(this.i);
		
	}
	public static void main(String[] args) {
		
		This2 x=new This2();
		System.out.println(x.i);
		x.test();
		
	}
	

}
