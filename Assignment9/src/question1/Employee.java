package question1;

import java.util.List;
import java.util.ArrayList;

class Employee{
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}

interface Stack<T>{
	int STACK_SIZE = 10;
	T pop();
	void push(T e); 
	T peek();
	boolean isEmpty();
}

