package question3;

import java.util.*;

public class ReplaceSecondElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("The elements of the current list are: ");
		for(int ele : list) {
			System.out.printf(ele+" ");
		}
		System.out.println();
		System.out.println("Enter the new element: ");
		int ele = sc.nextInt();
		list.set(1, ele);
		System.out.println("List Updated Successfully!");
		System.out.println("The elements of the updated list are: ");
		for(int ele1 : list) {
			System.out.print(ele1+" ");
		}
	}

}
