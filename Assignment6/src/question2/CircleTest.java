package question2;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Circle c1 = new Circle();
			System.out.println("Enter the X-coordinate of the centre: ");
			c1.setX(sc.nextInt());
			System.out.println("Enter the Y-coordinate of the centre: ");
			c1.setY(sc.nextInt());
			System.out.println("Enter the diameter(positive): ");
			c1.setDiameter(sc.nextDouble());			
		}
		catch(DimensionMismatchException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
