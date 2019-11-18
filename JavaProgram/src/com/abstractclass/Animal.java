package com.abstractclass;

 abstract public class Animal {
	double height;
	double weight;
	Animal()
	{
		
	}
	public Animal(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	abstract void talk();
	

}
