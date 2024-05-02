package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		Product[] srr = new Product[10];
		
		
		
		
		
		srr[0] = new Product(1,"lays","chips",100.3);
		srr[1] = new Product(2,"classmate","notebook",50.0);
		srr[2] = new Product(3,"coke","drink",100.3);
		srr[3] = new Product(4,"burger","snacks",100.3);
		srr[4] = new Product(5,"bata","shoes",100.3);
		srr[5] = new Product(6,"titan","watch",100.3);
		srr[6] = new Product(7,"wrogn","cloth",100.3);
		srr[7] = new Product(8,"aspire7.0","laptop",100.3);
		srr[8] = new Product(9,"nord","mobile",100.3);
		srr[9] = new Product(10,"bisleri","water",100.3);
		
		
		
		System.out.println("Before sorting:- ");
		for(Product product:srr) {
			System.out.println(product);
		}
		Arrays.sort(srr);
		System.out.println("After sorting:- ");
		for(Product product:srr) {
			System.out.println(product);
		}
	}

}
