import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		double totalMilesPerDay, costPerGallon,avgMilesPerGallon,parkingFeesPerDay,tollsPerDay;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Total Miles per day:- ");
			totalMilesPerDay= sc.nextDouble();
			System.out.print("Enter Cost per Gallon:- ");
			costPerGallon = sc.nextDouble();
			System.out.print("Enter Average Miles per Gallon:- ");
			avgMilesPerGallon = sc.nextDouble();
			System.out.print("Enter Parking fees per Day:- ");
			parkingFeesPerDay = sc.nextDouble();
			System.out.print("Enter Tolls per Day:- ");
			tollsPerDay = sc.nextDouble();
			System.out.println("Cost per day:- "+(costPerGallon*totalMilesPerDay/avgMilesPerGallon+parkingFeesPerDay+tollsPerDay));
		}
		catch(Exception e) {
			System.out.println(e + ":- Please enter correct value");
		}
	}

}
