package com.assignment;

public class Emp {
	int id; 
	String name;
	double sal;
	Emp(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	static Emp createEmp(int id,String name,double sal)
	{
		return new Emp(id,name,sal);
	}
	Emp initialize(double sal)
	{
		this.sal=sal;
		return this;
	}
	Emp display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.sal);
		return this;
	}
}
	
	


