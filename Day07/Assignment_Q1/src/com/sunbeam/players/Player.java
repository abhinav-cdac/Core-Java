package com.sunbeam.players;

import java.util.Scanner;

public abstract class Player {
	private final int id;
	private String name;
	private int age;
	private int matchesPlayed;

	// Constructor
	public Player(int id) {
		this.id = id;
	}
	// Getter-Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getId() {
		return id;
	}
	// Facilitators
	public void accept(Scanner sc) {
		System.out.println("Enter Player Name:- ");
		this.name = sc.next();
		System.out.println("Enter Player Age:- ");
		this.age = sc.nextInt();
		System.out.println("Enter the number of matches played:- ");
		this.matchesPlayed = sc.nextInt();
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed + "]";
	}
	@Override
	abstract public boolean equals(Object obj);
	

}
