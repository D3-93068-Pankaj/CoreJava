package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	static int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu Driven Program for Fruits!");
		System.out.println("0. Exit");
		System.out.println("1. Mango");
		System.out.println("2. Apple");
		System.out.println("3. Orange");
		System.out.println("4. Display all fruits in the basket");
		System.out.println("5. Display the name , color and taste of the fruit");
		System.out.println("6. Display tastes of all stale fruits");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all fruits as stale");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the size of the basket: ");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int count = 0;
		while((choice = menuList())!=0 && count<basket.length) {
			switch(choice) {
			case 1:
				if(count<basket.length) {
					basket[count++] = new Mango("Mango", 250, "Yellow");
					System.out.println("A mango has been added to the basket!");
				}
				else {
					System.out.println("Basket is full!");
				}
				break;					
			
			
			case 2:
				if(count<basket.length) {
					basket[count++] = new Apple("Apple", 250, "Red");
					System.out.println("An apple has been added to the basket!");
				}
				else {
					System.out.println("Basket is full!");
				}
				break;					
				
				
			case 3:
				if(count<basket.length) {
					basket[count++] = new Orange("Orange", 250, "Orange");
					System.out.println("A orange has been added to the basket!");
				}
				else {
					System.out.println("basket is full!");
				}
				break;
				
				
			case 4:				
				if(basket.length>0) {
					System.out.println("The fruits in the basket are: ");
					for(Fruit f : basket) {
						if(f!=null)
							System.out.println(f.toString());
					}					
				}
				else 
					System.out.println("The basket is empty");
				break;
				
				
			case 5:
				if(basket.length>0) {
					for(Fruit f : basket) {
						if(f!=null)
							System.out.println("Name: "+f.getName()+", Color: "+f.getColor()+", Taste: "+f.taste());	
					}					
				}
				else 
					System.out.println("The basket is empty");
				break;
			
			
			case 6:
				if(basket.length>0) {
					for(Fruit f : basket) {
						if(f!=null)
							System.out.println("Fruit: "+f.getName()+", Taste: "+f.taste());
					}			
				}
				else 
					System.out.println("The basket is empty");
				
				break;
				
				
			case 7:
				if(basket.length>0) {
					System.out.println("Enter the index of the fruit: ");
					int index = sc.nextInt();
					if(index>=0 && index<basket.length && basket[index]!=null) {
						basket[index].setIsFresh(false);
						System.out.println(basket[index].getName()+" has been set to stale");
					}
				}
				else
					System.out.println("The basket is empty");
				break;					
			
				
			case 8:
				if(basket.length>0) {
					for(Fruit f : basket) {
						if(f!=null)
						f.setIsFresh(false);
					}
				}
				else {
					System.out.println("The basket is empty");
				}
			}

		}
	}
}
	


