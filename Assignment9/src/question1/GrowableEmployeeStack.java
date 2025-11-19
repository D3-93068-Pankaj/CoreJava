package question1;

import java.util.ArrayList;
import java.util.List;

public class GrowableEmployeeStack implements Stack<Employee>{
	
	List<Employee> stack = new ArrayList<>();

	@Override
	public Employee pop() {
		if(stack.isEmpty()) {
			System.out.println("Stack Underflow!");
			return null;
		}
		return stack.remove(stack.size() - 1);
	}

	@Override
	public void push(Employee e) {
		stack.add(e);
		System.out.println("Employee pushed successfully");
	}

	@Override
	public Employee peek() {
		if(stack.isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		}
		return stack.get(stack.size() - 1);
	}

	public GrowableEmployeeStack() {
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
