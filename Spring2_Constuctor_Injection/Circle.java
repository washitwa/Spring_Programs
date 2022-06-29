package com.mani.placements;

public class Circle {
	
	String type;
	float radius;
	
	public Circle(String type, float radius) {
		this.type = type;
		this.radius = radius;
	}
	public String getType() {
		return type;
	}
	
	public void draw() {
		System.out.println(getType());
		System.out.println("Drawn");
		System.out.println("The area of the circle is: "+(3.14*radius*radius));
		
	}
}
