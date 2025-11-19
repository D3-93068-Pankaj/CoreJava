package abc;

import java.util.Scanner;

public class CreditLimitTester {

	public static void main(String[] args) {
		CreditLimitCalculator c = new CreditLimitCalculator();
		CreditLimitCalculator.setAllowedCreditLimit(500);
		c.accept();
		c.display();
	}
}

class CreditLimitCalculator{
	private int accountNumber;
	private int balance;
	private int itemsTotal;
	private int creditsTotal;
	private static int allowedCreditLimit;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setItemsTotal(int itemsTotal) {
		this.itemsTotal = itemsTotal;
	}
	
	public int getItemsTotal() {
		return this.itemsTotal;
	}
	
	public void setCreditsTotal(int creditsTotal) {
		this.creditsTotal = creditsTotal;
	}
	
	public int getCreditsTotal() {
		return this.creditsTotal;
	}
	
	public static void setAllowedCreditLimit(int allowedCreditLimit) {
		CreditLimitCalculator.allowedCreditLimit = allowedCreditLimit;
	}
	
	public int getAllowedCreditLimit() {
		return CreditLimitCalculator.allowedCreditLimit;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		this.accountNumber = sc.nextInt();
		System.out.println("Enter the balance: ");
		this.balance = sc.nextInt();
		System.out.println("Enter the total of items: ");
		this.itemsTotal = sc.nextInt();
		System.out.println("Enter the total credits: ");
		this.creditsTotal = sc.nextInt();
		if(this.creditsTotal>CreditLimitCalculator.allowedCreditLimit) {
			System.out.println("Credit limit exceeded!");
		}
	}
	
	public void display() {
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Balance: "+this.balance);
		System.out.println("Items Total: "+this.itemsTotal);
		System.out.println("Total Credits: "+this.creditsTotal);
		
		int newBalance = this.balance + this.itemsTotal - this.creditsTotal;
		System.out.println("Your Balance: "+this.balance);
	}

}