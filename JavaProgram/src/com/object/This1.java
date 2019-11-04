package com.object;

public class This1 {
	int i;
	void test()
	{
       System.out.println(i);
       i=20;
       System.out.println(this.i);
	}
	public static void main(String[] args) {
		
		This1 x=new This1();
		System.out.println(x.i);
		x.test();
	}

}
