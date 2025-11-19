package sunbeam.assignment2;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.acceptEmployee();
		e1.printEmployee();
		Employee e2 = new Employee();
		e2.acceptEmployee();
		e2.printEmployee();
		
		e1.setSalary(e1.getSalary()*1.1);
		System.out.printf("Salary after 10%% raise for employee %s is %.2f\n", e1.getFirstName(), e1.getSalary());
		e2.setSalary(e2.getSalary()*1.1);
		System.out.printf("Salary after 10%% raise for employee %s is %.2f\n", e2.getFirstName(), e2.getSalary());
	}
}
	
	class Employee{
		private String firstName;
		private String lastName;
		private double monthlySalary; 
		
		
		public Employee(String firstName, String lastName, double salary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.monthlySalary = salary;
		}
		
		public Employee() {
			this.firstName = "";
			this.lastName = "";
			this.monthlySalary = 0.0;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getLastName() {
			return this.lastName;
		}
		
		public void setSalary(double salary) {
			if(this.monthlySalary<0) {
				return;
			}
			this.monthlySalary=salary;
		}
		
		public double getSalary() {
			return this.monthlySalary;
		}
		
		public void acceptEmployee() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first name: ");
			this.firstName = sc.next();
			System.out.println("Enter the last name: ");
			this.lastName = sc.next();
			System.out.println("Enter the monthly salary: ");
			this.monthlySalary = sc.nextDouble();
		}
		
		public void printEmployee() {
			System.out.println("The first name of employee is "+this.firstName);
			System.out.println("The last name of employee is "+this.lastName);
			System.out.println("The monthly salary of the employee is "+this.monthlySalary);
			System.out.println("The annual salary is "+this.monthlySalary*12);
		}
	}
	

