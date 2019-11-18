package com.abstractclass;

public class Jungle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog(12,30);
		Lion lion=new Lion(14,100);
		System.out.println(dog.height+" "+dog.weight);
		dog.talk();
		System.out.println(lion.height+" "+lion.weight);
		lion.talk();
		

	}

}
