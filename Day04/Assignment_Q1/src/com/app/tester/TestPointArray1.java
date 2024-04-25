package com.app.tester;

import com.app.geometry.*;
import java.util.Scanner;

public class TestPointArray1 {
	static void pointMenu() {
		System.out.println();
		System.out.println("-------------Points Menu--------------");
		System.out.println("1. Display specific point detail");
		System.out.println("2. Display all points"); // use for-each loop
		System.out.println("3. Display distance between two points");
		System.out.println("4. Exit");
		System.out.print("Enter your choice:- ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of points you want to plot:- ");
		Point2D[] points = new Point2D[sc.nextInt()];
			
		for(int i = 0; i < points.length; i++) {
			System.out.println("Enter X co-ord and Y co-ord for Point "+i);
			points[i] = new Point2D(sc.nextDouble(),sc.nextDouble());
		}
		
		while(true) {
			pointMenu();
			int choice;
			switch(choice = sc.nextInt()) {
			case 1 : 
				try {
					System.out.print("\nEnter the index:- ");
					int i = sc.nextInt();
					System.out.println("\nPoint "+i+":: "+points[i].getDetails());
					}catch(Exception e) {
					System.out.println("Invalid index. Try again\n");
				}
				break;
			case 2 : 
				int count = 0;
				System.out.println();
				for(Point2D point :points) {
					System.out.println("Point "+count+":: "+point.getDetails());
					count++;
				}
				break;
			case 3 :
				try {
					System.out.print("\nEnter start and end point index:- ");
					points[sc.nextInt()].calculateDistance(points[sc.nextInt()]);
				}catch (Exception e) {
					System.out.println("Invalid Index! Try again\n");
				}
				break;
			case 4 : 
				System.out.println("Thank You!!!\n");
				return;
			default: 
				System.out.println("Invalid choice!!! Try again\n");
			}
			
		}
	}

}

/*
 * System.out.println("Enter first co-ordinates:- "); Point2D p1 = new
 * Point2D(sc.nextDouble(),sc.nextDouble());
 * 
 * System.out.println("Enter Second co-ordinates:- "); Point2D p2 = new
 * Point2D(sc.nextDouble(),sc.nextDouble());
 * 
 * System.out.println("Point P1:: " + p1.getDetails());
 * System.out.println("Point P2:: " + p2.getDetails());
 * 
 * System.out.println("Distance between p1 and p2 = " +
 * p1.calculateDistance(p2));
 */
