package question1;

import java.util.Scanner;

public class EmployeeTest {
	public static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		System.out.println("1. Choose Fixed Stack(Size = 5)");
		System.out.println("2. Choose Growable Stack");
		System.out.println("3. Push Employee into Stack");
		System.out.println("4. Pop Employee from Stack");
		System.out.println("5. Exit");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		Stack<Employee> stack = null;
		while((choice = menuList())!=0) {
			try {
				switch(choice) {
				case 1:
				{
					if(stack!=null) {
						System.out.println("Stack cannot be re-initialized");
						break;
					}
					stack = new FixedEmployeeStack();
					System.out.println("Fixed size stack initialized");
					break;
				}
				
				case 2:
				{
					if(stack != null) {
						System.out.println("Stack cannot be re-initialized");
						break;
					}
					stack = new GrowableEmployeeStack();
					System.out.println("Growable size stack initialized");
					break;
					
				}
				
				case 3:
				{
					if(stack == null) {
						System.out.println("No Stack chosen!");
						break;
					}
					int id;
					String name;
					double salary;
					System.out.println("Enter the Id of employee");
					id = sc.nextInt();
					System.out.println("Enter the name of employee");
					name = sc.next();
					System.out.println("Enter the salary of employee");
					salary = sc.nextDouble();
					stack.push(new Employee(id, name, salary));
					break;	
				}
				
				case 4:
				{
					if(stack == null) {
						System.out.println("No Stack Chosen");
						break;
					}
					System.out.println("The Popped element is: " + stack.pop().toString());
					break;
				}
				
				case 5:
				{
					System.out.println("Thankyou");
					System.exit(0);
					break;
				}
				
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
