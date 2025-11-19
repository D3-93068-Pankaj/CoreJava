package StringAssignments;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String str = sc.next();
		System.out.printf("The reverse is: %s", stringReverse(str));
	}
	
	
	public static String stringReverse(String str) {
		StringBuilder s = new StringBuilder(str);
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			char temp = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, temp);
			i++;
			j--;
		}
		return s.toString();
	}
}
