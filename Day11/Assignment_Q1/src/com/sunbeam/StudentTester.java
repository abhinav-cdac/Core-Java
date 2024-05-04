package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class StudentTester {
	public static void menu(Scanner sc) {
		System.out.println("Welcome to Student Database");
		System.out.println("0. EXIT");
		System.out.println("1. ADD STUDENTS");
		System.out.println("2. DISPLAY STUDENTS BASED ON ROLL NO.");
		System.out.println("3. DISPLAY STUDENTS BASED ON NAME");
		System.out.println("4. DISPLAY STUDENTS BASED ON MARKS");
		System.out.println("5. DISPLAY STUDENTS BASED ON COURSE");
		System.out.print("Enter your choice:: ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] srr = new Student[2];
		int counter = 0;
		Collection<Student>  students = new ArrayList<Student>();
		while (true) {
			menu(sc);
			int choice = sc.nextInt();
			switch (choice) {
			case 1: // Add students
				if (srr != null && counter != srr.length) {
					students.add(new Student());
					srr[counter] = new Student();
					srr[counter].accept(sc);
					counter++;
				}else {
					System.out.println("Student database is full");
				}
				break;
			case 2: // Sorting based on the roll no
				System.out.println("Sorting based on roll no");
				Arrays.sort(srr);
				for (Student student : srr) {
					System.out.println(student);
				}
				break;
			case 3:
				System.out.println("Sorting based on roll no");
				Arrays.sort(srr, new StudentNameComparator());
				for (Student student : srr) {
					System.out.println(student);
				}
				break;
			case 4:
				System.out.println("Sorting based on roll no");
				Arrays.sort(srr, new StudentMarksComparator());
				for (Student student : srr) {
					System.out.println(student);
				}
				break;
			case 5:
				System.out.println("Sorting based on roll no");
				Arrays.sort(srr, new StudentCourseComparator());
				for (Student student : srr) {
					System.out.println(student);
				}
				break;
			case 0:  // Exit
				System.out.println("Thank You!!!!");
				return;
			default: 
				System.out.println("Invalid choice");
				break;
			}
		}
		

	}
}
