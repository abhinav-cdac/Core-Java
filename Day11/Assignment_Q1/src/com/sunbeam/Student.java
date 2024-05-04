package com.sunbeam;
import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private double marks;
	private String course;
	
	public Student() {
		super();
	}
	public Student(int rollno, String name, double marks, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student accept(Scanner sc) {
		System.out.println("Enter Roll Number:- ");
		this.rollno = sc.nextInt();
		System.out.println("Enter Name:- ");
		this.name = sc.next();
		System.out.println("Enter Marks:- ");
		this.marks = sc.nextDouble();
		System.out.println("Enter Course:- ");
		this.course = sc.next();
		return this;
	}
	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
}
