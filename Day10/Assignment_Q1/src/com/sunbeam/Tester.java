package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		Student[] srr = new Student[5];
		srr[0] = new Student(1,"Abhilash",50);
		srr[1] = new Student(5,"Abhinav",59);
		srr[2] = new Student(3,"Dipak",76);
		srr[3] = new Student(4,"Pritesh",80);
		srr[4] = new Student(2,"Navneet",89);
		
		System.out.println("Before sorting:- ");
		for(Student student:srr) {
			System.out.println(student);
		}
		Arrays.sort(srr);
		System.out.println("After sorting:- ");
		for(Student student:srr) {
			System.out.println(student);
		}
	}

}
