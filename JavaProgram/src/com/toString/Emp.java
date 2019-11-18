package com.toString;

public class Emp {
	int id;
	String name;
	double sal;
	Emp()
	{
		
	}
	Emp(int id, String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public String toString()
	{
		return id+" "+name+" "+sal;
	}
	public boolean equals(Object ob)
	{
		Emp ob1=(Emp)ob;
		return this.id==ob1.id && this.name.contentEquals(ob1.name) && this.sal==ob1.sal;
	}
	public int hashCode()
	{
		return id+name.hashCode()+(int)sal;
	}

}
