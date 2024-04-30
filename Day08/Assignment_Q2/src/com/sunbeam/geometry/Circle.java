package com.sunbeam.geometry;

import com.sunbeam.exceptions.InvalidGeometryExceptions;

public class Circle extends Exception {
	private Point2D centerPoint;
	private double diameter;
	// Constructors
	public Circle() {
		this.centerPoint = new Point2D(0,0);
		this.diameter = 100;
	}
	// setter
	public void setDiameter(double diameter) throws Exception{
		if(diameter < 0) {
			throw new Exception((new InvalidGeometryExceptions("Diameter of Circle can't be negative")));
		}
		this.diameter = diameter;
	}
	// Getter
	public double getDiameter() {
		return diameter;
	}
}
