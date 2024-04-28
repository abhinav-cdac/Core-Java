package com.sunbeam.employees;

import java.util.Scanner;

public class SalariedEmployees extends Employee {
	// Fields
	private double weeklySalary;

	// Constructor
	public SalariedEmployees() {
		super();
	}

	// Facilitators
	@Override
	public void accept(Scanner sc) {
		try {
			super.accept(sc);
			System.out.println("Enter Weekly Salary:- ");
			this.weeklySalary = sc.nextDouble();
		} catch (Exception e) {
			System.out.println(e + ":- Please Give Correct Input");
		}
	}

	@Override
	public double totalSalary() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return "Salaried Employee:-\n" + super.toString() + "\nWeekly Salary = " + weeklySalary + "\nTotal Salary = "
				+ totalSalary() + "\n";
	}

}