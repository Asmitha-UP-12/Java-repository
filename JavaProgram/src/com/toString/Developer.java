package com.toString;

public class Developer extends Emp {
	String language;
	Developer()
	{
		
	}
	public Developer(int id, String name, double sal,String language) {
		super(id, name, sal);
		this.language=language;
		
	}
	public String toString()
	{
		return super.toString()+" "+language;
	}
	public boolean equals(Object ob)
	{
		Developer ob1=(Developer)ob;
		return super.equals(ob1)&&this.language==ob1.language;
	}
	public int hashCode()
	{
		return super.hashCode()+language.hashCode();
	}
	

}
