package com.assignment;

public class DigitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int temp1=num;
		int temp2=num;
		int count=0;
		while(temp1>0)
		{
			count++;
			temp1/=10;
			
		}
		int []a=new int[count];
		
		for(int i=0;temp2>0;temp2/=10,i++)
		{
			int d= temp2%10;
			a[i]=d;
			System.out.println(a[i]);
			
			
		}
		System.out.println("***");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

	}

}
