package com.sunbeam.geometry;

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
			System.out.println("Can't calculate distance! Points located at same location");
			return 0;
		}else {
			distance = Math.sqrt((Math.pow((p2.x-this.x),2)+(Math.pow((p2.y-this.y),2))));
			distance = Math.round(distance*100)/100.0;
			System.out.println("\nDistance between points:- "+distance+" unit.\n");
			return distance;
		}
		
	}
	
}
