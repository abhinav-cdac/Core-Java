package com.sunbeam.tester;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sunbeam.Strings;
import com.sunbeam.exceptions.ExceptionLineTooLong;

public class StringLengthTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Strings s1 = new Strings();
		try {
			System.out.println("Enter Message:- ");
			s1.setMessage(sc.nextLine());
		} catch (ExceptionLineTooLong e ) {
			e.printStackTrace();
		}
	}

}
