package com.sunbeam.employees;

import java.util.Scanner;

public abstract class Employee {
    // Fields
    private String firstName;
    private String lastName;
    private int SSN; // Social Security Number

    // Constructor
    public Employee() {
    }

    public Employee(String firstName, String lastName, int sSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        SSN = sSN;
    }

    // Setters-Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int sSN) {
        SSN = sSN;
    }

    // Facilitator(s)
    public void accept(Scanner sc) {
    		System.out.println("Enter First Name:- ");
            this.firstName = sc.next();
            System.out.println("Enter Last Name:- ");
            this.lastName = sc.next();
            System.out.println("Enter Social Security Number:- ");
            this.SSN = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Name = " + firstName +" "+ lastName + "\nSSN = "+SSN+",";
    }

    public abstract double totalSalary();
}