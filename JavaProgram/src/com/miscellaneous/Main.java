package com.miscellaneous;

public class Main {
	static void display(A1 ob)
	{
		System.out.println(ob.i);
		System.out.println(ob.b);
	}
	

	public static void main(String[] args) {
		A1 ob=new A1(10,0.0);
		A1 ob1=new A1(20,10.0);
		Main.display(ob1);
		Main.display(ob);
		
		
		// TODO Auto-generated method stub

	}

}
