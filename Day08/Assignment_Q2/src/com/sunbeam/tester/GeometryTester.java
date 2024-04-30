package com.sunbeam.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sunbeam.exceptions.InvalidGeometryExceptions;
import com.sunbeam.geometry.Circle;

public class GeometryTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		
		try {
			System.out.println("Enter Diameter:- ");
			c1.setDiameter(sc.nextDouble());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
