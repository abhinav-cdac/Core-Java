package com.sunbeam;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
}
