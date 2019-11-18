package com.encapsulation;

public class Main {
	public static void main(String[] args) {
		Employee emp=new Employee(1,"asmi",10);
		System.out.println("employee name "+emp.getName());
		System.out.println("employee id "+emp.getId());
		emp.setSalary(100);
		System.out.println("employee salary "+emp.getSalary());
		
	}

}
