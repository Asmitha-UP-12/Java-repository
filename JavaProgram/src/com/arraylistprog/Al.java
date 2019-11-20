package com.arraylistprog;
import java.util.ArrayList;

public class Al {
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(new Bike("pink",120));
		ls.add(new Emp("as",123));
		ls.add(new Movie("KGF",4.0));
		ls.add(10);
		System.out.println(ls);
		
	for(int i=0;i<ls.size();i++)
	{
		Object x=ls.get(i);
		if(x instanceof Bike)
		{
			System.out.println(((Bike)x).color);
			System.out.println(((Bike)x).mileage);
			
		}
		if(x instanceof Emp)
		{
			System.out.println(((Emp)x).id);
			System.out.println(((Emp)x).name);
		}
		if(x instanceof Movie)
		{
			System.out.println(((Movie)x).name);
			System.out.println(((Movie)x).rating);
		}
		if(x instanceof Integer)
		{
			Integer p=(Integer)x;
			System.out.println(p);
		}
		
	}

}
}
