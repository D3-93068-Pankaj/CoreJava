package question2;

import java.util.Arrays;

public class Program {
	
	public static Student[] getInstances() {
		Student[] studentArr = new Student[10];
		studentArr[0] = new Student(1, "Amit", "Pune", 80);
		studentArr[1] = new Student(2, "Anil", "Pune", 90);
		studentArr[2] = new Student(3, "Yashraj", "Mumbai", 85);
		studentArr[3] = new Student(4, "Rahul", "Delhi", 92);
		studentArr[4] = new Student(5, "Nidhi", "Delhi", 75);
		studentArr[5] = new Student(6, "Akash", "Pune", 88);
		studentArr[6] = new Student(7, "Gaurav", "Mumbai", 67);
		studentArr[7] = new Student(8, "Harsh", "Mumbai", 70);
		studentArr[8] = new Student(9, "Ankit", "Delhi", 78);
		studentArr[9] = new Student(10, "Aryan", "Pune", 91);
		return studentArr;		
	}

	public static void main(String[] args) {
		Student[] arr = Program.getInstances();
		System.out.println("The elements of array before sorting:");
		for(Student s : arr) {
			System.out.println(s);
		}
		System.out.println();
		Arrays.sort(arr, new StudentComparator());
		System.out.println("The elements of array after sorting:");
		for(Student s : arr) {
			System.out.println(s);
		}
	}

}
