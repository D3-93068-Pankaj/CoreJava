package sunbeam.assignment2;
import java.util.Scanner;

public class InvoiceTest {	

		public static void main(String[] args) {
			Invoice i1 = new Invoice("1", "Pen", 1, 10.0);
			double total1 = i1.calculateInvoiceAmount();
			System.out.println(total1);
			Invoice i2 = new Invoice("2", "Notebooks", 3, 50);
			double total2 = i2.calculateInvoiceAmount();
			System.out.println(total2);
			i2.printInvoice();
		}
		
}


	class Invoice{
		private String serialNumber;
		private String description;
		private int quantity;
		private double price;
		
		public Invoice() {
			this.serialNumber = "0";
			this.description = "";
			this.quantity = 0;
			this.price = 0.0;
		}
		
		public Invoice(String serialNumber, String description, int quantity, double price) {
			this.serialNumber = serialNumber;
			this.description = description;
			this.quantity = quantity;
			this.price = price;
		}
		
		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}
		
		public String getSerialNumber() {
			return this.serialNumber;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public String getDescription() {
			return this.description;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public int getQuantity() {
			return this.quantity;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public double getPrice() {
			return this.price;
		}
		
		public double calculateInvoiceAmount() {
			if(this.quantity<0) {
				this.quantity = 0;
			}
			else if(this.price<0) {
				this.price = 0.0;
			}
			
			double totalAmount = this.quantity * this.price;
			return totalAmount;			
			
		}
		
		public void acceptInvoice() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the serial number: ");
			this.serialNumber = sc.next();
			System.out.println("Enter the description: ");
			this.description = sc.next();
			System.out.println("Enter the quantity: ");
			this.quantity = sc.nextInt();
			System.out.println("Enter the price: ");
			this.price = sc.nextDouble();
		}
		
		
		public void printInvoice() {
			System.out.println("The Serial Number is : "+this.serialNumber);
			System.out.println("The Description is : "+this.description);
			System.out.println("The Quantity is : "+this.quantity);
			System.out.println("The Price/item is : "+this.price);
		}
		
	}

