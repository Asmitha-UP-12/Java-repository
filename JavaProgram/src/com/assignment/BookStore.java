package com.assignment;

public class BookStore {

	public static void main(String[] args) {
		Books b1=new Books("the num",200);
		Books b2=new Books("the supiria",200);
		Books b3=new Books("the overload",200);
		Books b4=new Books("the first purge",200);
		Books b5=new Books("the mandya",200);
		Books[] a= {b1,b2,b3,b4,b5};
		for(Books x:a)
		{ 
			System.out.println("book name "+x.name+" book price"+x.price+"book isbn"+x.isbn);
			x.genre("thriller");
			
		}
		// TODO Auto-generated method stub

	}

}
