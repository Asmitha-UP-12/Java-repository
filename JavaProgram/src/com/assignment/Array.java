package com.assignment;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int [] a=new int[n];
		int num=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=num;
			num+=2;
		}
		for(int i:a)
		{
			System.out.println(i+1);
		}

	}

}
