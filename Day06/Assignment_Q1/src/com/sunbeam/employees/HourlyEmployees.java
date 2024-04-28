package com.sunbeam.employees;

import java.util.Scanner;

public class HourlyEmployees extends Employee {
	// Fields
	private double wage; // unit :- Rs/hr
	private int hrs;
	//Constructor
	public HourlyEmployees() {
		super();
	}
	// Facilitator
	@Override
	public void accept(Scanner sc) {
		try {
			super.accept(sc);
			System.out.println("Enter Wage(Rs./hr):- ");
			wage = sc.nextDouble();
			System.out.println("Enter Hour(s):- ");
			hrs = sc.nextInt();
		} catch (Exception e) {
			System.out.println(e + ":- Please Give Correct Input");
		}
	}

	@Override
	public double totalSalary() {
		return hrs <= 40 ? wage * hrs : wage * hrs * 1.5;
	}

	@Override
	public String toString() {
		return "Hourly Employee:-\n" + super.toString() + "\nWages = " + wage + "\nTotal Salary = " + totalSalary()
				+ "\n";
	}
}
