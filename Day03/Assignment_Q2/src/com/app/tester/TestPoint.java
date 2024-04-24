package com.app.tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first co-ordinates:- ");
		Point2D p1 = new Point2D(sc.nextDouble(),sc.nextDouble());
		
		System.out.println("Enter Second co-ordinates:- ");
		Point2D p2 = new Point2D(sc.nextDouble(),sc.nextDouble());
		
		System.out.println("Point P1:: " + p1.getDetails());
		System.out.println("Point P2:: " + p2.getDetails());
		
		System.out.println("Distance between p1 and p2 = " + p1.calculateDistance(p2));
	}

}
