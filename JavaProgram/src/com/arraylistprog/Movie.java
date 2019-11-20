package com.arraylistprog;

public class Movie {
	String name;
	double rating;
	public Movie(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	public String toString()
	{
		return "["+name+","+rating+"]";
	}

}
