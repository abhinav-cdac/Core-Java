import java.util.Scanner;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	private double amount;
	// Constructor 
	public Invoice(){
		this.partNumber = "";
		this.partDescription = "";
		this.quantity = 0;
		this.price = 0;
	}
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(quantity<0) {
			this.quantity = 0;
		}else {
			this.quantity = quantity;
		}
		if(price<0) {
			this.price = 0;
		}else {
			this.price = price;
		}
	}

	// Getter and setter
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity < 0 ? 0 : quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price < 0 ? 0 : price;
	}
	public double calculateAmount() {
		amount = quantity * price;
		return amount ;
	}
	

}
