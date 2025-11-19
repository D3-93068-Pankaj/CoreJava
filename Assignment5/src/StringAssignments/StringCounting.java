package StringAssignments;

import java.util.Scanner;

public class StringCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of which you want to count the words: ");
		String str = sc.nextLine();
		System.out.printf("The number of words in the string are %d", countStringWords(str));
		sc.close();
	}

	public static int countStringWords(String str) {
		return str.trim().split(" ").length;
	}
}
