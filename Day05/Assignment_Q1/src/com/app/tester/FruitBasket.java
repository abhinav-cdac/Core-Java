package com.app.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {
	public enum FRUITMENU {
		EXIT, ADD_MANGO, ADD_ORANGE, ADD_APPLE, DISPLAY_NAMES_OF_ALL_FRUITS, DISPLAY_DETAILS_OF_ALL_FRESH_FRUITS,
		MAKE_FRUIT_STALE, DISPLAY_TASTE_OF_ALL_STALE_FRUITS, MARK_ALL_SOUR_FRUIT_STALE
	}

	public static FRUITMENU fruitMenu(Scanner sc) {

		System.out.println("--------------Fruit's Basket--------------");
		System.out.println("0. EXIT");
		System.out.println("1. ADD_MANGO");
		System.out.println("2. ADD_ORANGE");
		System.out.println("3. ADD_APPLE");
		System.out.println("4. DISPLAY_NAMES_OF_ALL_FRUITS");
		System.out.println("5. DISPLAY_DETAILS_OF_ALL_FRESH_FRUITS");
		System.out.println("6. MAKE_FRUIT_STALE");
		System.out.println("7. DISPLAY_TASTE_OF_ALL_STALE_FRUITS");
		System.out.println("8. MARK_ALL_SOUR_FRUIT_STALE");
		System.out.print("ENTER YOUR CHOICE:- ");
		int choice = sc.nextInt();
		return FRUITMENU.values()[choice];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		boolean flag = false;
		System.out.println("Enter the basket size:- ");

		Fruit[] basket = new Fruit[sc.nextInt()];

		while (true) {
			FRUITMENU choice = fruitMenu(sc);
			switch (choice) {
			case EXIT:
				System.out.println("Thank You!!!");
				return;
			case ADD_APPLE:
				if (counter < basket.length) {
					System.out.println("Enter color, weight and name:- ");
					basket[counter++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Basket is full");
				}
				break;
			case ADD_MANGO:
				if (counter < basket.length) {
					System.out.println("Enter color, weight and name:- ");
					basket[counter++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Basket is full");
				}
				break;
			case ADD_ORANGE:
				System.out.println("Enter color, weight and name:- ");
				if (counter < basket.length) {
					basket[counter++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
				} else {
					System.out.println("Basket is full");
				}
				break;
			case DISPLAY_DETAILS_OF_ALL_FRESH_FRUITS:
				for (Fruit f1 : basket) {
					if (f1 != null && f1.isFresh()) {
						System.out.println(f1.toString() + "[Taste = " + f1.taste() + "]");
					}
				}
				break;
			case DISPLAY_NAMES_OF_ALL_FRUITS:
				for (Fruit f2 : basket) {
					if (f2 != null) {
						System.out.println("Name:- " + f2.getName());
					}
				}
				break;
			case DISPLAY_TASTE_OF_ALL_STALE_FRUITS:
				for (Fruit f3 : basket) {
					if (f3 != null && f3.isFresh() != true) {
						System.out.println("Taste:- " + f3.taste());
					}
				}
				break;
			case MAKE_FRUIT_STALE:
				System.out.print("Enter index of fruit:- ");
				try {
					int index = sc.nextInt();
					if (basket[index].isFresh()) {
						basket[index].setFresh(false);
						System.out.println("Fruit stale successfully");
					}
				} catch (Exception e) {
					System.out.println(e + ":- Enter valid index");
				}

				break;
			case MARK_ALL_SOUR_FRUIT_STALE:
				try {
					for (Fruit fruit : basket) {
						if (fruit != null && fruit.taste() == "sour") {
							flag = true;
							fruit.setFresh(false);
						}
					}
					if (flag == true) {
						System.out.println("All sour fruit become stale");
					}
				} catch (Exception e) {
					System.out.println(e + ":- Invalid choice");
				}
				break;
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}
		}
	}
}
