import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Invoice i1 = new Invoice();
		
		System.out.print("Enter part number:- ");
		i1.setPartNumber(sc.next());
		System.out.print("Enter part description:- ");
		i1.setPartDescription(sc.next());
		System.out.print("Enter quantity:- ");
		i1.setQuantity(sc.nextInt());
		System.out.print("Enter price per item:- ");
		i1.setPrice(sc.nextDouble());
		
		System.out.println("-----------Invoice Bill-----------");
		System.out.println("Part Number:- " + i1.getPartNumber());
		System.out.println("Part Description:- " + i1.getPartDescription());
		System.out.println("Quantity:- " + i1.getQuantity());
		System.out.println("Price per item:- " + i1.getPrice());
		System.out.println("----------------------------------");
		System.out.println("Total Amount:- " + i1.calculateAmount());

	}

}
