package main;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import utils.SortByPrice;
import domain.Book;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static List<Book> bookList = new ArrayList<>();
	
	public static int menuList() {
		System.out.println("Menu Driven Program for Library Management System");
		System.out.println("0. Exit");
		System.out.println("1. Add a book");
		System.out.println("2. Display all books(Forward Order)");
		System.out.println("3. Display all books (Reverse Order)");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. Sort all books in descending order");
		return sc.nextInt();
	}
	
	public static void addBook() {
		sc.nextLine();
		System.out.print("Enter the ISBN: ");
		String isbn = sc.nextLine();
		System.out.print("Enter the Price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the name of the author: ");
		String authorName = sc.nextLine();
		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();
		bookList.add(new Book(isbn, price, authorName, quantity));
		System.out.println("Book Added Successfully!");
	}
	
	public static void displayForward() {
		Iterator<Book> trav = bookList.iterator();
		while(trav.hasNext()) {
			Book b = trav.next();
			System.out.println(b.toString());
		}
	}
	
	public static void displayBackward() {
		ListIterator<Book> trav = bookList.listIterator(bookList.size());
		while(trav.hasPrevious()) {
			Book b = trav.previous();
			System.out.println(b.toString());
		}
	}
	
	public static void deleteBook() {
		sc.nextLine();
		Book key = new Book();
		System.out.print("Enter the ISBN: ");
		String isbn = sc.nextLine();
		key.setIsbn(isbn);
		if(bookList.contains(key)) {
			bookList.remove(key);
		}
		System.out.println("Book Deleted Successfully!");
	}

	public static void main(String[] args) {
		int choice;
		while((choice = menuList())!=0) {
			switch(choice) {
			case 0:
				return;
			
			case 1:
				addBook();
				break;
				
			case 2:
				if(bookList.size()!=0)
					displayForward();
				else
					System.out.println("The Library is Empty!");
				break;
			
			case 3:
				if(bookList.size()!=0)
					displayBackward();
				else
					System.out.println("The Library is Empty!");
				break;
				
			case 4:
				if(bookList.size()!=0)
					deleteBook();
				else
					System.out.println("The Library is Empty!");
				break;
				
			case 5:
				if(bookList.size()!=0)
					bookList.sort(new SortByPrice());
					for(Book b : bookList) {
						System.out.println(b.toString());
					}
				break;
			default:
				System.out.println("Please Enter a Proper value!");
				break;
			}
		}

	}
	
	
}
