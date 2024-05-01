package com.sunbeam;

public class ReverseString {

	public static void main(String[] args) {
		String str1 = "Sunbeam";
		// 1. by charAt(i) method
		String result = "";
		System.out.println("Original String:- "+str1);
		for (int i = 0; i < str1.length();i++) {
			result = str1.charAt(i) + result;
		}
		System.out.println("Reverse String:- "+result);
		
		// 2. by reverse method of StringBuffer and StringBuilder
		StringBuffer sbf1 = new StringBuffer(str1);
		System.out.println("Reverse String by reverse method:- "+sbf1.reverse());
	}
	
}
