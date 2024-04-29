package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.players.Cricketer;
import com.sunbeam.players.Player;

public class Program {
	public enum PlayerMenu {
		EXIT, CREATE_PLAYER_DATABASE, ADD_PLAYER, VIEW_TEAM_STATS, VIEW_TOTAL_MATCHES_PLAYED, INVALID_INPUT
	}

	public static PlayerMenu menu(Scanner sc) {
		System.out.println("---------Player Menu---------");
		System.out.println("0. EXIT");
		System.out.println("1. CREATE PLAYER DATABASE");
		System.out.println("2. ADD PLAYER");
		System.out.println("3. VIEW TEAM STATS");
		System.out.println("4. VIEW TOTAL MATCHES PLAYED");
		System.out.print("ENTER YOUR CHOICE:- ");
		try {
			int choice = sc.nextInt();
			if (choice < 0 || choice > (PlayerMenu.values().length - 2)) {
				System.out.println("Invalid menu option. Please enter a number between 0 and 4");
				sc.nextLine();
				return PlayerMenu.INVALID_INPUT;
			} else {
				return PlayerMenu.values()[choice];
			}
		} catch (Exception e) {
			System.out.println("Invalid input! Please enter a valid menu option");
			sc.nextLine();
			return PlayerMenu.INVALID_INPUT;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player[] players = null;
		int counter = 0;
		int[] stats = new int[] { 0, 0, 0 };
		while (true) {
			PlayerMenu choice = menu(sc);
			switch (choice) {
			case CREATE_PLAYER_DATABASE:
					players=null; 
					System.out.println("Enter Team Size:- ");
					players = new Player[sc.nextInt()];
					counter = 0;
				break;
			case ADD_PLAYER:
				try {
					if (counter < players.length) {
						players[counter] = new Cricketer();
						players[counter].accept(sc);
						if(players[counter] instanceof Cricketer) {
							Cricketer c = (Cricketer)players[counter];
							stats[0] += c.getRuns();
							stats[1] += c.getWickets();
							stats[2] += c.getMatchesPlayed();
							counter++;
						}
						} else {
						System.out.println("Players database is full");
					}
				} catch (Exception e) {
					System.out.println("First Create Players Database");
				}
				break;
			case VIEW_TEAM_STATS:
				if(players != null) {
					System.out.println("----Total Stats by Team---- ");
					System.out.println("[Total Runs : " + stats[0]+"]");
					System.out.println("Total Wickets : " + stats[1]+"]");
					System.out.println("Total Matches Played : " + stats[2]+"]");
				}
				break;
			case VIEW_TOTAL_MATCHES_PLAYED:
				for (Player player : players) {
					if(player!=null) {
						System.out.println("[Name : " + player.getName() + ", Matches Played : " + player.getMatchesPlayed()+"]");
					}
				}
				break;
			case EXIT:
				System.out.println("Thank You!!!");
				sc.close();
				return;
			default:
				break;

			}
		}
	}
}
