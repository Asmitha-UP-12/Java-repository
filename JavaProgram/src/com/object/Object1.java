package com.object;

public class Object1 {
       int i;
       boolean flag;
	public static void main(String[] args) {
		System.out.println(new Object1());
		System.out.println(new Object1().i);
		Object1 a =new Object1();
		System.out.println(a.i);
		System.out.println(a.flag);
		a.i=10;
		a.flag=true;
		System.out.println(a.i);
		System.out.println(a.flag);
		
		
		
		// TODO Auto-generated method stub

	}

}
