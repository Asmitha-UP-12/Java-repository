package com.constructor;

public class IciciOnline {

	public static void main(String[] args) {
		Loan loan1=new Loan();
		loan1.name="Home loan";
		loan1.rateOfInterest=12;
		System.out.println("loan name"+loan1.name+"loan rateofinterest"+loan1.rateOfInterest+"loan id"+loan1.loanId);
		Loan loan2=new Loan("education ",12);
		System.out.println("loan name"+loan2.name+"loan rateofinterest"+loan2.rateOfInterest+"loan id"+loan2.loanId);
		// TODO Auto-generated method stub

	}

}
