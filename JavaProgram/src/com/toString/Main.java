package com.toString;

public class Main {
	public static void main(String[] args) {
		TestEngineer ob1=new TestEngineer(1, "a", 10,"selenium");
		TestEngineer ob2=new TestEngineer(1, "a", 10,"selenium"); 
		Developer ob3=new Developer(1,"ab",10,"java");
		Developer ob4=new Developer(2,"cd",10,"python");
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob1.equals(ob2));
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		System.out.println(ob3.equals(ob4));
		
		
		
		
	}

}
