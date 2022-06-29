package com.mani.placements;

public class TriangleDraw {

	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw() {
		System.out.println("Triangle Drawn: ");
		System.out.println(getType());
	}
}
