import java.util.Scanner;

public class DoubleAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1;
		double d2;
//		
		System.out.print("Enter value D1:- ");
		try {
				d1 = sc.nextDouble();
				System.out.print("Enter value D2:- ");
				try {
					d2 = sc.nextDouble();
					System.out.println("Average = "+((d1+d2)/2));
				}catch(Exception ex) {
					System.out.println(ex + ":-Please enter double value for D2");
				}
		}catch(Exception ex) {
			System.out.println(ex + ":-Please enter double value for D1");
		}
	}
}
