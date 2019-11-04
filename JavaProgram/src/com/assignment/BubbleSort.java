package com.assignment;

public class BubbleSort {
	static void bubbleSort(int a[])
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
			
	}
	public static void main(String[] args) {
		
		int a[]= {2,1,4,3,6,5};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		bubbleSort(a);
		System.out.println("after sorting");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
