package question1;

class FixedEmployeeStack implements Stack<Employee> {
	private int top = -1;

	Employee[] arr = new Employee[5];
	@Override
	public void push(Employee e) throws RuntimeException{
		if(top == STACK_SIZE - 1) {
			throw new RuntimeException("Stack Overflow");
		}
			arr[++top] = e;
	}
	
	@Override 
	public Employee pop() throws RuntimeException{
		if(top == -1) {
			throw new RuntimeException("Stack Underflow!");
		}
		return arr[top--];
	}
	
	@Override
	public Employee peek() {
		if(top == -1) {
			System.out.println("The Stack is empty");
			return null;
		}
		return arr[top];
	}
	
	@Override
	public boolean isEmpty() {
		if(top == -1) return true;
		else return false;
	}

	public FixedEmployeeStack() {
	}
}
