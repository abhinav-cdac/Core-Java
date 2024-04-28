package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.employees.BaseSalariedCommissionEmployees;
import com.sunbeam.employees.CommisionEmployees;
import com.sunbeam.employees.Employee;
import com.sunbeam.employees.HourlyEmployees;
import com.sunbeam.employees.SalariedEmployees;

public class PayrollCalculations {
	// Enum
	public enum PayrollMenu {
		EXIT, CREATE_EMPLOYEE_DATABASE, ADD_SALARIED_EMPLOYEE, ADD_HOURLY_PAID_EMPLOYEE, ADD_COMMISSION_EMPLOYEE,
		ADD_BASE_SALARIED_COMMISSION_EMPLOYEE, DISPLAY_TYPE_OF_EMPLOYEES, DISPLAY_DETAILS_ALL_EMPLOYEES,INVALID_INPUT

	}

	public static PayrollMenu menu(Scanner sc) {
	    System.out.println("------------PAYROLL CALCULATION MENU------------");
	    System.out.println("0. EXIT");
	    System.out.println("1. CREATE EMPLOYEE DATABASE");
	    System.out.println("2. ADD SALARIED EMPLOYEE");
	    System.out.println("3. ADD HOURLY PAID EMPLOYEE");
	    System.out.println("4. ADD COMMISSION EMPLOYEE");
	    System.out.println("5. ADD BASE SALARIED COMMISSION EMPLOYEE");
	    System.out.println("6. DISPLAY TYPE OF EMPLOYEES");
	    System.out.println("7. DISPLAY DETAILS OF ALL EMPLOYEES");
	    System.out.print("ENTER YOUR CHOICE: ");
	    try {
	        int choice = sc.nextInt();
	        if (choice < 0 || choice > 7) { 
	            System.out.println("Invalid menu option! Please enter a number between 0 and 7.");
	            sc.nextLine(); 
	            return PayrollMenu.INVALID_INPUT;
	        } else {
	            return PayrollMenu.values()[choice];
	        }
	    } catch (Exception e) {
	        System.out.println("Invalid input! Please enter a valid menu option.");
	        sc.nextLine(); // Consume the invalid input
	        return PayrollMenu.INVALID_INPUT;
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] employees = null;
		int counter = 0;

		while (true) {

			PayrollMenu choice = menu(sc);

			switch (choice) {
			case CREATE_EMPLOYEE_DATABASE:
				  if (employees == null) {
                      System.out.println("Enter Employee Size: ");
                      employees = new Employee[sc.nextInt()];
                      counter = 0;
                  } else {
                      System.out.println("Employee database already exists. Please add employees to the existing database.");
                  }
				break;
			case ADD_SALARIED_EMPLOYEE:
				try {
					if (counter < employees.length) {
						employees[counter] = new SalariedEmployees();
						employees[counter].accept(sc);
						counter++;
					} else {
						System.out.println("Employee database is full.");
					}

				} catch (Exception e) {
					System.out.println("First Create Employee Database");
				}
				break;
			case ADD_HOURLY_PAID_EMPLOYEE:
				try {
					if ( counter < employees.length) {
						employees[counter] = new HourlyEmployees();
						employees[counter].accept(sc);
						counter++;
					} else {
						System.out.println("Employee database is full.");
					}

				} catch (Exception e) {
					System.out.println("First Create Employee Database");
				}
				break;
			case ADD_COMMISSION_EMPLOYEE:
				try {
					if (counter < employees.length) {
						employees[counter] = new CommisionEmployees();
						employees[counter].accept(sc);
						counter++;
					} else {
						System.out.println("Employee database is full.");
					}
				} catch (Exception e) {
					System.out.println("First Create Employee Database");
				}
				break;
			case ADD_BASE_SALARIED_COMMISSION_EMPLOYEE:
				try {
					if (counter < employees.length) {
						employees[counter] = new BaseSalariedCommissionEmployees();
						employees[counter].accept(sc);
						counter++;
					} else {
						System.out.println("Employee database is full.");
					}

				} catch (Exception e) {
					System.out.println("First Create Employee Database");
				}
				break;
			case DISPLAY_TYPE_OF_EMPLOYEES:
				if (counter != 0) {
					for (int i = 0; i < counter; i++) {
						System.out.println("Employee " + (i + 1) + ": " + employees[i].getClass().getSimpleName());
					}
				} else {
					System.out.println("No Employee Database is present");
				}
				break;
			case DISPLAY_DETAILS_ALL_EMPLOYEES:
				if (counter != 0) {
					for (int i = 0; i < counter; i++) {
						System.out.println("Employee " + (i + 1) + ":");
						System.out.println(employees[i]);
					}
				} else {
					System.out.println("No Employee Database is present");
				}
				break;

			case EXIT:
				System.out.println("Thank you!!!");
				sc.close();
				return;
			default:
				break;
			}
		}
	}
}
