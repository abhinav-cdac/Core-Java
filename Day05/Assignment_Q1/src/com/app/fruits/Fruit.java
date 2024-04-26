package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	// Field Members
	private String color;
	private double weight;
	private String name;
	private boolean isFresh = true;
	
	// Constructor
	public Fruit() {
	}
	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	// Getters-Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	// Method
	public void accept(Scanner sc) {
		System.out.println("Enter the color of fruit:- ");
		this.color = sc.nextLine();
		System.out.println("Enter the name of fruit:- ");
		this.name = sc.nextLine();
		System.out.println("Enter the weight of fruit(in kgs):- ");
		this.weight = sc.nextDouble();
		this.isFresh = true;
	}
	public String taste() {
		return "no specific taste";
	}
	@Override
	public String toString() {
		return "Fruit [color= " + color + ", weight= " + weight + ", name= " + name + "]";
	}

	
	
}
