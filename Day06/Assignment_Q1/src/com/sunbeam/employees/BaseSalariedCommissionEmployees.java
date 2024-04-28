package com.sunbeam.employees;

import java.util.Scanner;

public class BaseSalariedCommissionEmployees extends CommisionEmployees {
	// Fields
	private double baseSalary;

	// Constructor
	public BaseSalariedCommissionEmployees() {
		super();
	}
	// Facilitators
	@Override
	public void accept(Scanner sc) {
		try {
			super.accept(sc);
			System.out.println("Enter Base Salary:- ");
			this.baseSalary = sc.nextDouble();
		} catch (Exception e) {
			System.out.println(e + ":- Please Give Correct Input");
		}
	}

	@Override
	public String toString() {
		return "Base Salaried " + commonToString() + "\nBase Salary:- " + baseSalary + "\nReward(10% of Base Salary):- "
				+ baseSalary * .1 + "\nTotal Salary:- " + totalSalary() + "\n";
	}
	@Override
	public double totalSalary() {
		return baseSalary * 1.1 + super.totalSalary();
	}
}
