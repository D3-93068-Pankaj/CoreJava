package StringAssignments;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be checked as palindrome: ");
		String str = sc.next();
		if(isPalindrome(str)) {
			System.out.println("The string is a palindrome!");
		}
		else {
			System.out.println("The string is not a palindrome!");
		}
	}

	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		boolean flag = true;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		return flag;
	}
}
