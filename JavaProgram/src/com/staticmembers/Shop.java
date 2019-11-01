package com.staticmembers;

public class Shop {

	public static void main(String[] args) {
		System.out.println("marker price "+Marker.price+" marker color "+Marker.color);//default values
		Marker.color="black";
		Marker.price=100;
		Marker.color="blue";//replaces previously initialized values
		Marker.price=80;
		Marker.writting();
		System.out.println("marker Price   "+  Marker.price  +"  marker color    "+  Marker.color);//initialized values
		
		// TODO Auto-generated method stub

	}

}
