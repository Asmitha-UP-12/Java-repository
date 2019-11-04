
package com.assignment;

public class Square {
	public static int square(int i)
	{
		return i*i;
	}

	public static void main(String[] args) {
		int []a=new int[5];
		for(int i=0;i<=4;i++)
		{
			a[i]=square(i+1);
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
