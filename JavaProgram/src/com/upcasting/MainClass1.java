package com.upcasting;

public class MainClass1 {

	public static void main(String[] args) {
		
		// TODO Ato-generated method stub
		B ob1=new C();
		System.out.println(ob1.i);
		System.out.println(ob1.j);
		//System.out.println(ob1.k);//cte
		A ob2=new C();
		System.out.println(ob2.i);
	    A ob3 =new B();
	    System.out.println(ob3.i);
	    
	    

	}

}
