package com.staticmembers;

public class NonStatic {
	int i=10;

	public static void main(String[] args) {
		int i=20;
		NonStatic ob=new NonStatic();
		System.out.println(i);
		System.out.println(ob.i);
		// TODO Auto-generated method stub

	}

}
