package exceptionhandling;
import java.util.Scanner;

public class StringLengthCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the string: ");
		String str = sc.next();
		System.out.println(stringLengthCalculator(str));
		}
		catch(ExceptionLineTooLong ex) {
			System.out.printf("Error: %s", ex.getMessage());
		}
		finally{
			sc.close();
		}
	}

	public static int stringLengthCalculator(String str) throws ExceptionLineTooLong{
		if(str.length()>80)
			throw new ExceptionLineTooLong(str.length());
		return str.length();
	}
	
	
}
