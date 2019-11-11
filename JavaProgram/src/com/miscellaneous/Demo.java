package com.miscellaneous;

public class Demo {
	int i;
	double b;
	void display()
	{
		
		System.out.println(i);
		System.out.println(b);
	}
	static Demo add(Demo a)
	{
		
		a.i=30;
		a.b=20.0;
		System.out.println(a.i);
		System.out.println(a.b);

		return a;
		}
      

	public static void main(String[] args) {
		Demo ob=new Demo();
		Demo.add(ob).display();
		
		
		// TODO Auto-generated method stub

	}

}
