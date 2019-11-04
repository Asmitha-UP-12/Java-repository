package com.assignment;

public class Prime {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++)
		{
			int count=2;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(i+"is a prime number");
			}
		}
		// TODO Auto-generated method stub

	}

}
