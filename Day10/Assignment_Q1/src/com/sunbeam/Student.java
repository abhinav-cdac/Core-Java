package com.sunbeam;
public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private double marks;
	public Student() {
	}
	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		return Double.compare(o.marks, this.marks);
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
