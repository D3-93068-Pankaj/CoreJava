package corejava;

import java.util.Scanner;

public class DecimalConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal: ");
		int decimal = sc.nextInt();
		System.out.println("The binary equivalent is: "+Integer.toBinaryString(decimal));
		System.out.println("The octal equivalent is: "+Integer.toOctalString(decimal));
		System.out.println("The hexadecimal equivalent is: "+Integer.toHexString(decimal));
	}

}
