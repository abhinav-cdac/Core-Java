import java.util.Scanner;

public class FoodItems {

	public static void main(String[] args) {
		double totalBill = 0;
		int price =0;
		int quantity;
		double generateBill = 0;
		while(true) {
			FoodItems.Menu();
			int choice;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				price =70;
				break;
			case 2: 
				price = 20;
				break;
			case 3: 
				price = 30;
				break;
			case 4: 
				price = 30;
				break;
			case 5: 
				price = 70;
				break;
			case 6: 
				price = 80;
				break;
			case 7: 
				price = 15;
				break;
			case 8: 
				price = 50;
				break;
			case 9: 
				price = 90;
				break;
			case 10: 
				price = 100;
				break;
			case 11:
			    System.out.println("Your total bill:- "+ totalBill);
				return;
			default:
				System.out.println("Invalid choice!!");
				break;
			}
			System.out.print("Enter quantity:- ");
//			if(sc.hasNextInt()) {
				quantity = sc.nextInt();
				totalBill += quantity*price;
//			}
		}

	}
	static void Menu() {
		System.out.println("---------------Food Menu---------------");
		System.out.println("1. Dosa - ₹ 70/plate");
		System.out.println("2. Samosa - ₹ 20/plate");
		System.out.println("3. Idli - ₹ 30/plate");
		System.out.println("4. Upma - ₹ 30/plate");
		System.out.println("5. Uttapam ₹ 70/plate");
		System.out.println("6. Chole Bhature ₹ 80/plate");
		System.out.println("7. Dabeli ₹ 15/plate");
		System.out.println("8. Pav bhaji ₹ 50/plate");
		System.out.println("9. Manchurian ₹ 90/plate");
		System.out.println("10. Paneer Tikka ₹ 100/plate");
		System.out.println("11. Generate bill");
		System.out.println("----------------------------------------");
		System.out.print("Enter your choice:: ");
	}

}



/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, array and no need to display the food details. Only display the total of
orderd food)
*/