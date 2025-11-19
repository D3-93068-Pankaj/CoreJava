package sunbeam.assignment2;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(20, 50, 1300);
		d1.acceptDate();
		d1.displayDate();
	}

}

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public Date(int day, int month, int year) {
		if(day>0 && day<32) {
			this.day = day;
		}
		else {
			this.day = 1;
		}
		if(month>0 && month<13) {
			this.month = month;
		}
		else {
			this.month = 1;
		}
		if(year>0) {
			this.year = year;
		}
		else {
			this.year = 2000;
		}
	}
	
	public void setDay(int day) {
		if(day>0 && day<32) {
			this.day = day;
		}
		else {
			this.day = 1;
		}
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;
		}
		else {
			this.month = 1;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		if(year>0) {
			this.year = year;
		}
		else {
			this.year = 2000;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day: ");
		this.day = sc.nextInt();
		System.out.println("Enter Month: ");
		this.month = sc.nextInt();
		System.out.println("Enter Year: ");
		this.year = sc.nextInt();
	}
	
	public void displayDate() {
		System.out.println("The date is: "+this.day+"/"+this.month+"/"+this.year);
	}
}
