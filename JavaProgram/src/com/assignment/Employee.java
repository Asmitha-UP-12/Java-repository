package com.assignment;

public class Employee {
	String name;
	double salary;
	int id;
	Employee(String name,double salary,int id)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee("sai",12.2,1);
		System.out.println("emp name "+e1.name+"emp sal  "+e1.salary+"emp id  "+e1.id);
		

	}

}
