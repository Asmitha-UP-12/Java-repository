package com.arraylistprog;

public class Emp {
	String name;
	int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return "["+name+","+id+"]";
	}

}
