package com.constructor;

public class Loan {
          String name;
          double rateOfInterest;
          String loanId;
          static int x;
          
          {
        	  ++x;
        	  loanId= "iciciL"+x;
        	 
          }
          Loan()
          {
        	  
          }
          Loan(String name,double rateOfInterest)
          {
        	  this.name=name;
        	  this.rateOfInterest=rateOfInterest;
        	  
          }
          
	
	}


