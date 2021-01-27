package com.vti.entity;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	
	public Circle() {
		super();
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return radius;
	}


	@Override
	public String toString() {
		return "Ass4Ex4Q2_Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
