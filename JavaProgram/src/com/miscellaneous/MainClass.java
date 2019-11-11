package com.miscellaneous;

public class MainClass {
     static void display(A ob)
     {
    	 System.out.println(ob.i);
    	 System.out.println(ob.j);
    	 System.out.println("*****");
    			
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A(10,10.2);
		A ob2=new A(20,20.2);
		display(ob1);
		display(ob2);
		

	}

}
