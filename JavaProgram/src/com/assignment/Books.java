package com.assignment;

public class Books {
	String name;
	int price;
	int isbn;
	static int x;
	
Books()
{
	++x;
	this.isbn=x;
}
Books(String name,int price)
{
	this();
	this.name=name;
	this.price=price;
	
}
void genre(String type)
{
	System.out.println(name+"is in"+type+"genre" );
}
}
