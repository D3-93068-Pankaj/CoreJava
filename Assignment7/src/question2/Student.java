package question2;

public class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student() {
		
	}
	
	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return this.roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public double getMarks() {
		return this.marks;
	}
	
	@Override
	public String toString() {
		return String.format("[Roll No: %d, Name: %s, City: %s, Marks: %.2f", this.roll, this.name, this.city, this.marks);
	}
	
	@Override 
	public int compareTo(Student s) {
		return this.roll - s.roll;
	}
}
