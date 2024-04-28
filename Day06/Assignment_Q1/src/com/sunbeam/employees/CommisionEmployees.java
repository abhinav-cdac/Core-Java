package com.sunbeam.employees;

import java.util.Scanner;

public class CommisionEmployees extends Employee {
	// Fields
	private double grossSales;
	private double commissionRate;

	// Constructor
	public CommisionEmployees() {
		super();
	}

	// Getters
	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	// Facilitators
	@Override
	public void accept(Scanner sc) {
		try {
			super.accept(sc);
			System.out.println("Enter Gross Sales:- ");
			this.grossSales = sc.nextDouble();
			System.out.println("Enter Commission Rate");
			this.commissionRate = sc.nextDouble();
		} catch (Exception e) {
			System.out.println(e + ":- Please Give Correct Input");
		}

	}
	
	public String commonToString()
	{
		return "Commission Employee:-\n" + super.toString() + "\nGross Sale:- " + grossSales
				+ "\nCommission Rate:- " + commissionRate;
	}
	public String toString() {
		return commonToString() + "\nTotal Salary:- " + totalSalary() + "\n";
	}


	@Override
	public double totalSalary() {
		return grossSales * commissionRate;
	}
}

