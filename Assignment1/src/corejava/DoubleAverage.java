package corejava;

import java.util.Scanner;

public class DoubleAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first double number: ");
		if(!sc.hasNextDouble()) {
			System.out.println("Error: value is not a double!");
			return;
		}
		double d1 = sc.nextDouble();
		if(!sc.hasNextDouble()) {
			System.out.println("Error: value is not a double!");
			return;
		}
		double d2 = sc.nextDouble();
		double avg = (d1+d2)/2;
		System.out.printf("The average is %.2f", avg);
	}

}
