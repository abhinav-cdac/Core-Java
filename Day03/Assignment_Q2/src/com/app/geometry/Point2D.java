package com.app.geometry;

public class Point2D {
	// field members
	private double x;
	private double y;
	private double distance;
	// Constructor
	public Point2D(){}
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// Methods
	public String getDetails() {
		return "X:- " + x + ", Y:- " + y;
	}
	public boolean isEqual(Point2D p2) {
		if(this.x == p2.x && this.y == p2.y) {
			return true;
		}
		else {
			return false;
		}
	}
	public double calculateDistance(Point2D p2) {
		if(this.isEqual(p2)) {
			System.out.println("Points are located at the same position");
			return 0;
		}else {
			distance = Math.round(Math.sqrt((Math.pow((p2.x-this.x),2)+(Math.pow((p2.y-this.y),2)))));
			return distance;
		}
		
	}
	
}
