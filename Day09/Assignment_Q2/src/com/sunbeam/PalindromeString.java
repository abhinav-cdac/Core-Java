package com.sunbeam;

import java.util.Scanner;

public class PalindromeString {
	public static void isPalindrome(String s) {
		s = s.toLowerCase();
		String palindrome = "";
		for(int i = 0; i<s.length();i++) {
			palindrome = s.charAt(i) + palindrome;
		}
		if(palindrome.equals(s)){
			System.out.println("Entered string is a palindrome");
		}else {
			System.out.println("Entered string is not a palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:- ");
		isPalindrome(sc.nextLine());
	}
}
