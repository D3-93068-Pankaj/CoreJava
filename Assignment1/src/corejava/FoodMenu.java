package corejava;

import java.util.Scanner;

public class FoodMenu {
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu for Food");
		System.out.println("0. Exit");
		System.out.println("1. Dosa; Price: Rs. 100");
		System.out.println("2. Samosa; Price: Rs. 15");
		System.out.println("3. Idli; Price: Rs. 20");
		System.out.println("4. Vada Pav; Price: Rs. 20");
		System.out.println("5. Pav Bhaji; Price: Rs. 25");
		System.out.println("6. Medu Vada; Price: Rs. 30");
		System.out.println("7. Uttapam; Price: Rs. 40");
		System.out.println("8. Gulab Jamun; Price: Rs. 10");
		System.out.println("9. Kachori; Price: Rs. 30");
		System.out.println("10. Jalebi; Price: Rs. 20");
		System.out.println("11. Generate the total bill");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice;
		int total = 0;
		while((choice = menu())!=0) {
			Scanner sc = new Scanner(System.in);
			switch(choice) {
			case 0:
				return;
				
			case 1:
				System.out.println("Enter Quantity of Dosa");
				int dosaQuantity = sc.nextInt();
				total += dosaQuantity*100;
				break;
				
			case 2:
				System.out.println("Enter Quantity of Samosa");
				int samosaQuantity = sc.nextInt();
				total += samosaQuantity*15;
				break;
				
			case 3:
				System.out.println("Enter quantity of Idli");
				int idliQuantity = sc.nextInt();
				total += idliQuantity*20;
				break;
				
			case 4:
				System.out.println("Enter quantity of Vada Pav");
				int vadapavQuantity = sc.nextInt(); 
				total += vadapavQuantity*20;
				break;
				
			case 5:
				System.out.println("Enter quantity of Pav Bhaji");
				int pavbhajiQuantity = sc.nextInt(); 
				total += pavbhajiQuantity*20;
				break;
				
			case 6:
				System.out.println("Enter quantity of Medu Vada");
				int meduvadaQuantity = sc.nextInt(); 
				total += meduvadaQuantity*20;
				break;
				
			case 7:
				System.out.println("Enter quantity of Uttapam");
				int uttapamQuantity = sc.nextInt(); 
				total += uttapamQuantity*20;
				break;
				
			case 8:
				System.out.println("Enter quantity of Gulab Jamun");
				int gulabjamunQuantity = sc.nextInt(); 
				total += gulabjamunQuantity*20;
				break;
				
			case 9:
				System.out.println("Enter quantity of Kachori");
				int kachoriQuantity = sc.nextInt(); 
				total += kachoriQuantity*20;
				break;
				
			case 10: 
				System.out.println("Enter quantity of Jalebi");
				int jalebiQuantity = sc.nextInt(); 
				total += jalebiQuantity*20;
				break;
				
			case 11:
				System.out.printf("The Total is: %d",total);
				return;
			}
		}
	}
}
