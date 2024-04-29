package com.sunbeam.players;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	private static int generateId = 100;
	private int runs;
	private int wickets;
	// Constructors 
	public Cricketer() {
		super(++generateId);
	}

	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Player Runs:- ");
		this.runs = sc.nextInt();
		System.out.println("Enter Player Wickets:- ");
		this.wickets = sc.nextInt();
	}
	


	@Override
	public int getWickets() {
		return wickets;
	}

	@Override
	public int getRuns() {
		return runs;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
