import java.util.Scanner;

public class CreditLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acctNumber;
		int pendingBalance;
		int totalItems;
		int totalCredits;
		int allowedCredit;
		int newBalance;
		
		try {
			System.out.print("Enter account number:- ");
			acctNumber = sc.nextInt();
			System.out.print("Enter pending balance:- ");
			pendingBalance = sc.nextInt();
			System.out.print("Enter total items:- ");
			totalItems = sc.nextInt();
			System.out.print("Enter totalCredits:- ");
			totalCredits = sc.nextInt();
			System.out.print("Enter allowed credit limit:- ");
			allowedCredit = sc.nextInt();
			newBalance = pendingBalance + totalItems - totalCredits;
			if(newBalance < allowedCredit) {
				System.out.println("Your new balance = "+newBalance);
			}else {
				System.out.println("Credit limit exceeded");
			}
		}catch(Exception ex) {
			System.out.println(ex +":- Please enter correct value");
}

	}

}
