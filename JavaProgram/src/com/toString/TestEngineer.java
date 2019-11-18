package com.toString;

public class TestEngineer extends Emp{
	String tool;
	TestEngineer()
	{
		
	}
	public TestEngineer(int id, String name, double sal,String tool) {
		super(id, name, sal);
		this.tool=tool;
	}
	public String toString()
	{
		return super.toString()+" "+tool;
	}
	public boolean equals(Object ob)
	{
		TestEngineer ob1=(TestEngineer)ob;
		return super.equals(ob1)&&this.tool==ob1.tool;
	}
	public int hashCode() {
		return super.hashCode()+tool.hashCode();
	}
	

}
