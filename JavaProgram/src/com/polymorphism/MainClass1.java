package com.polymorphism;

public class MainClass1
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank;
		bank=new ICICI();
		System.out.println("ICICI rOI"+bank.rateOfInterest());
		bank=new Canara();
		System.out.println("canara rOI"+bank.rateOfInterest());
		bank=new SBI();
		System.out.println( "sbi rOI"+bank.rateOfInterest());
		bank=new SBIINTouch();
		System.out.println("sbiintouch rOI"+bank.rateOfInterest());
		

	}

}
